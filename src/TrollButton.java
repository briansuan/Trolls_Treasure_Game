import javax.swing.*;
import java.awt.*;


public class TrollButton extends EmptyButton {
    // Declares 2 ImageIcon reference variables to reference 2 ImageIcon instance objects
    private ImageIcon closedIcon, trollIcon;

    // Constructor: Accepts no input arguments
    public TrollButton() {
        // Creates an instance object of the ImageIcon class and assigns the address to the closedIcon variable, passes
        // image file "unopened.png" as the argument
        closedIcon = new ImageIcon("unopened.png");
        // Calls the super class' setIcon method and passes the ImageIcon instance closedIcon
        super.setIcon(closedIcon);
    }

    // Purpose: To set the icon of the button and disables it
    // Signature: Accepts no input argument, void = no return
    public void setIcon() {
        // Creates an instance object of the ImageIcon class called trollIcon, passes image file "troll.png" as the argument
        trollIcon = new ImageIcon("troll.png");


        // Calls the super class' setIcon() method and passes the setIcon instance as the argument
        super.setIcon(trollIcon);
        // Calls the super class' setDisabledIcon() method and passes trollIcon instance as the argument
        super.setDisabledIcon(trollIcon);
        // Calls the super class' setEnabled() method ans passes false as the argument
        super.setEnabled(false);
    }
}
