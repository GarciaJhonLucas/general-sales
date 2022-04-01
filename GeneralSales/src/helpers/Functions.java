// @author Garcia-Jhon-Lucas on 09/feb/2022
package helpers;

import java.awt.Image;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Functions {
    
    String pass = "123456789";

    // Search DataBase / If he dont have create automaticamente
    public void searchDataBase() {
        
    }
    
    public String encriptId(String id) {
        String sourceString = id;
        char[] p = pass.toCharArray();
        int n = p.length;
        char[] c = sourceString.toCharArray();
        int m = c.length;
        for (int k = 0; k < m; k++) {
            int mima = c[k] + p[k / n];
            c[k] = (char) mima;
        }
        return new String(c);
    }
    
    public int dencriptId(String id) {
        char[] p = pass.toCharArray();
        int n = p.length;
        char[] c = id.toCharArray();
        int m = c.length;
        for (int k = 0; k < m; k++) {
            int mima = c[k] - p[k / n];
            c[k] = (char) mima;
        }
        return Integer.parseInt(Arrays.toString(c));
    }
    
    public String conseguirMAC() {
        StringBuilder sb = new StringBuilder();
        NetworkInterface a;
        try {
            a = NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
            byte[] mac = a.getHardwareAddress();
            
            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
            }
        } catch (IOException e) {
            printErrors(e.toString());
        }
        return "" + sb.toString();
    }
    
    private static void printErrors(String error) {
        System.err.println("============== ERROR ==============");
        System.err.println(error);
        System.err.println("===================================");
    }
    
    public static void printInfoMessages(String info) {
        System.out.println("============== INFO ==============");
        System.out.println(info);
    }
    
    public void addCentered(JInternalFrame jif, JDesktopPane desktop, boolean visible) {
        desktop.add(jif);
        jif.toFront();
        jif.setLocation((desktop.getWidth() - jif.getWidth()) / 2, (desktop.getHeight() - jif.getHeight()) / 2);
        jif.setVisible(visible);
    }
    
    public void paint_images(JLabel label, String route) {
        
        ImageIcon image = new ImageIcon(route);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        label.repaint();
    }
    
    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void hideColumns(JTable table) {
        table.getColumnModel().getColumn(0).setMaxWidth(0);
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getColumnModel().getColumn(0).setPreferredWidth(0);
        table.setFocusable(false);
        for (int i = 0; i < table.getRowCount(); i++) {
            for (int j = 0; j < table.getColumnCount(); j++) {
                table.isCellEditable(i, j);
            }
        }
    }
    
}
