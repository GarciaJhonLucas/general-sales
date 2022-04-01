// @author Garcia-Jhon-Lucas on 09/feb/2022
package components;

import helpers.FormWords;
import helpers.Functions;
import helpers.Messages;
import java.awt.Color;

public class BaseInternalForm extends javax.swing.JInternalFrame {

    public static String _titleForm = "General Sales | ";
    public static FormWords _textForm = new FormWords();
    public static Functions _function = new Functions();
    public static Messages _messages = new Messages();

    public BaseInternalForm() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
