
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;


public class BoardPanel extends JPanel {
    // Declares a TreasureGame reference variable to reference a TreasureGame instance object
    private Main playGame;
    // Declares a PointsPanel reference variable to reference a PointsPanel instance object
    private PointsPanel updatePoints;
    // Declares a ButtonGroup reference variable to reference a ButtonGroup instance object
    private ButtonGroup buttonSet;
    // Declares an array of TreasureButtons to hold the TreasureButtons to be created
    private TreasureButton[] treasureButtons;
    // Declares an array of EmptyButtons to hold the EmptyButtons to be created
    private EmptyButton[] buttonArray;
    // Declares an array of TrollButton to hold the TrollButtons to be created
    private TrollButton[] trollArray;
    // Declares a Random reference variable to reference a Random instance object
    private Random randomIndex;
    // Declares 2 ImageIcon reference variables to reference 2 ImageIcon instance objects
    private ImageIcon emptyChestIcon, treasureIcon;
    // Declares a MovePanel reference variable to reference a MovePanel instance object
    private MovePanel updateMove;
    // Declares an EmptyButton reference variable to reference an EmptyButtpn instance object
    private EmptyButton clickedEmpty;
    // Declares a TreasureButton reference variable to reference a TreasureButton instance object
    private TreasureButton clickedTreasure;
    // Declares a TrollButton reference variable to reference a TrollButton instance object
    private TrollButton newTroll;
    // Declare all fields as privates to prevent code corruption



    // Constructor: Accepts a TreasureGame and PointsPanel instance objects
    public BoardPanel(Main newTreasure, PointsPanel newPoints, MovePanel newMove) {
        // Assigns the PointsPanel address passed to the newPoints variable to the updatePoints variable
        updatePoints = newPoints;
        // Assigns the Main class' address passed to the newTreasure variable to the playGame variable
        playGame = newTreasure;
        // Assigns MovePanel address passed to newMove variable to the updateMove variable
        updateMove = newMove;
        // Creates an instance object of the ButtonGroup class and assigns the address to the buttonSet variable
        // needed to group all buttons together
        buttonSet = new ButtonGroup();
        // Calls the JPanel's setLayout() and passes and instance of the GridLayout class which has 10 rows and columns as its arguments
        setLayout(new GridLayout(10, 10));
        // Creates a border around the panel
        setBorder(BorderFactory.createLoweredBevelBorder());
        // Calls the buildButtons() method
        buildButtons();
    }

    // Purpose: To build a board filled with EmptyButtons and TreasureButtons
    // Signature: Accepts no input argument, void = no return
    public void buildButtons() {
        // Declares an int variable called treasureLocation and trollLocation to serve as a random location in the buttonArray array
        int treasureLocation, trollLocation;


        // Creates an array of 100 EmptyButtons named buttonArray
        buttonArray = new EmptyButton[100];
        // Creates an array of 20 TrollButtons named trollArray
        trollArray = new TrollButton[20];
        // Creates an array of 20 TreasureButtons named treasureButtons
        treasureButtons = new TreasureButton[20];
        // Creates an instance object of the Random class called randomIndex
        randomIndex = new Random();


        // Declares an int variable named treasureButtonIndex, initialized to 0, tests to see if it is less than the length of
        // array TreasureButtons, if true, execute for loop contents and increment treasureButtonIndex by 1
        for(int treasureButtonIndex = 0; treasureButtonIndex < treasureButtons.length; treasureButtonIndex++) {
            // For every loop increment, place a TreasureButton in the corresponding treasureButton array element
            treasureButtons[treasureButtonIndex] = new TreasureButton();
        }

        // Declares an int variable named trollIndex, initialized to 0, tests to see if it less than the length of aray trollArray
        // If true, execute for loop contents and increment trollIndex by 1
        for(int trollIndex = 0; trollIndex < trollArray.length; trollIndex++) {
            // For every loop increment, place a TrollButton in the corresponding array element
            trollArray[trollIndex] = new TrollButton();
        }

        // Declares an int variable named treasureIndex, initialized to 0, tests to see if it is less than the length of araay treausreButtons
        // If true, execute for loop contents and increment treasureIndex by 1
        for(int treasureIndex = 0; treasureIndex < treasureButtons.length; treasureIndex++) {
            // Creates a new TreasureButton called clickedTreasure
            clickedTreasure = new TreasureButton();

            // Generates a random number from 0 to 100 and stores it in the treasureLocation variable. If buttonArray[location] already has
            // as an item stored in it pick another number to pick another buttonArray element to store a TreasureButton in
            do {
                // Generates a random number from 0 to 100 and stores it in the location variable
                treasureLocation = randomIndex.nextInt(100);
            }while(buttonArray[treasureLocation] != null);

            // Places a TreasureButton from the treasureButtons array into buttonArray element buttonArray[treasureLocation]
            buttonArray[treasureLocation] = treasureButtons[treasureIndex];

            // assigns the button placed in the buttonArray[treasurelocation] to the clickedTreasure button
            buttonArray[treasureLocation] = clickedTreasure;


            // Add an action listener for the TreasureButton assigned to clickedTreasure
            clickedTreasure.addActionListener(new TreasureButtonListener(clickedTreasure, buttonArray,
                    updatePoints, updateMove,playGame));
        }

        // Declares an int variable called trollPlace, initializes it to 0, tests to see if it less than the length of the
        // trollArray array, if true execute loop contents, increments trollPlace by 1
        for(int trollPlace = 0; trollPlace < trollArray.length; trollPlace++) {
            // Create a new TrollButton named newTroll
            newTroll = new TrollButton();

            // Generates a random number from 0 to 100 and stores it in the trollLocation variable. If buttonArray[trollPlace] already has
            // as an item stored in it pick another number to pick another buttonArray element to store a TrollButton in
            do {
                // Generates a random number from 0 to 100 and stores it in the location variable
                trollLocation = randomIndex.nextInt(100);
            }while(buttonArray[trollLocation] != null);

            // Places a TrollButton from the trollArray array into the buttonArray element buttonArray[trollLocation]
            buttonArray[trollLocation] = trollArray[trollPlace];

            // assigns the TrollButton placed in the buttonArray[trollLocation] to the newTroll button
            buttonArray[trollLocation] = newTroll;

            // Adds an action listener for the TrollButton assigned to newTroll
            newTroll.addActionListener(new TrollButtonListener(newTroll, buttonArray,
                    updatePoints, updateMove,playGame));
        }

        // Declares an int variable named emptyButtonIndex, initialized to 0, tests to see if emptyButtonIndex is less than the length of
        // array buttonArray, if true execute for loop contents and increment emptyButtonIndex by 1
        for(int emptyButtonIndex = 0; emptyButtonIndex < buttonArray.length; emptyButtonIndex++) {
            // Creates a new EmptyButton called clickedEmpty
            clickedEmpty = new EmptyButton();

            // Tests to see element buttonArray[emptyButtonIndex] is empty
            // If true, execute if statement
            if(buttonArray[emptyButtonIndex] == null) {
                // Place an EmptyButton inside of buttonArray[emptyButtonIndex]
                buttonArray[emptyButtonIndex] = new EmptyButton();

                // Assigns the button placed in the buttonArray[emptyButtonIndex] to the clickedEmpty button
                buttonArray[emptyButtonIndex] = clickedEmpty;


                // Adds an action listener for clickedEmpty button
                clickedEmpty.addActionListener(new EmptyButtonListener(clickedEmpty, buttonArray,
                        updatePoints, updateMove, playGame));
            }

            // Calls the ButtonGroup class' add() method and passes the EmptyButton placed in buttonArray[emptyButtonIndex]
            buttonSet.add(buttonArray[emptyButtonIndex]);

            // Calls the JPanel class' add() method and passes the EmptyButton placed in buttonArray[emptyButtonIndex]
            add(buttonArray[emptyButtonIndex]);
        }
    }
}
