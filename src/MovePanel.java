import javax.swing.*;
import java.awt.*;


public class MovePanel extends JPanel {
    // Declares 5 JLabel reference variable to reference 5 JLabel instance objects
    private JLabel lastMove, treasure, miss, troll, youWon, youLose;
    // Declares a TreasureGame reference variable to reference a TreasureGame instance object
    private Main gamePoints;



    // Constructor: Accepts no input arguments
    public MovePanel(Main games) {
        // Assigns the address of a TreasureGame instance object passed to the games variable to the gamePoints variable
        gamePoints = games;

        // Calls the JPanel class' setLayout method, and passes an instance of the GridLayout class which has
        // 1 row, and 5 columns as argument
        setLayout(new GridLayout(1, 6));

        // Calls the buildLabels() method
        buildLabels();

        // Creates a border around the panel
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        // Adds all the labels to the panel
        // Adds treasure to panel
        add(treasure);
        // adds miss to panel
        add(miss);
        // adds troll label to panel
        add(troll);
        // adds youWon to panel
        add(youWon);
        // adds youLose to panel
        add(youLose);
    }


    // Purpose: to build and labels indicating the user's latest move
    // Signature: accepts no input argument, void = no return
    // Example:
    // "TREASURE"
    // "MISS"
    public void buildLabels() {
        // Builds a label called "TREASURE" assigns address to the treasure variable
        treasure = new JLabel("TREASURES");
        // Sets label font to Serif and, italisized, and font size 20
        treasure.setFont(new Font("Serif", Font.ITALIC, 18));

        // Builds a label called "MISS", assigns address to miss variable
        miss = new JLabel("MISS");
        // Sets label font to Serif, italisized, and font size 20
        miss.setFont(new Font("Serif", Font.ITALIC, 18));

        // Builds a label called "TROLL", assigns address to troll variable
        troll = new JLabel("TROLL");
        // Sets label font to Serif, and italisized, font size 20
        troll.setFont(new Font("Serif", Font.ITALIC, 18));

        // Builds a label called "YOU WON", assigns address to youWon variable
        youWon = new JLabel("YOU WON!");
        // Sets label font to Serif, italisized, and font size 20
        youWon.setFont(new Font("Serif", Font.ITALIC, 18));

        // Builds a label called "YOU LOSE", assigns address to youLose variable
        youLose = new JLabel("YOU LOSE!");
        // Sets label font to Serif, italisized, and font size 20
        youLose.setFont(new Font("Serif", Font.ITALIC, 18));
    }

    // Purpose: To set the treasure label according to the amount of points acquired from a TreasureButton
    // to red and all other labels to black
    // Signature: accepts no input argument, void = no return
    // Example:
    // "Treasure" (in red)
    // Miss (in black)
    public void updateTreasureLabel() {
        // Calls the gamePoints' getPointsAmount() method and tests to see if it is equal to 1
        // Execute if statement if true
        if(gamePoints.getButtonPoints() == 1) {
            // Sets the treasure label to "TREASURE + 1"
            treasure.setText("TREASURES + 1");
            // Sets the treasure label font to cyan
            treasure.setForeground(Color.CYAN.darker());
            // Sets the troll label's font to serif, bolded and italisized, and size 27
            treasure.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 27));
        }
        // Calls the gamePoints' getPointsAmount() method and tests to see if it is equal to 1
        // Execute else-if statement if true
        else if(gamePoints.getButtonPoints() == 2) {
            // Sets the treasure label to "TREASURE + 2"
            treasure.setText("TREASURES + 2");
            // Sets the treasure label font to orange
            treasure.setForeground(Color.ORANGE);
            // Sets the troll label's font to serif, bolded and italisized, and size 27
            treasure.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 27));
        }
        // Calls the gamePoints' getPointsAmount() method and tests to see if it is equal to 1
        // Execute else-if statement if true
        else if(gamePoints.getButtonPoints() == 3) {
            // Sets the treasure label to "TREASURE + 3"
            treasure.setText("TREASURES + 3");
            // Sets the treasure label font to red
            treasure.setForeground(Color.RED);
            // Sets the troll label's font to serif, bolded and italisized, and size 27
            treasure.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 27));
        }


        // sets the miss label font to black
        miss.setForeground(Color.BLACK);
        // Sets label font to Serif, italisized, and font size 20
        miss.setFont(new Font("Serif", Font.ITALIC, 18));

        // Sets troll label to black
        troll.setForeground(Color.BLACK);
        // Sets label font to Serif, and italisized, font size 20
        troll.setFont(new Font("Serif", Font.ITALIC, 18));

        // sets the youWon label font to black
        youWon.setForeground(Color.BLACK);

        // sets the youLose label font to black
        youLose.setForeground(Color.BLACK);
    }

    // Purpose: To set the treasure miss label font to red and other label fonts to black
    // Signature: accepts no input argument, void = no return
    // Example:
    // "Treasure" (in black)
    // Miss (in red)
    public void updateMissLabel() {
        // sets the miss label font to red
        miss.setForeground(Color.ORANGE);
        // Sets the troll label's font to serif, bolded and italisized, and size 27
        miss.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 27));


        // Sets the text of the treasue label to "TREASURES"
        treasure.setText("TREASURES");
        // Sets the treasure label font to black
        treasure.setForeground(Color.BLACK);
        // Sets label font to Serif and, italisized, and font size 20
        treasure.setFont(new Font("Serif", Font.ITALIC, 18));

        // Sets troll label to black
        troll.setForeground(Color.BLACK);
        // Sets label font to Serif, and italisized, font size 20
        troll.setFont(new Font("Serif", Font.ITALIC, 18));

        // sets the youWon label font to black
        youWon.setForeground(Color.BLACK);

        // sets the youLose label font to black
        youLose.setForeground(Color.BLACK);
    }

    // Purpose: to set the troll label to green and all other move labels to black
    // Signature: accepts no input argument, void = no return
    // "TROLL" (in green)
    // "TREASURE" (in black)
    public void updateTrollLabel() {
        // Sets troll label to green
        troll.setForeground(Color.GREEN.darker());
        // Sets the troll label's font to serif, bolded and italisized, and size 27
        troll.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 27));

        // sets the miss label font to black
        miss.setForeground(Color.BLACK);
        // Sets label font to Serif, italisized, and font size 20
        miss.setFont(new Font("Serif", Font.ITALIC, 18));


        // Sets the text of the treasures label to "TREASURES"
        treasure.setText("TREASURES");
        // Sets the treasure label font to black
        treasure.setForeground(Color.BLACK);
        // Sets label font to Serif and, italisized, and font size 20
        treasure.setFont(new Font("Serif", Font.ITALIC, 18));

        // sets the youWon label font to black
        youWon.setForeground(Color.BLACK);

        // sets the youLose label font to black
        youLose.setForeground(Color.BLACK);
    }

    // Purpose: To set the youWon label font to red and all other labels to black
    // Signature: accepts no input argument, void = no return
    // Example:
    // "youWon" (in red)
    // "youLose" (in black)
    public void updateYouWonLabel() {
        // sets the youWon label font to red
        youWon.setForeground(Color.ORANGE);
        // sets the youWon label font to serif, bold, and italisized, and font size 30
        youWon.setFont(new Font("Seri", Font.BOLD + Font.ITALIC, 32));


        // Sets the text of the treasure label to "TREASURES"
        treasure.setText("TREASURES");
        // Sets the treasure label font to black
        treasure.setForeground(Color.BLACK);
        // Sets label font to Serif, and italisized, font size 20
        treasure.setFont(new Font("Serif", Font.ITALIC, 18));

        // sets the miss label font to black
        miss.setForeground(Color.BLACK);
        // Sets label font to Serif, and italisized, font size 20
        miss.setFont(new Font("Serif", Font.ITALIC, 18));

        // sets the youLose label font to black
        youLose.setForeground(Color.BLACK);

        // Sets troll label to black
        troll.setForeground(Color.BLACK);
        // Sets label font to Serif, and italisized, font size 20
        troll.setFont(new Font("Serif", Font.ITALIC, 18));
    }

    // Purpose: To set the youLose label to red and all other labels to black
    // Signature: accepts no input argument, void = no return
    // Example:
    // "youLose" (in red)
    // "youWon" (in black)
    public void updateYouLoseLabel() {
        // sets the youLose label font to red
        youLose.setForeground(Color.RED);
        // sets the youWon label font to serif, bold, and italisized, and font size 30
        youLose.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 32));


        // Sets the text of the treasure label to "TREASURES"
        treasure.setText("TREASURE");
        // Sets the treasure label font to black
        treasure.setForeground(Color.BLACK);
        // Sets label font to Serif, and italisized, font size 20
        treasure.setFont(new Font("Serif", Font.ITALIC, 18));

        // sets the miss label font to black
        miss.setForeground(Color.BLACK);
        // Sets label font to Serif, and italisized, font size 20
        miss.setFont(new Font("Serif", Font.ITALIC, 18));

        // sets the youLose label font to black
        youWon.setForeground(Color.BLACK);

        // Sets troll label to black
        troll.setForeground(Color.BLACK);
        // Sets label font to Serif, and italisized, font size 20
        troll.setFont(new Font("Serif", Font.ITALIC, 18));
    }
}
