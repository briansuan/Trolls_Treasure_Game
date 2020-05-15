import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmptyButtonListener implements ActionListener {
    // Declares an array of EmptyButtons to hold the EmptyButtons on the board
    private EmptyButton[] buttonArray;
    // Declares an ImageIcon reference variables to reference an ImageIcon instance object
    private ImageIcon emptyChestIcon;
    // Declares a PointsPanel reference variable to reference a PointsPanel instance object
    private PointsPanel pointsUpdate;
    // Declares a MovePanel reference variable to reference a MovePanel instance object
    private MovePanel moveUpdate;
    // Declares a TreasureGame reference variable to reference a TreasureGame instance object
    private Main gamePlay;
    // Declares an EmptyButton reference variable to reference the EmptyButton instance object
    private EmptyButton clickedEmpty;





    // Constructor: Accepts an array of EmptyButtons,
    // instance objects of EmptyButton, PointsPanel, MovePanel, and TreasureGame
    public EmptyButtonListener(EmptyButton empty, EmptyButton[] emptyArray, PointsPanel points,
                               MovePanel moveMade, Main play) {
        // Assigns the address passed to the points variable to the the pointsUpdate variable
        pointsUpdate = points;
        // Assigns the address passed to the moveMade variable to the moveUpdate variable
        moveUpdate = moveMade;
        // Assigns the address passed to the play variable to the gamePlay variable
        gamePlay = play;
        // Assigns the address passed to the emptyArray variable to the buttonArray variable
        buttonArray = emptyArray;
        // Assigns the EmptyButton address passed to the empty variable to the clickedEmpty variable
        clickedEmpty = empty;
    }

    // Purpose: To change an icon of a EmptyButton and update the points panel and MovePanel
    // Signature: Accepts an instance object of the ActionEvent class, void = no return
    // Example:
    // buttonArray[index].addActionListener(emptyButtonListener);
    // buttonArray[index] changes its icon to "empty.png" and updates the points panel
    public void actionPerformed(ActionEvent emptyEvent) {
        // Creates an instance object of the ImageIcon class and assigns the address to the emptyChestIcon variable , passes
        // image file "empty.png" as the argument
        emptyChestIcon = new ImageIcon("empty.png");



        // Sets the icon of the clickedEmpty button as the emptyChestIcon
        clickedEmpty.setIcon(emptyChestIcon);
        // Disables the icon of the clickedEmpty button
        clickedEmpty.setDisabledIcon(emptyChestIcon);
        // Disable the clickedEmpty button;
        clickedEmpty.setEnabled(false);


        // Calls the gamePlay instance object's reduceNumberOfTries() method
        gamePlay.reduceNumberOfTries();
        // Calls the pointsUpdate instance object's updateTextFields() method
        pointsUpdate.updateTextFields();
        // Calls the pointsUpdate instance object's updateMissLabel() method
        moveUpdate.updateMissLabel();


        // Calls the gamePlay instance object's getTreasuresFound() method and tests to see if it is equal to 20
        // and calls the getTriesLeft() method and tests to see if it is greater than or equal to 0. if both are true execute
        // if-else if statement
        if(gamePlay.getTreasuresFound() == 20 && gamePlay.getTriesLeft() >= 0) {
            // Call the moveUpdate instance object's updateYouWonLabel()
            moveUpdate.updateYouWonLabel();
        }
        // If gamePlay.getTreasuresFound()'s return is less than 20, and gamePlay.getTriesLeft()'s return is equal
        // to 0, execute else-if statement
        else if(gamePlay.getTreasuresFound() < 20 && gamePlay.getTriesLeft() == 0) {
            // Call the moveUpdate instance object's updateYouLoseLabel()
            moveUpdate.updateYouLoseLabel();


            // Declares an int variable named disable, initialized to 0 to serve as an array's subscript,
            // Tests to see if disable is less than the length of buttonArray, if true execute for loop contents
            // and increment disable by 1
            for(int disable = 0; disable < buttonArray.length; disable++) {
                // Calls the setIcon() method of the button stored in buttonArray[disable]
                buttonArray[disable].setIcon();
            }
        }
    }
}
