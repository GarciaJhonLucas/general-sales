// @author Garcia-Jhon-Lucas on 31/Mar/2022
package forms;

import components.BaseInternalForm;
import static components.BaseInternalForm._function;
import entity.ProductEntity;
import helpers.Messages;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import logic.ProductsLogic;

public class AddCantProductsForm extends BaseInternalForm {

    String id = "";
    int cantProducts = 0;

    public AddCantProductsForm() {
        initComponents();
        startForm();
        showAllProducts("");
    }

    private void startForm() {
        buttonSearch.setText(_textForm.searchTextButton);
        buttonAdd.setText(_textForm.addTextButton);
        labelTitle.setText(_textForm.addProductsForm);
    }

    private void showAllProducts(String _search) {
        try {
            DefaultTableModel model;
            ProductsLogic func = new ProductsLogic();
            model = func.showProducts(_search);

            tableProducts.setModel(model);
            _function.hideColumns(tableProducts);
            configTable();
            labelTotalRecords.setText("TOTAL: " + Integer.toString(func.total_records));

        } catch (Exception e) {
            Messages.alertMessage("ERROR SHOW PRODUCTS", e.toString());
        }
    }

    private void configTable() {
        tableProducts.getColumnModel().getColumn(6).setMaxWidth(0);
        tableProducts.getColumnModel().getColumn(6).setMinWidth(0);
        tableProducts.getColumnModel().getColumn(6).setPreferredWidth(0);
        tableProducts.getColumnModel().getColumn(7).setMaxWidth(0);
        tableProducts.getColumnModel().getColumn(7).setMinWidth(0);
        tableProducts.getColumnModel().getColumn(7).setPreferredWidth(0);
        tableProducts.getColumnModel().getColumn(8).setMaxWidth(0);
        tableProducts.getColumnModel().getColumn(8).setMinWidth(0);
        tableProducts.getColumnModel().getColumn(8).setPreferredWidth(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonSearch = new javax.swing.JButton();
        spinnerStock = new javax.swing.JSpinner();
        buttonAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        textBoxSearch = new javax.swing.JTextField();
        labelTitle = new javax.swing.JLabel();
        labelTotalRecords = new javax.swing.JLabel();

        buttonSearch.setText("Button");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        buttonAdd.setText("Button");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        tableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProducts);

        textBoxSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textBoxSearchKeyPressed(evt);
            }
        });

        labelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitle.setText("TITLE");

        labelTotalRecords.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSearch)
                                .addGap(10, 10, 10)
                                .addComponent(spinnerStock, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(buttonAdd)))
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTotalRecords)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle)
                    .addComponent(labelTotalRecords))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch)
                    .addComponent(spinnerStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdd))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        showAllProducts(textBoxSearch.getText());
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        ProductEntity dts = new ProductEntity();
        ProductsLogic func = new ProductsLogic();

        dts.setId(Integer.parseInt(id));
        cantProducts += Integer.parseInt(spinnerStock.getValue().toString());
        dts.setStock(cantProducts);

        if (func.addCantProducts(dts)) {
            Messages.okMessage("ADD PRODUCTS", "AMOUNT ADDED CORRECTLY");
            showAllProducts("");
        }
        textBoxSearch.setText("");
        spinnerStock.setValue(0);
    }//GEN-LAST:event_buttonAddActionPerformed

    private void textBoxSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBoxSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            showAllProducts(textBoxSearch.getText());
        }
    }//GEN-LAST:event_textBoxSearchKeyPressed

    private void tableProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductsMouseClicked
        int tableRow = tableProducts.rowAtPoint(evt.getPoint());
        id = tableProducts.getValueAt(tableRow, 0).toString();
        cantProducts = Integer.parseInt(tableProducts.getValueAt(tableRow, 5).toString());
    }//GEN-LAST:event_tableProductsMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTotalRecords;
    private javax.swing.JSpinner spinnerStock;
    private javax.swing.JTable tableProducts;
    private javax.swing.JTextField textBoxSearch;
    // End of variables declaration//GEN-END:variables
}
