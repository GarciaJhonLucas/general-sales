// @author Garcia-Jhon-Lucas on 09/feb/2022
package helpers;

import java.util.Optional;
import javax.swing.JOptionPane;

public class Messages {

    public static String generalTitle = "General Sales";

    public static void okMessage(Optional<String> titleMessage, String textMessage) {
        JOptionPane.showInternalMessageDialog(null, (titleMessage.isEmpty()) ? generalTitle : titleMessage, textMessage, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void errorMessage(Optional<String> titleMessage, String textMessage) {
        JOptionPane.showInternalMessageDialog(null, (titleMessage.isEmpty()) ? generalTitle : titleMessage, textMessage, JOptionPane.ERROR_MESSAGE);
    }

    public static void alertMessage(Optional<String> titleMessage, String textMessage) {
        JOptionPane.showInternalMessageDialog(null, (titleMessage.isEmpty()) ? generalTitle : titleMessage, textMessage, JOptionPane.WARNING_MESSAGE);
    }

    public static void yesNoOption(Optional<String> titleMessage, String textMessage) {
        JOptionPane.showConfirmDialog(null,
                (titleMessage.isEmpty()) ? generalTitle : titleMessage, textMessage, JOptionPane.YES_NO_OPTION);
    }
}
