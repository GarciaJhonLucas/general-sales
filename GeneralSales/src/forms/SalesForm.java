// @author Garcia-Jhon-Lucas on 31/Mar/2022
package forms;

import components.BaseInternalForm;
import entity.SalesEntity;
import entity.SalesDetailEntity;
import helpers.Messages;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import logic.SalesLogic;

public class SalesForm extends BaseInternalForm {

    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static String idForm = "";
    DefaultTableModel model = new DefaultTableModel();
    String[] titles = {"ID", "Name", "Cant", "Price"};
    String[] register = new String[9];

    public SalesForm() {
        initComponents();
        start();
    }

    private void start() {
        this.labelTitle.setText(_textForm.salesForm);
        buttonSave.setText(_textForm.salesTextButton);
        buttonCancel.setText(_textForm.cancelTextButton);
        buttonList.setText(_textForm.listTextButton);
        buttonAdd.setText(_textForm.addTextButton);
        textBoxTotal.setEditable(false);
        textBoxName.setEditable(false);
        textBoxPrice.setEditable(false);
        model = new DefaultTableModel(null, titles);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        textBoxTotal = new javax.swing.JTextField();
        buttonCancel = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        buttonList = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textBoxName = new javax.swing.JTextField();
        textBoxPrice = new javax.swing.JTextField();
        textBoxCant = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();

        labelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitle.setText("TITLE");

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
        jScrollPane1.setViewportView(tableProducts);

        buttonCancel.setText("Button");

        buttonSave.setText("Button");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonList.setText("Button");
        buttonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListActionPerformed(evt);
            }
        });

        dateChooser.setDateFormatString("dd/MM/yyyy");

        jLabel2.setText("Date:");

        jLabel3.setText("Total: ");

        buttonAdd.setText("Button");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textBoxName, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBoxPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBoxCant, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonList, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCancel))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTitle)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addComponent(textBoxTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelTitle)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBoxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBoxPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBoxCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textBoxTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(buttonAdd))
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel)
                    .addComponent(buttonSave))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListActionPerformed
        AddSalesProductsForm _form = new AddSalesProductsForm();
        _function.addCentered(_form, MainForm.desktopPanel, true);
    }//GEN-LAST:event_buttonListActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        if (textBoxName.getText().length() == 0) {
            Messages.alertMessage("SALES", "PLEASE SELECT A PRODUCT, DON'T BE IDIOT, PRESS ENTER");
            buttonList.requestFocus();
            return;
        }

        for (int i = 0; i < model.getRowCount(); i++) {
            if (idForm.equals(tableProducts.getValueAt(i, 0).toString())) {
                Messages.alertMessage("ADD PRODUCT", "THERE IS ALREADY ONE LIKE IT, ADD ANOTHER ONE, DON'T BE A FOOL.");
                return;
            }
        }

        if (textBoxCant.getText().isEmpty()) {
            Messages.alertMessage("ADD PRODUCT", "YOU CAN ADD AN AMOUNT");
            return;
        }
        SalesLogic func = new SalesLogic();
        int cantActual = func.checkCant(Integer.parseInt(idForm));

        if (cantActual < Integer.parseInt(textBoxCant.getText())) {
            Messages.alertMessage("ADD PRODUCT", "HEY BRO, CAN'T YOU ADD MORE PRODUCTS THAN YOU HAVE?");
            return;
        }

        double totalPrice = 0;
        double price = Double.parseDouble(textBoxPrice.getText()) * Integer.parseInt(textBoxCant.getText());
        register[0] = idForm;
        register[1] = textBoxName.getText();
        register[2] = textBoxCant.getText();
        register[3] = (price + "");
        model.addRow(register);
        tableProducts.setModel(model);

        _function.hideColumns(tableProducts);
        for (int i = 0; i < tableProducts.getRowCount(); i++) {
            totalPrice += Double.parseDouble(tableProducts.getValueAt(i, 3).toString());
        }

        textBoxTotal.setText(totalPrice + "");
        textBoxName.setText("");
        textBoxPrice.setText("");
        textBoxCant.setText("");
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        if (tableProducts.getRowCount() == 0) {
            return;
        }
        int idSales;
        boolean itsOk = false;
        SalesEntity dts = new SalesEntity();
        SalesDetailEntity dtsales = new SalesDetailEntity();
        SalesLogic func = new SalesLogic();

        String date = dateFormat.format(dateChooser.getDate());
        dts.setDate(date);
        dts.setTotal(Double.parseDouble(textBoxTotal.getText()));
        dts.setStatus(true);

        if (func.insertSales(dts)) {
            idSales = func.getLastId();
        } else {
            Messages.alertMessage("ERROR SALES", "UPS, CAN'T COMPLETE ACTION");
            return;
        }

        // DETAILS
        for (int i = 0; i < tableProducts.getRowCount(); i++) {
            dtsales.setSales_id(idSales);
            dtsales.setProduct_id(Integer.parseInt(tableProducts.getValueAt(i, 0).toString()));
            dtsales.setCant(Integer.parseInt(tableProducts.getValueAt(i, 2).toString()));
            dtsales.setTotal(Double.parseDouble(tableProducts.getValueAt(i, 3).toString()));
            itsOk = func.insertSalesDetails(dtsales);
        }

        if (itsOk) {
            Messages.okMessage("SALES", "HEY YOU HAVE A SALES");
            dateChooser.cleanup();
            textBoxTotal.setText("");
            textBoxName.setText("");
            textBoxPrice.setText("");
            textBoxCant.setText("");
            model = new DefaultTableModel();
            tableProducts.setModel(model);
        }

    }//GEN-LAST:event_buttonSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonList;
    private javax.swing.JButton buttonSave;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTable tableProducts;
    private javax.swing.JTextField textBoxCant;
    public static javax.swing.JTextField textBoxName;
    public static javax.swing.JTextField textBoxPrice;
    private javax.swing.JTextField textBoxTotal;
    // End of variables declaration//GEN-END:variables
}
