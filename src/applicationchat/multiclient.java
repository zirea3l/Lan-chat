package applicationchat;

import static applicationchat.multicastclient.name;
import javax.swing.JOptionPane;

public class multiclient {
    multiclient() {
        name = JOptionPane.showInputDialog("Please enter your name");
        int count = 0;
        while (name == null || name.equals("")) {
            if (name == null) {
                new appchat().setVisible(true);
                count++;
                break;
            } else if (name.equals("")) {
                JOptionPane.showMessageDialog(new appchat(), "Please enter a proper name");
                name = JOptionPane.showInputDialog("Please enter your name");
            }

        }
        if (count == 0) {
            new multicastclient().setVisible(true);
            Thread t1 = new Thread(new Client());
            t1.start();

        }
    }
}
