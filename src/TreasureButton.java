import javax.swing.*;
import java.util.Random;


public class TreasureButton extends EmptyButton {
    // Declares 2 private ImageIcon reference variables to reference 2 ImageIcon instance objects
    private ImageIcon  closedIcon, treasureIcon;
    // Declares a Random reference variable to reference a Random instance object
    private Random randomPoints;
    // Declares an int variable to to hold the points field
    private int points;
    // Declare all field as private to prevent code corruption



    // Constructor: Creates an instance object of the ImageIcon class and assigns the address to the closedIcon variable
    // Passes image file "unopened.png" as the argument
    // Calls the super class' setIcon() method and passes the instance object closedIcon
    public TreasureButton() {
        // Creates an instance object of the ImageIcon class and assigns the address to the closedIcon variable
        // Passes image file "unopened.png" as the argument
        // Sets the default icon as an unopened treasure icon
        closedIcon = new ImageIcon("unopened.png");
        // Calls the super class' setIcon() method and passes the instance object closedIcon
        super.setIcon(closedIcon);


        // Creates an instance of the Random class and assigns the address to the randomPoints variable
        randomPoints = new Random();
        // generates a random number between 1 to 3 and assigns it to the points variable
        points = randomPoints.nextInt(3) + 1;
    }

    // Purpose: To set the icon of the button and disable it
    // Signature: Accepts no input arguments, void = no return
    public void setIcon() {
        // Creates an instance object of the ImageIcon class called treasureIcon, passes image file "treasure.png" as the argument
        treasureIcon = new ImageIcon("treasure.png");


        // Calls the super class' setIcon() method and passes the treasureIcon instance object
        super.setIcon(treasureIcon);
        // Calls the setDisabledIcon() method and passes the treasureIcon instance object
        super.setDisabledIcon(treasureIcon);
        // Calls the setEnabled() method and passes false as the argument
        super.setEnabled(false);
    }

    // Purpose: To return the value stored in the points field
    // Signature: Accepts no input arguments, void = no return
    // Example:
    // points = 1
    // points = 2
    // points = 3
    public int givePoints() {
        return points;                  // returns the value stored in the points variable
    }
}
