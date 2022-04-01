// @author Garcia-Jhon-Lucas on 01/Apr/2022
package logic;

import dto.ConnectionDto;
import entity.ProductEntity;
import helpers.Messages;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ProductsLogic {

    private final ConnectionDto mysql = new ConnectionDto();
    private final Connection conn = mysql.Connection();
    private String SQL = "";
    public Integer total_records;
    public Integer total_investment;

    public DefaultTableModel showProducts(String _search) {
        DefaultTableModel model;
        String[] titles = {"ID", "Name", "Description", "Cost", "Price", "Stock", "", "", "Status"};
        String[] register = new String[9];
        total_records = 0;

        model = new DefaultTableModel(null, titles);
        SQL = "SELECT * FROM products WHERE name LIKE'%" + _search + "%' AND status=1 ORDER BY name";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                register[0] = rs.getString("id");
                register[1] = rs.getString("name");
                register[2] = rs.getString("description");
                register[3] = rs.getString("cost");
                register[4] = rs.getString("price");
                register[5] = rs.getString("stock");
                register[6] = rs.getString("category");
                register[7] = rs.getString("supplier");
                register[8] = rs.getString("status");

                total_records += 1;
                model.addRow(register);
            }
            return model;

        } catch (SQLException e) {
            Messages.errorMessage("SHOW PRODUCTS", e.getMessage());
            return null;
        }
    }

    public boolean insertProducts(ProductEntity _product) {
        SQL = "INSERT INTO products (name, description, cost, price, stock, category, supplier, status ) values (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = conn.prepareStatement(SQL);
            pst.setString(1, _product.getName());
            pst.setString(2, _product.getDescription());
            pst.setDouble(3, _product.getCost());
            pst.setDouble(4, _product.getPrice());
            pst.setInt(5, _product.getStock());
            pst.setInt(6, _product.getCategory());
            pst.setInt(7, _product.getSupplier());
            pst.setBoolean(8, _product.isStatus());

            int n = pst.executeUpdate();
            return (n != 0);

        } catch (SQLException e) {
            Messages.errorMessage("INSERT PRODUCTS", e.getMessage());
            return false;
        }
    }

    public boolean updateProducts(ProductEntity _product) {
        SQL = "UPDATE products set name=?, description=?, cost=?, price=?, category=?, supplier=?, status=? WHERE id=?";

        try {
            PreparedStatement pst = conn.prepareStatement(SQL);
            pst.setString(1, _product.getName());
            pst.setString(2, _product.getDescription());
            pst.setDouble(3, _product.getCost());
            pst.setDouble(4, _product.getPrice());
            pst.setInt(5, _product.getCategory());
            pst.setInt(6, _product.getSupplier());
            pst.setBoolean(7, _product.isStatus());
            pst.setInt(8, _product.getId());

            int n = pst.executeUpdate();
            return (n != 0);

        } catch (SQLException e) {
            Messages.errorMessage("UPDATE PRODUCTS", e.getMessage());
            return false;
        }
    }

    public boolean addCantProducts(ProductEntity _product){
        SQL = "UPDATE products set stock=? WHERE id=?";

        try {
            PreparedStatement pst = conn.prepareStatement(SQL);
            pst.setInt(1, _product.getStock());
            pst.setInt(2, _product.getId());

            int n = pst.executeUpdate();
            return (n != 0);

        } catch (SQLException e) {
            Messages.errorMessage("ADD CANT PRODUCTS", e.getMessage());
            return false;
        }
    }
    
}
