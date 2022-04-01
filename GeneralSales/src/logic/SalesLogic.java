// @author Garcia-Jhon-Lucas on 01/Apr/2022
package logic;

import dto.ConnectionDto;
import entity.ProductEntity;
import entity.SalesDetailEntity;
import entity.SalesEntity;
import helpers.Messages;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SalesLogic {

    private final ConnectionDto mysql = new ConnectionDto();
    private final Connection conn = mysql.Connection();
    private String SQL = "";
    public Integer total_records;
    public Integer total_investment;

    public boolean insertSales(SalesEntity _sales) {
        SQL = "INSERT INTO sales (date, total, status ) values (?,?,?)";

        try {
            PreparedStatement pst = conn.prepareStatement(SQL);
            String date = _sales.getDate();
            pst.setString(1, date);
            pst.setDouble(2, _sales.getTotal());
            pst.setBoolean(3, _sales.isStatus());

            int n = pst.executeUpdate();
            return (n != 0);

        } catch (SQLException e) {
            Messages.errorMessage("INSERT SALES", e.getMessage());
            return false;
        }
    }

    public boolean insertSalesDetails(SalesDetailEntity _sales) {
        SQL = "INSERT INTO sales_detail (sales_id, product_id, cant, total) values (?,?,?,?)";

        try {
            PreparedStatement pst = conn.prepareStatement(SQL);
            pst.setInt(1, _sales.getSales_id());
            pst.setInt(2, _sales.getProduct_id());
            pst.setInt(3, _sales.getCant());
            pst.setDouble(4, _sales.getTotal());
            int n = pst.executeUpdate();

            int cantActual = checkCant(_sales.product_id);
            int newCant = cantActual - _sales.cant;
            reduceProducts(_sales.product_id, newCant);

            return (n != 0);
        } catch (SQLException e) {
            Messages.errorMessage("INSERT SALES DETAIL", e.getMessage());
            return false;
        }
    }

    public int getLastId() {
        SQL = "SELECT MAX(id) AS id FROM sales";
        int lastId = 0;
        try {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                lastId = Integer.parseInt(rs.getString("id"));
            }
            return lastId;
        } catch (SQLException e) {
            Messages.errorMessage("SALES GET ID", e.getMessage());
            return 0;
        }
    }

    public boolean reduceProducts(int id, int cant) {
        SQL = "UPDATE products set stock=? WHERE id=?";

        try {
            PreparedStatement pst = conn.prepareStatement(SQL);
            pst.setInt(1, cant);
            pst.setInt(2, id);

            int n = pst.executeUpdate();
            return (n != 0);

        } catch (SQLException e) {
            Messages.errorMessage("REDUCE PRODUCTS", e.getMessage());
            return false;
        }
    }

    public int checkCant(int id) {
        SQL = "SELECT stock AS id FROM products WHERE id=" + id;
        int lastId = 0;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                lastId = Integer.parseInt(rs.getString("id"));
            }
            return lastId;
        } catch (SQLException e) {
            Messages.errorMessage("SALES GET ID", e.getMessage());
            return 0;
        }
    }

}
