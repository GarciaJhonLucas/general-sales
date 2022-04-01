package forms;

import components.BaseInternalForm;
import static components.BaseInternalForm._function;
import helpers.Messages;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import logic.ProductsLogic;

public class AddSalesProductsForm extends BaseInternalForm {

    String id = "";

    public AddSalesProductsForm() {
        initComponents();
        startForm();
        showAllProducts("");
    }

    private void startForm() {
        buttonSearch.setText(_textForm.searchTextButton);
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

    private void sendProductsDetails() {

        int fila = tableProducts.getSelectedRow();
        String id;
        String name;
        String precio;

        id = tableProducts.getValueAt(fila, 0).toString();
        name = tableProducts.getValueAt(fila, 1).toString();
        precio = tableProducts.getValueAt(fila, 4).toString();
        
        SalesForm.idForm = id;
        SalesForm.textBoxName.setText(name);
        SalesForm.textBoxPrice.setText(precio);
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        textBoxSearch = new javax.swing.JTextField();
        labelTitle = new javax.swing.JLabel();
        buttonSearch = new javax.swing.JButton();

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableProductsMousePressed(evt);
            }
        });
        tableProducts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableProductsKeyPressed(evt);
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

        buttonSearch.setText("Button");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(textBoxSearch)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonSearch))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelTitle)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textBoxSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBoxSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            showAllProducts(textBoxSearch.getText());
        }
    }//GEN-LAST:event_textBoxSearchKeyPressed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        showAllProducts(textBoxSearch.getText());
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void tableProductsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductsMousePressed
        if (evt.getClickCount() == 2) {
            sendProductsDetails();
        }
    }//GEN-LAST:event_tableProductsMousePressed

    private void tableProductsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableProductsKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            sendProductsDetails();
        }
    }//GEN-LAST:event_tableProductsKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTable tableProducts;
    private javax.swing.JTextField textBoxSearch;
    // End of variables declaration//GEN-END:variables
}
