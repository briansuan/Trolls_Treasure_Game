import javax.swing.*;
import java.awt.*;

public class TreasureGameGUI extends JFrame {
    // Declares 3 JPanel reference variables to reference 3 JPanel instance objects
    private JPanel panel, buttonPanel, labelPanel;
    // Declares 3 JLabel reference variables to reference 3 JLabel instance objects
    private JLabel triesLeft, treasuresFound, treasuresLeft, titleBanner;
    // Declares a PointsPanel reference variable to reference a PointsPanel instance object
    private PointsPanel userPoints;
    // Declares a BoardPanel reference variable to reference a boardGame instance object
    private BoardPanel boardGame;
    // Declares a MovePanel reference variable to reference a MovePanel instance object
    private MovePanel move;
    // Declares a LegendPanel reference variable to reference a LegendPanel instance object
    private LegendPanel legend;
    // Declares a TreasureGame reference variable to reference a TreasureGame instance variable
    private Main play;
    // Declares a JMenuBar reference variable to reference a JMenuBar instance object in the buildMenuBar() method
    private JMenuBar menuBar;
    // Declares a JMenu reference variable to reference a JMenu instance object in the buildFileMenu() method
    private JMenu game;
    // Declares a JMenuItem reference variable to reference a JMenuItem instance object in the buildFileMenu() method
    private JMenuItem exit, about;
    // Declares a ImageIcon reference variable to reference an ImageIcon instance object
    private ImageIcon bannerIcon;
    // Declare all instance fields as private to prevent code corruption




    // Constructor:
    // Declares a new TreasureGame instance object called "play", Calls JFrame class' setTitle() method and passes "Treasure Hunt"
    // as the argument, calls the setDefaultCloseOperation() method ans passes JFrame.EXIT_ON_CLOSE, calls the buildGUI() method,
    // Calls the JFrame class pack() method, calls the JFrame class setVisible() method and passes true as the argument
    public TreasureGameGUI() {
        // Declares a new TreasureGame instance object called "play"
        play = new Main();
        //Calls JFrame class' setTitle() method and passes "Trolls & Treasures" as the argument
        setTitle("Trolls & Treasures");
        // calls the setDefaultCloseOperation() method ans passes JFrame.EXIT_ON_CLOSE
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // calls the buildGUI() method
        buildGUI();
        // Calls the JFrame class pack() method
        pack();
        // calls the JFrame class setVisible() method and passes true as the argument
        setVisible(true);
    }

    // Purpose: To Build a graphic user interface for the Treasure Hunt Game
    // Signature: Accepts no input arguments, void = no return
    public void buildGUI() {
        // calls the JFrame class' setLayout() method and passes an instance of the BoardLayout class
        setLayout(new BorderLayout());
        // Calls the buildPointsDisplay() method
        buildPointsDisplay();
        // Calls the buildMovePanel() method
        buildMovePanel();
        // Calls buildBoardButtons() class
        buildBoardButtons();
        // Calls the buildTitleBanner() method
        buildTitleBanner();
        // Calls the buildLegendPanel() method
        buildLegendPanel();
        // Calls the buildMenuBar() method
        buildMenuBar();
    }


    // Purpose: To build and display a title banner
    // Signature: Accepts not input argument, void = no return
    // Example: "Treasure Hunt"
    public void buildTitleBanner() {
        // Creates an instance object of the ImageIcon class passes the address to the bannerIcon variable
        bannerIcon = new ImageIcon("banner.png");
        // Creates an instance object of the JLabel class and assigns the address to the titleBanner variable
        // Passes "" and SwingConstants.CENTER as the arguments
        titleBanner = new JLabel("", SwingConstants.CENTER);
        // Sets the icon of the titleBanner label to the bannerIcon icon
        titleBanner.setIcon(bannerIcon);


        // Calls the JFrame class add method and passes titleBanner, and BorderLayout.NORTH as the arguments
        add(titleBanner, BorderLayout.NORTH);
    }

    // Purpose: To build a display area for the points of the game
    // Signature: Accepts no input argument, void = no return
    // Example:
    // Treasures Left = 10
    // Treasures Found = 10
    // Tries Left = 30
    public void buildPointsDisplay() {
        // Creates an instance object of the PointsPanel class and assigns the address to the userPoints variable
        // passes the instance of the TreasureGame class called "play"
        userPoints = new PointsPanel(play);
        // Calls the JFrame class' add() method and passes the userPoints instance object and BorderLayout.WEST to place the panel on
        // the west area
        add(userPoints, BorderLayout.WEST);
    }

    // Purpose: To build a panel showing the user's latest move
    // Signature: accepts no input argument, void = no return
    // Example:
    // |TREASURE|miss|You Won|You Lost|
    public void buildMovePanel() {
        // Creates an instance object of the MovePanel class and assigns the address to the move variable
        move = new MovePanel(play);

        // Calls the JFrame class' add() method and passes the move instance object and BorderLayout.SOUTH to place the panel on
        // the south area
        add(move, BorderLayout.SOUTH);
    }

    // Purpose to build a panel showing the legend of the game
    // Signature: Accepts no input arguments, void = no return
    // Example:
    // Trolls - (troll image)
    // Treasure - (treasure image)
    // Empty - (empty chest image)
    public void buildLegendPanel() {
        // Creates an instance of the LegendPanel class and assigns the address to the legend variable
        legend = new LegendPanel();


        // Calls the JFrame class' add() method ans passes the legend instance object and BorderLayout.EAST to place the panel
        // opn the east area
        add(legend, BorderLayout.EAST);
    }

    // Purpose: To build a menu bar for the GUI
    // Signature: Accepts no input arguments, void = no return
    public void buildMenuBar() {
        // Creates an instance object of the JMenuBar() class and assigns the address to the menuBar variable
        menuBar = new JMenuBar();


        // Creates an instance object of the JMenuItem class and assigns its address to the exit variable,
        // passes "Exit" as the argument
        exit = new JMenuItem("Exit");

        // Creates an instance object of the JMenu class and assigns its address to the file variable
        game = new JMenu("Game");


        // Creates an instance of object of the JMenuItem class and assigns its address to the About variable,
        // passes "About" as the argument
        about = new JMenuItem("About");
        // Adds an action listener to the about menu item


        // Adds an action listener to the exit menu item
        exit.addActionListener(new ExitListener());
        // Adds an action listener to the exit menu item
        about.addActionListener(new AboutListener());


        // Adds the exit menu item to the file menu
        game.add(exit);
        // Add a separator bar
        game.addSeparator();
        // Adds the about menu item to the file menu
        game.add(about);
        // Adds file menu to the menu bad
        menuBar.add(game);
        // Sets the window's menu bar
        setJMenuBar(menuBar);
    }

    // Purpose: To build a "board" filled with buttons 80 buttons with  empty icons and 20 buttons with treasure icons randomly placed on the
    // "board"
    // Signature: Accepts no input argument, void = no return
    public void buildBoardButtons() {
        // Creates an instance object of the BoardPanel class and assigns its address to the boardGame variable and passes the
        // TreasureGame instance called play and the instance of the PointsPanel called userPoints
        boardGame = new BoardPanel(play, userPoints, move);

        // Calls the JFrame class' add() method and passes the boardGame instance object and BorderLayout.CENTER to place the panel on
        // the center area
        add(boardGame, BorderLayout.CENTER);
    }
}
