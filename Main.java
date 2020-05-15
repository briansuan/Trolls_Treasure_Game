public class Main {
    // Declares a reference variable for TreasureGameGUI class to reference an instance object of the TreasureGameGUI class
    private TreasureGameGUI newGameGUI;
    // Declares 5 int variables named treasuresLeft to hold the amount of treasuresLeft on the board, treasuresFound which holds
    // the amount of treasures found on the board, triesLeft which holds the amount of tries left, point which holds the
    // total amount of points the user has, and the buttonPoints field which holds the points value of a TreasureButton
    private int treasuresLeft, treasuresFound, triesLeft, points, buttonPoints;



    // Constructor: Assigns 20 to the treasuresLeft field, 0 to the treasuresFound field, and 50 to the triesLeft field
    public Main() {
        // Assigns 20 to the treasuresLeft field
        treasuresLeft = 20;
        // 0 to the treasuresFound field
        treasuresFound = 0;
        // and 50 to the triesLeft field
        triesLeft = 50;
        // Initializes the points field with 0
        points = 0;
        // Initializes the buttonPoints field with 0
        buttonPoints = 0;
    }

    // Purpose: to set the starting value of the points field to 0
    // Signature: Accepts no input arguments, void = no return
    // Example:
    // Points  = 15
    // setPoints(); points = 0;
    public void setPoints() {
        points = 0;
    }

    // Purpose: To set the treasuresFound field to 0
    // Signature: accepts no input arguments, void = no return
    // Example: treasuresFound = 0
    public void setTreasuresFound() {
        treasuresFound = 0;
    }

    // Purpose: To accumulate the user's points by adding either 1, 2, or 3 to the points field, assigns the value passed
    // pointsInput parameter variable to the pointsAmount variable
    // Signature: Accepts no input argument, void = no argument
    // Example:
    // points = 0, accumulatePoints(); points = 3;
    public void pointsAccumulator(int pointsInput) {
        // Adds the amount passed to the pointsInput parameter variable to the points field
        points += pointsInput;
        // Assigns pointsInput value to the buttonPoints value
        buttonPoints = pointsInput;
    }

    // Purpose: To subtract 1 to the current value of the triesLeft field
    // Signature: accepts no input arguments, void = no return
    // Example:
    // triesLeft = 50
    // reduceNumberOfTries();  triesLeft = 49;
    public void reduceNumberOfTries() {
        // Subtracts one to the triesLeft field
        triesLeft -= 1;
    }

    // Purpose: To subtract 1 to the treasuresLeft field and adds 1 to the treasuresFound field
    // Signature: accepts no input argument, void = no return
    // Example:
    // treasuresFound = 0;
    // treasuresLeft = 20;
    // foundTreasure(); treasuresLeft = 19, treasuresFound = 1;
    public void foundTreasure() {
        // Subtracts 1 to the treasuresLeft field
        treasuresLeft -= 1;
        // Adds 1 to the treasuresFound field
        treasuresFound += 1;
    }

    // Purpose: To reset the fields to their starting values. To be called when the game is over
    // Signature: Accepts no input arguments, void = no return
    // Example:
    // treasures left: 4
    // tries left: 0
    // treasure found: 5
    // foundNothing(); treasureLeft = 20, treasuresFound = 0, triesLeft = 50
    public void foundNothing() {
        // Sets the treasuresLeft field to 20
        treasuresLeft = 20;
        // Sets the treasuresFound field to 0
        treasuresFound = 0;
        // Sets the triesLef field to 50
        triesLeft = 50;
    }

    // Purpose: To retrieve the value stored in the buttonPoints field
    // Signature: Accepts no input argument, void = no return
    // Example:
    // pointsAmount = 3; getPointsAmount returns 3
    public int getButtonPoints() {
        return buttonPoints;                // Returns the value stored in the buttonPoints field
    }

    // Purpose: To retrieve the value stored in the treasuresLeft field
    // Signature: Accepts no input arguments, returns an int value
    // Example: treasuresLeft = 18;
    // getTreasuresLeft() return 18;
    public int getTreasuresLeft() {
        return treasuresLeft;               // Returns the value stored in the treasuresLeft field
    }

    // Purpose: To retrieve the value stored in the treasuresFound field
    // Signature: Accepts no input arguments, returns an int value
    // Example:
    // treasuresFound = 2;
    // getTreasuresFound() returns 2;
    public int getTreasuresFound() {
        return treasuresFound;              // Returns the value stored in the treasuresFound field
    }

    // Purpose: To retrieve the value stored in the triesLeft field
    // Signature: Accepts no input arguments, returns an int value
    // Example:
    // triesLeft = 25;
    // getTriesLeft() returns 25;
    public int getTriesLeft() {
        return triesLeft;                   // returns the value stored in the triesLeft field
    }

    // Purpose: to retrieve the value stored in the points field
    // Signature: Accepts no input argument, void = no return
    // Example:
    // points = 2; getPoints() returns 2
    public int getPoints() {
        return points;                  // Returns the value stored in the points field
    }

    // Purpose: To create an instance object of the TreasureGameGUI class
    // Signature: accepts no input arguments, void = no return
    public void play() {
        // Creates an instance object of the TreasureGameGUI class and assigns its address to the newGameGUI variable
        newGameGUI = new TreasureGameGUI();
    }



    // Main method being used
    public static void main(String[] args) {
        // Calls the play() method
        new Main().play();
    }
}
