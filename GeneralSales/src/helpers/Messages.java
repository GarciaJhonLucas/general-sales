// @author Garcia-Jhon-Lucas on 09/feb/2022
package helpers;

import java.util.Optional;
import javax.swing.JOptionPane;

public class Messages {

    public static String generalTitle = "General Sales";

    public static void okMessage(String titleMessage, String textMessage) {
        JOptionPane.showInternalMessageDialog(null, textMessage, titleMessage, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void errorMessage(String titleMessage, String textMessage) {
        JOptionPane.showInternalMessageDialog(null, textMessage, titleMessage, JOptionPane.ERROR_MESSAGE);
    }

    public static void alertMessage(String titleMessage, String textMessage) {
        JOptionPane.showInternalMessageDialog(null, textMessage, titleMessage, JOptionPane.WARNING_MESSAGE);
    }

    public static void yesNoOption(Optional<String> titleMessage, String textMessage) {
        JOptionPane.showConfirmDialog(null,
                (titleMessage.isEmpty()) ? generalTitle : titleMessage, textMessage, JOptionPane.YES_NO_OPTION);
    }
}
