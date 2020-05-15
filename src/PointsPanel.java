import javax.swing.*;
import java.awt.*;

public class PointsPanel extends JPanel {
    // Declares 3 JLabel reference variables to reference 3 JLabel instance objects
    private JLabel triesLeft, treasuresFound, treasuresLeft,pointsLabel;
    // Declares a TreasureGame reference variable to store the address of a TreasureGame instance object
    private Main currentGame;
    // Declares 3 JTextField reference variables to reference 3 JTextField instance objects
    private JTextField triesLeftDisplay, treasuresFoundDisplay, treasuresLeftDisplay, pointsDisplay;




    // Constructor: Accepts a TreasureGame instance object
    public PointsPanel(Main letsPlay) {
        // Assigns address of a TreasureGame instance object passed to letsPlay variable to the currentGame variable
        currentGame = letsPlay;


        // Calls the JPanel class' setLayout() method and passes an instance object of the GridLayout class with
        // 6 rows and 1 column as the argument
        setLayout(new GridLayout(6, 2));


        // Calls the buildLabels() method
        buildLabels();
        // Calls the buildTextFields() method
        buildTextFields();

        // Creates a border around the panel
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


        // Calls the JPanel class add() method Adds the JLabel and JTextField instance variables to the  panel
        // adds triesLeft label to the panel
        add(triesLeft);
        // adds the points label to the panel
        add(pointsLabel);
        // adds triesLeftDisplay text field to the panel
        add(triesLeftDisplay);
        // adds the pointsDisplay to the panel
        add(pointsDisplay);
        // adds treasuresFound label to the panel
        add(treasuresFound);
        // adds the treasuresFoundDisplay text field to the panel
        add(treasuresFoundDisplay);
        // adds the treasuresLeft label to the panel
        add(treasuresLeft);
        // adds the treasuresLeftDisplay to the panel
        add(treasuresLeftDisplay);
    }

    // Purpose: to build the labels indicating the game's score
    // Signature: Accepts no input argument, void = no return
    // Example:
    // Treasures Left:
    // Tries Left:
    // Treasure Found:
    public void buildLabels() {
        // Creates a label called "Tries Left: " and assigns the address to the triesLeft variable
        triesLeft = new JLabel("Tries Left:");
        // Sets the labels's font as Serif, italisized, and size 17
        triesLeft.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 22));


        // Creates a label called "Treasures Found: " and assigns the address to the treasuresFound variable
        treasuresFound = new JLabel("Treasures Found:");
        // Sets the labels's font as Serif, italisized, and size 17
        treasuresFound.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 19));


        // Creates a label called "Treasures Left: " and assigns the address to the treasursLeft variable
        treasuresLeft = new JLabel("Treasure Left:");
        // Sets the labels's font as Serif, italisized, and size 17
        treasuresLeft.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 19));


        // Creates a label called "Points: " and assigns the address to the points variable
        pointsLabel = new JLabel("  Points: ");
        // Sets the pointsLabel's font as Serif, italisized, and size 17
        pointsLabel.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 22));
        // Sets the pointsLabel's font color as blue
        pointsLabel.setForeground(Color.BLUE);
    }

    // Purpose: To build text fields to show the user's points in
    // Signature: Accepts no input arguments, void = no return
    // Example:
    // Tries Left: |  10  |
    // Treasures Left: |  8  |
    // Treasures Found: |  3  |
    public void buildTextFields() {
        // Creates a text field with 2 characters spaces, assigns the address to the triesLeftDisplay variable
        triesLeftDisplay = new JTextField(2);
        // Creates a text field with 2 characters spaces, assigns the address to the treasuresFoundDisplay variable
        treasuresFoundDisplay = new JTextField(2);
        // Creates a text field with 2 characters spaces, assigns the address to the treasuresLeftDisplay variable
        treasuresLeftDisplay = new JTextField(2);
        // Creates a text field with 2 characters spaces, assigns the address to the pointsDisplay variable
        pointsDisplay = new JTextField(2);



        // Calls the currentGame's getTriesLeft() method, converts it to a String, and sets it as a starting display
        // for the triesLeftDisplay text field
        triesLeftDisplay.setText(Integer.toString(currentGame.getTriesLeft()));
        // Sets the text field's font as Serif, italisized, and size 17
        triesLeftDisplay.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 22));
        // Sets the font color of the triesLeftDisplay field to red
        triesLeftDisplay.setForeground(Color.RED);
        // Makes the text field red-only
        triesLeftDisplay.setEditable(false);


        // Calls the currentGame's getTreasuresFound() method, converts it to a String, and sets it as a starting display
        // for the treasuresFoundDisplay text field
        treasuresFoundDisplay.setText(Integer.toString(currentGame.getTreasuresFound()));
        // Sets the text field's font as Serif, italisized, and size 17
        treasuresFoundDisplay.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 22));
        // Sets the font color of the treasuresFoundDisplay label to red
        treasuresFoundDisplay.setForeground(Color.RED);
        // Makes the text field red-only
        treasuresFoundDisplay.setEditable(false);


        // Calls the currentGame's getTreasuresLeft() method, converts it to a String, and sets it as a starting display
        // for the treasuresLeftDisplay text field
        treasuresLeftDisplay.setText(Integer.toString(currentGame.getTreasuresLeft()));
        // Sets the text field's font as Serif, italisized, and size 17
        treasuresLeftDisplay.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 22));
        // Sets the color of the treasuresLeftDisplay label to red
        treasuresLeftDisplay.setForeground(Color.RED);
        // Makes the text field red-only
        treasuresLeftDisplay.setEditable(false);


        // Calls the currentGame's getPoints() method, converts it to a string, and sets it as a starting display
        // for the pointsDisplay text field
        pointsDisplay.setText(Integer.toString(currentGame.getPoints()));
        // Sets the text field's font as Serif, italisized, and size 17
        pointsDisplay.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 22));
        // Sets the text field's color as blue
        pointsDisplay.setForeground(Color.BLUE);
        // Makes the text field as read-only
        pointsDisplay.setEditable(false);
    }

    // Purpose: To update the text fields' contents
    // Signature: Accepts no input argument, void = no return
    public void updateTextFields() {
        // Calls the currentGame's getTriesLeft() method, converts it to a String, and displays it on a text field
        triesLeftDisplay.setText(Integer.toString(currentGame.getTriesLeft()));

        // Calls the currentGame's getTreasuresFound() method, converts it to a String, and dipslays it on a text field
        treasuresFoundDisplay.setText(Integer.toString(currentGame.getTreasuresFound()));

        // Calls the currentGame's getTreasuresLeft() method, converts it to a String, and displays it on a text field
        treasuresLeftDisplay.setText(Integer.toString(currentGame.getTreasuresLeft()));

        //Calls the currentGame's getPoints() method, converts it to a string and displays it on a text field
        pointsDisplay.setText(Integer.toString(currentGame.getPoints()));
    }
}
