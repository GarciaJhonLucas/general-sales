// @author Garcia-Jhon-Lucas on 31/Mar/2022
package logic;

import dto.ConnectionDto;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LoginLogic {

    private final ConnectionDto mysql = new ConnectionDto();
    private final Connection conn = mysql.Connection();
    private String SQL = "";
    public Integer total_records;
    public Integer total_investment;

    public DefaultTableModel acceso(String user, String pass) {
        DefaultTableModel tableModel;

        String[] titulos = {"ID", "User", "Pass", "Status"};
        String[] record = new String[3];
        total_records = 0;
        tableModel = new DefaultTableModel(null, titulos);

        SQL = "Select * from users where user='" + user + "' and pass='" + pass + "'";
        //SQL = "{CALL getLogin()}";
        try {
            //CallableStatement cs = (CallableStatement) mysql.Connection().prepareCall(SQL);
            //ResultSet rs = cs.executeQuery();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                record[0] = rs.getString("id");
                record[1] = rs.getString("user");
                record[2] = rs.getString("pass");
                total_records += 1;
                tableModel.addRow(record);
            }
            return tableModel;

        } catch (SQLException e) {

            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

}
