import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TrollButtonListener implements ActionListener {
    // Declares a TrollButton reference variable to reference a TrollButton instance object
    private TrollButton theTroll;
    // Declares an array of EmptyButtons to store all the EmptyButtons created
    private EmptyButton[] empties;
    // Declares a PointsPanel reference variable to reference a PointsPanel instance object
    private PointsPanel pointsUpdate;
    // Declares a MovePanel reference variable to reference a MovePanel instance object
    private MovePanel moveUpdate;
    // Declares a TreasureGame reference variable to reference a TreasureGame instance object
    private Main play;
    // Declares an ImageIcon reference variable to reference an ImageIcon instance object
    private ImageIcon trollIcon;



    // Constructor: Accepts an array of EmptyButtons and the instance variables of the TrollButton, PointsPanel,
    // MovePanel, and TreasureGame classes
    public TrollButtonListener(TrollButton aTroll, EmptyButton[] none, PointsPanel points,
                               MovePanel moves, Main aGame) {
        // Assign the TrollButton address passed to the aTroll variable to the theTroll variable
        theTroll = aTroll;
        // Assign the address of a EmptyButton array passed to the none varaiable to the empties variable
        empties = none;
        // Assigns the PointsPanel address passed to the points variable to the pointsUpdate variable
        pointsUpdate = points;
        // Assigns the MovePanel address passed to the moves variable to the moveUpdate variable
        moveUpdate = moves;
        // Assigns the TreasureGame address passed to the aGame variable to the play variable
        play = aGame;
    }

    // Purpose: to change a TrollButton's icon and update the PointsPanel and MovePanel
    // Signature: accepts an instance object of the ActionEvent class
    public void actionPerformed(ActionEvent trollEvent) {
        // Creates a new ImageIcon instance object, assigns the address to the trollIcon variable, passes image file "troll.png"
        trollIcon = new ImageIcon("troll.png");


        // sets the icon of "theTroll" button to the trollIcon
        theTroll.setIcon(trollIcon);
        // Disable the "theTroll" button with the trollIcon icon
        theTroll.setDisabledIcon(trollIcon);
        // Disables "theTroll;" button
        theTroll.setEnabled(false);


        // Call the TreasureGame's setTreasuresFound() method
        play.setTreasuresFound();
        // Call the TreasureGame's setPoints() method
        play.setPoints();
        // Call the TreasureGame's reduceNumberOfTries() method
        play.reduceNumberOfTries();
        // Call the TreasureGame's updateTextFields()
        pointsUpdate.updateTextFields();
        // Call the TreasureGame's updateTrollLabel() method
        moveUpdate.updateTrollLabel();


        // If the play.getTreasuresFound()'s return is euqual to 20, and play.getTriesLeft()'s return is
        // equal to 0, execute if-else-if statement
        if(play.getTreasuresFound() == 20 && play.getTriesLeft() >= 0) {
            // Call the MovePanel class' updateYouWonLabel() method
            moveUpdate.updateYouWonLabel();
        }
        // otherwise if the play.getTreasuresFound()'s return is less than 20 and play.getTriesLeft()'s return is
        // equal to 0, execute else-if statement
        else if(play.getTreasuresFound() < 20 && play.getTriesLeft() == 0) {
            // Call the MovePanel class' updateYouLoseLabel();
            moveUpdate.updateYouLoseLabel();


            // Declares an int variable called disable, initialized to 0, tests to see if disable is less than
            // the length of the empties array, if true, execute for loop contents, and increment disable by 1
            for(int disable = 0; disable < empties.length; disable++) {
                // Calls the setIcon() method of the button stored in empties[disable]
                empties[disable].setIcon();
            }
        }
    }
}
