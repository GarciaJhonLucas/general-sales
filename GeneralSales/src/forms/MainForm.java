// @author Garcia-Jhon-Lucas on 09/feb/2022
package forms;

import components.BaseForm;
import java.awt.Dimension;
import java.awt.Toolkit;

public class MainForm extends BaseForm {

    public MainForm() {
        initComponents();
        startForm();
    }

    private void startForm() {
        this.setTitle(_titleForm + _textForm.titleConfigForm);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        this.setLocationRelativeTo(this);
        this.setVisible(true);

        // Menu Items
        this.menuItemFile.setText(_textForm.menuItemFileText);
        this.menuItemAddProduct.setText(_textForm.menuItemAddProductText);
        this.menuItemAddCant.setText(_textForm.menuItemAddCantText);
        this.menuItemAddSales.setText(_textForm.menuItemSalesText);
        this.menuProducts.setText(_textForm.menuProductsText);
        this.menuSales.setText(_textForm.menuSalesText);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPanel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemFile = new javax.swing.JMenuItem();
        menuProducts = new javax.swing.JMenu();
        menuItemAddProduct = new javax.swing.JMenuItem();
        menuItemAddCant = new javax.swing.JMenuItem();
        menuSales = new javax.swing.JMenu();
        menuItemAddSales = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopPanelLayout = new javax.swing.GroupLayout(desktopPanel);
        desktopPanel.setLayout(desktopPanelLayout);
        desktopPanelLayout.setHorizontalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
        );
        desktopPanelLayout.setVerticalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        menuItemFile.setText("Info");
        menuItemFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFileActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemFile);

        jMenuBar1.add(jMenu1);

        menuProducts.setText("Products");

        menuItemAddProduct.setText("Add Products");
        menuItemAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddProductActionPerformed(evt);
            }
        });
        menuProducts.add(menuItemAddProduct);

        menuItemAddCant.setText("Add Cant");
        menuItemAddCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddCantActionPerformed(evt);
            }
        });
        menuProducts.add(menuItemAddCant);

        jMenuBar1.add(menuProducts);

        menuSales.setText("Sales");

        menuItemAddSales.setText("Add Sales");
        menuItemAddSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddSalesActionPerformed(evt);
            }
        });
        menuSales.add(menuItemAddSales);

        jMenuBar1.add(menuSales);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFileActionPerformed
        AboutForm _form = new AboutForm();
        _function.addCentered(_form, desktopPanel);
    }//GEN-LAST:event_menuItemFileActionPerformed

    private void menuItemAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddProductActionPerformed
        ProductsForm _form = new ProductsForm();
        _function.addCentered(_form, desktopPanel);
    }//GEN-LAST:event_menuItemAddProductActionPerformed

    private void menuItemAddCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddCantActionPerformed
        AddCantForm _form = new AddCantForm();
        _function.addCentered(_form, desktopPanel);
    }//GEN-LAST:event_menuItemAddCantActionPerformed

    private void menuItemAddSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddSalesActionPerformed
        AddSalesForm _form = new AddSalesForm();
        _function.addCentered(_form, desktopPanel);
    }//GEN-LAST:event_menuItemAddSalesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuItemAddCant;
    private javax.swing.JMenuItem menuItemAddProduct;
    private javax.swing.JMenuItem menuItemAddSales;
    private javax.swing.JMenuItem menuItemFile;
    private javax.swing.JMenu menuProducts;
    private javax.swing.JMenu menuSales;
    // End of variables declaration//GEN-END:variables
}
