import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TreasureButtonListener implements ActionListener {
    // Declares a PointsPanel reference variable to reference a PointsPanel instance object
    private PointsPanel updatePoints;
    // Declares a MovePanel reference variable to reference a MovePanel instance object
    private MovePanel updateMove;
    // Declares a TreasureGame reference variable to reference a TreasureGame instance object
    private Main playGame;
    // Declares an ImageIcon reference variables to reference an ImageIcon instance object
    private ImageIcon treasureIcon;
    // Declares an array of EmptyButtons to hold all the EmptyButtons created
    private EmptyButton[] emptyButtons;
    // Declares an EmptyButton reference variable to reference an EmptyButton instance object
    private EmptyButton clickedEmpty;
    // Declares a TreasureButton reference variable to reference a TreasureButton instance object
    private TreasureButton clickedTreasure;



    // Constructor: Accepts an array of EmptyButtons, and instance objects of TreasureButton, PointsPanel, MovePanel, and TreasureGame
    public TreasureButtonListener(TreasureButton gems, EmptyButton[] emptyArray, PointsPanel points,
                                  MovePanel moveMade, Main play) {
        // Assigns the PointsPanel instance object address passed to the  points variable to the points variable
        updatePoints = points;
        // Assigns the MovePanel instance object address passed to the moveMade variable to the updateMove variable
        updateMove = moveMade;
        // Assigns the TreasureGame instance object address passed to the play variable to the playGame variable
        playGame = play;
        // Assigns the address of a EmptyButton array passed to the emptyArray variable to the emptyButtons variable
        emptyButtons = emptyArray;
        // Assigns the address of a TreasureButton passed to the gems variable to the clickedTreasure variable
        clickedTreasure = gems;
    }

    // Purpose: to change an icon of a TreasureButton and update the points panel and MovePanel
    // Signature: Accepts an instance object of the ActionEvent, void = no return
    // Example:
    // treasureButtons[treasureEventIndex].addActionListener(treasureListener)
    // treasureButton[treasureEventIndex] changes its icon to "treasure.png" and updates the points panel
    public void actionPerformed(ActionEvent treasureEvent) {
        // Creates an instance object of th ImageIcon class and assigns the address to the treasureIcon variable
        // passes the image file "treasure.png" as the argument
        treasureIcon = new ImageIcon("treasure.png");



        // Sets the icon of the clickedTreasure button as the treasureIcon
        clickedTreasure.setIcon(treasureIcon);
        // Disables the icon of the clickedTreasure button
        clickedTreasure.setDisabledIcon(treasureIcon);
        // Disables the clickedTreasure button
        clickedTreasure.setEnabled(false);


        // Calls the TreasureGame class' foundTreasure() method
        playGame.foundTreasure();
        // Calls the TreasureGame class' reduceNumberOfTries() method
        playGame.reduceNumberOfTries();
        // Calls the TreasureGame class' pointsAccumulator() method
        // passes the button's givePoints() method's return
        playGame.pointsAccumulator(clickedTreasure.givePoints());
        // Calls the PointsPanel class' updateTextFields() method
        updatePoints.updateTextFields();
        // Calls the MovePanel class' updateTreasureLabel() method
        updateMove.updateTreasureLabel();


        // If the playGame.getTreasuresFound()'s return is equal to 20, and playGame.getTriesLeft()'s return is
        // equal to 0, execute if-else-if statement
        if(playGame.getTreasuresFound() == 20 && playGame.getTriesLeft() >= 0) {
            // Call the MovePanel class' updateYouWonLabel() method
            updateMove.updateYouWonLabel();
        }
        // otherwise if the playGame.getTreasuresFound()'s return is less than 20 and playGame.getTriesLeft()'s return is
        // equal to 0, execute else-if statement
        else if(playGame.getTreasuresFound() < 20 && playGame.getTriesLeft() == 0) {
            // Call the MovePanel class' updateYouLoseLabel();
            updateMove.updateYouLoseLabel();


            // Declares an int variable called disable, initialized to 0, tests to see if disable is less than
            // the length of the emptyButtons array, if true, execute for loop contents, and increment disable by 1
            for(int disable = 0; disable < emptyButtons.length; disable++) {
                // Calls the setIcon() method of the buttons stored in emptyButtons[disable]
                emptyButtons[disable].setIcon();
            }
        }
    }
}
