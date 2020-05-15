import java.awt.*;
import java.awt.event.*;


public class ExitListener implements ActionListener {
    // Purpose: To close the game window
    // Signature: Accepts an instance object of the ActionEvent class
    // Example:
    // ===|File|=====
    //====|exit|=====
    public void actionPerformed(ActionEvent exit) {
        System.exit(0);
    }
}
