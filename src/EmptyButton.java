import javax.swing.*;

public class EmptyButton extends JButton {
    // Declares 2 private ImageIcon reference variables to reference 2 ImageIcon instance objects
    private ImageIcon closedIcon;


    // Constructor: Creates an instance object of the ImageIcon class and assigns the address to the closedIcon variable
    // Passes image file "unopened.png" as the argument
    // Calls the super class' setIcon() method and passes the instance object closedIcon
    public EmptyButton() {
        // Creates an instance object of the ImageIcon class and assigns the address to the closedIcon variable
        // Passes image file "unopened.png" as the argument
        // Sets the default icon as an unopened treasure icon
        closedIcon = new ImageIcon("unopened.png");
        // Calls the super class' setIcon() method and passes the instance object closedIcon
        super.setIcon(closedIcon);
    }

    // Purpose: disables the button
    // Signature: accepts no input arguments, void = no return
    public void setIcon() {
        // Calls the super class' setEnabled() method and passes false as the argument
        super.setEnabled(false);
    }
}
