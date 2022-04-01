// @author Garcia-Jhon-Lucas on 09/feb/2022
package dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import helpers.Messages;
import helpers.Functions;

public class ConnectionDto {

    Functions _fun = new Functions();

    static Connection con = null;
    static Statement sta = null;
    static ResultSet rst = null;

    static String user = "root";
    static String pass = "";
    static String url = "jdbc:mysql://localhost/simple-store";

    public Connection Connection() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            try {
                con = DriverManager.getConnection(url, user, pass);
                Functions.printInfoMessages("THE CONNECTION WAS ESTABLISHED CORRECTLY");
            } catch (SQLException ex) {
                Messages.alertMessage("Not Connect To MySQL", "Could not connect to sql, datepro will be used instead!!!");
                Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Messages.alertMessage("Not Connect To MySQL", "Driver Error" + ex);
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
