// @author Garcia-Jhon-Lucas on 31/Mar/2022
package forms;

import components.BaseInternalForm;
import entity.ProductEntity;
import helpers.Messages;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import logic.ProductsLogic;

public class ProductsForm extends BaseInternalForm {

    String action = "";

    public ProductsForm() {
        initComponents();
        startForm();
        showAllProducts("");
        setDefaultData();
        controls(false);
        saveButtonControl();
    }

    private void startForm() {
        this.labelTitle.setText(_textForm.titleProductsForm);
        buttonNew.setText(_textForm.newTextButton);
        buttonSave.setText(_textForm.saveTextButton);
        buttonEdit.setText(_textForm.editTextButton);
        buttonCancel.setText(_textForm.cancelTextButton);
        buttonSearch.setText(_textForm.searchTextButton);
        textBoxName.requestFocus();
        labelCode.setForeground(Color.WHITE);
    }

    private void setDefaultData() {
        comboBoxCategory.addItem("Gaseosas");
        comboBoxCategory.addItem("Aceites");
        comboBoxCategory.addItem("Galletas");
        comboBoxCategory.addItem("Limpieza");
        comboBoxCategory.addItem("Jaboneras");

        comboBoxSupplier.addItem("CocaCola");
        comboBoxSupplier.addItem("InkaCola");
        comboBoxSupplier.addItem("Marcella");
        comboBoxSupplier.addItem("ACE");
        comboBoxSupplier.addItem("Palmolive");
        comboBoxSupplier.addItem("CIL");
        comboBoxSupplier.addItem("Cocinero");
        comboBoxSupplier.addItem("Rellenitas");
        comboBoxSupplier.addItem("OREO");
    }

    private void cleanControls() {
        textBoxName.setText("");
        textBoxPrice.setText("");
        textBoxCost.setText("");
        textBoxDescription.setText("");
        spinnerStock.setValue(0);
        checkBoxStatus.setSelected(true);
        comboBoxCategory.setSelectedIndex(0);
        comboBoxSupplier.setSelectedIndex(0);
    }

    private void controls(boolean value) {
        textBoxName.setEnabled(value);
        textBoxPrice.setEnabled(value);
        textBoxCost.setEnabled(value);
        textBoxDescription.setEnabled(value);
        spinnerStock.setEnabled(value);
        comboBoxCategory.setEnabled(value);
        comboBoxSupplier.setEnabled(value);
        checkBoxStatus.setEnabled(value);
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

    private boolean validateControls() {
        if (textBoxName.getText().length() == 0) {
            Messages.alertMessage("PRODUCTS", "Insert product name");
            textBoxName.requestFocus();
            return false;
        }
        if (textBoxDescription.getText().length() == 0) {
            Messages.alertMessage("PRODUCTS", "Insert product name");
            textBoxDescription.requestFocus();
            return false;
        }
        if (textBoxPrice.getText().length() == 0) {
            Messages.alertMessage("PRODUCTS", "Insert product name");
            textBoxPrice.requestFocus();
            return false;
        }
        if (textBoxCost.getText().length() == 0) {
            Messages.alertMessage("PRODUCTS", "Insert product name");
            textBoxCost.requestFocus();
            return false;
        }
        return true;
    }

    private void saveButtonControl() {
        buttonNew.setEnabled(true);
        buttonEdit.setEnabled(true);
        buttonCancel.setEnabled(false);
        buttonSave.setEnabled(false);
        buttonSearch.setEnabled(true);
    }

    private void cancelButtonControl() {
        buttonNew.setEnabled(false);
        buttonEdit.setEnabled(false);
        buttonCancel.setEnabled(true);
        buttonSave.setEnabled(true);
        buttonSearch.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        textBoxName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textBoxDescription = new javax.swing.JTextArea();
        textBoxCost = new javax.swing.JTextField();
        textBoxPrice = new javax.swing.JTextField();
        comboBoxCategory = new javax.swing.JComboBox<>();
        comboBoxSupplier = new javax.swing.JComboBox<>();
        checkBoxStatus = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spinnerStock = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonNew = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        labelTotalRecords = new javax.swing.JLabel();
        labelCode = new javax.swing.JLabel();
        textBoxSearch = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();

        labelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitle.setText("TITLE");

        textBoxDescription.setColumns(20);
        textBoxDescription.setRows(5);
        jScrollPane1.setViewportView(textBoxDescription);

        checkBoxStatus.setSelected(true);
        checkBoxStatus.setText("Status");

        jLabel2.setText("Name");

        jLabel3.setText("Description");

        jLabel4.setText("Cost:");

        jLabel5.setText("Price:");

        jLabel6.setText("Stock:");

        jLabel7.setText("Category:");

        jLabel8.setText("Supplier:");

        buttonNew.setText("Button");
        buttonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewActionPerformed(evt);
            }
        });

        buttonSave.setText("Button");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonEdit.setText("Button");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonCancel.setText("Button");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
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
        jScrollPane2.setViewportView(tableProducts);

        labelTotalRecords.setText("Total");

        labelCode.setText("000000");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(197, 197, 197))
                                    .addComponent(jScrollPane1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel6)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel5)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spinnerStock)
                                            .addComponent(textBoxPrice)
                                            .addComponent(textBoxCost)
                                            .addComponent(comboBoxSupplier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkBoxStatus))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTotalRecords)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonNew)
                                .addGap(5, 5, 5)
                                .addComponent(buttonSave)
                                .addGap(5, 5, 5)
                                .addComponent(buttonEdit)
                                .addGap(5, 5, 5)
                                .addComponent(buttonCancel))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textBoxSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSearch))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textBoxName, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 413, Short.MAX_VALUE)
                .addComponent(labelCode)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle)
                    .addComponent(labelCode))
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textBoxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(textBoxCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textBoxPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(spinnerStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(comboBoxSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(comboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(checkBoxStatus)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonNew)
                        .addComponent(labelTotalRecords))
                    .addComponent(buttonSave)
                    .addComponent(buttonEdit)
                    .addComponent(buttonCancel))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewActionPerformed
        controls(true);
        cleanControls();
        cancelButtonControl();
        buttonSave.setText(_textForm.saveTextButton);
        action = "S";
    }//GEN-LAST:event_buttonNewActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        if (!validateControls()) {
            return;
        }
        saveButtonControl();
        ProductEntity dts = new ProductEntity();
        ProductsLogic func = new ProductsLogic();

        dts.setId(Integer.parseInt(labelCode.getText()));
        dts.setName(textBoxName.getText());
        dts.setDescription(textBoxDescription.getText());
        dts.setCost(Double.parseDouble(textBoxCost.getText()));
        dts.setPrice(Double.parseDouble(textBoxPrice.getText()));
        dts.setStock(Integer.parseInt(spinnerStock.getValue().toString()));
        dts.setCategory(comboBoxCategory.getSelectedIndex());
        dts.setSupplier(comboBoxSupplier.getSelectedIndex());
        dts.setStatus(checkBoxStatus.isSelected());

        if (action.equals("S")) {
            if (func.insertProducts(dts)) {
                Messages.okMessage("PRODUCTS", "INSERT OK");
                showAllProducts("");
                controls(false);
            }
        } else if (action.equals("E")) {
            dts.setId(Integer.parseInt(labelCode.getText()));
            if (func.updateProducts(dts)) {
                Messages.okMessage("PRODUCTS", "UPDATE OK");
                showAllProducts("");
                controls(false);
            }
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        action = "E";
        controls(true);
        cancelButtonControl();
        buttonSave.setText(_textForm.updateTextButton);
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        cleanControls();
        controls(false);
        saveButtonControl();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        showAllProducts(textBoxSearch.getText());
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void tableProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductsMouseClicked
        action = "E";
        int tableRow = tableProducts.rowAtPoint(evt.getPoint());

        String id = tableProducts.getValueAt(tableRow, 0).toString();
        labelCode.setText(id);
        textBoxName.setText(tableProducts.getValueAt(tableRow, 1).toString());
        textBoxDescription.setText(tableProducts.getValueAt(tableRow, 2).toString());
        textBoxCost.setText(tableProducts.getValueAt(tableRow, 3).toString());
        textBoxPrice.setText(tableProducts.getValueAt(tableRow, 4).toString());
        spinnerStock.setValue(Integer.parseInt(tableProducts.getValueAt(tableRow, 5).toString()));
        comboBoxCategory.setSelectedIndex(Integer.parseInt(tableProducts.getValueAt(tableRow, 6).toString()));
        comboBoxSupplier.setSelectedIndex(Integer.parseInt(tableProducts.getValueAt(tableRow, 7).toString()));
        String dato = tableProducts.getValueAt(tableRow, 8).toString();
        checkBoxStatus.setSelected(!Boolean.parseBoolean(dato));
    }//GEN-LAST:event_tableProductsMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonNew;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JCheckBox checkBoxStatus;
    private javax.swing.JComboBox<String> comboBoxCategory;
    private javax.swing.JComboBox<String> comboBoxSupplier;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCode;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTotalRecords;
    private javax.swing.JSpinner spinnerStock;
    private javax.swing.JTable tableProducts;
    private javax.swing.JTextField textBoxCost;
    private javax.swing.JTextArea textBoxDescription;
    private javax.swing.JTextField textBoxName;
    private javax.swing.JTextField textBoxPrice;
    private javax.swing.JTextField textBoxSearch;
    // End of variables declaration//GEN-END:variables
}
