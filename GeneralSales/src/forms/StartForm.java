// @author Garcia-Jhon-Lucas on 01/apr/2022
package forms;

import helpers.Messages;
import logic.LoginLogic;
import entity.UserEntity;
import components.BaseForm;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

public class StartForm extends BaseForm {

    public StartForm() {
        initComponents();
        startForm();
    }

    private void startForm() {
        setTitle(_titleForm + _textForm.titleLoginForm);

        // Labels
        labelUserName.setText(_textForm.labelTextUserName);
        labelUserPass.setText(_textForm.labelTextUserPass);
        labelTitleForm.setText(_textForm.titleLoginForm);

        // Buttons
        buttonOk.setText(_textForm.okTextButton);
        buttonCancel.setText(_textForm.cancelTextButton);

        // ToolTip
        textboxUserName.setToolTipText(_textForm.toolTipUserText);
        textboxUserPass.setToolTipText(_textForm.toolTipPassText);
        labelLoginImage.setToolTipText(_textForm.toolTipLabelImage);

        // Paint
        _function.paint_images(labelLoginImage, "src/images/logo.jpg");
        textboxUserName.setFocusable(true);
        textboxUserPass.setFocusable(true);
    }

    private void login() {
        try {
            DefaultTableModel modelo;
            LoginLogic func = new LoginLogic();
            UserEntity dts = new UserEntity();

            dts.setUserName(textboxUserName.getText());
            dts.setUserPass(textboxUserPass.getText());

            modelo = func.acceso(dts.getUserName(), dts.getUserPass());
            hidenTable.setModel(modelo);

            if (func.total_records > 0) {
                this.dispose();
                MainForm form = new MainForm();
                form.toFront();
                form.setVisible(true);
            } else {
                Messages.errorMessage("User cannot log in", "Access Denied");
            }
        } catch (HeadlessException e) {
            Messages.errorMessage("ERROR", e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitleForm = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        labelUserPass = new javax.swing.JLabel();
        textboxUserName = new javax.swing.JTextField();
        textboxUserPass = new javax.swing.JPasswordField();
        buttonOk = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        labelLoginImage = new javax.swing.JLabel();
        hidenTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitleForm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitleForm.setText("TitleForm");
        labelTitleForm.setFocusable(false);

        labelUserName.setText("jLabel1");
        labelUserName.setFocusable(false);

        labelUserPass.setText("jLabel2");
        labelUserPass.setFocusable(false);

        textboxUserPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textboxUserPassKeyPressed(evt);
            }
        });

        buttonOk.setText("Button");
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });

        buttonCancel.setText("Button");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        labelLoginImage.setBackground(new java.awt.Color(0, 102, 102));
        labelLoginImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelLoginImage.setFocusable(false);
        labelLoginImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        hidenTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        hidenTable.setToolTipText("");
        hidenTable.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitleForm)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelUserPass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textboxUserPass))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelUserName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textboxUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))))
                .addGap(10, 10, 10)
                .addComponent(labelLoginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(146, 146, 146)
                    .addComponent(hidenTable, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(146, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelLoginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitleForm)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUserName)
                            .addComponent(textboxUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUserPass)
                            .addComponent(textboxUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonOk)
                            .addComponent(buttonCancel))))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(hidenTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
        login();
    }//GEN-LAST:event_buttonOkActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void textboxUserPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textboxUserPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_textboxUserPassKeyPressed

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
            java.util.logging.Logger.getLogger(StartForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonOk;
    private javax.swing.JTable hidenTable;
    private javax.swing.JLabel labelLoginImage;
    private javax.swing.JLabel labelTitleForm;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JLabel labelUserPass;
    private javax.swing.JTextField textboxUserName;
    private javax.swing.JPasswordField textboxUserPass;
    // End of variables declaration//GEN-END:variables
}
