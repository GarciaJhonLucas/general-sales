// @author Garcia-Jhon-Lucas on 09/feb/2022
package helpers;

import java.awt.Image;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class Functions {

    // Search DataBase / If he dont have create automaticamente
    public void searchDataBase() {
        
    }

    public String encriptId(int id) {
        return "";
    }

    public int dencriptId(String id) {
        return 0;
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

    public void addCentered(JInternalFrame jif, JDesktopPane desktop) {
        desktop.add(jif);
        jif.setLocation((desktop.getWidth() - jif.getWidth()) / 2, (desktop.getHeight() - jif.getHeight()) / 2);
        jif.setVisible(true);
    }

    public void paint_images(JLabel label, String route) {

        ImageIcon image = new ImageIcon(route);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        label.repaint();
    }
}
