import javax.swing.*;
import java.awt.*;


public class LegendPanel extends JPanel {
    // Declares 3 JLabel reference variables to reference 3 JLabel instance objects
    private JLabel legend, trolls, treasure, empty;
    // Declares 3 ImageIcon reference variables to reference 3 ImageIcons instance objects
    private ImageIcon trollIcon, treasureIcon, emptyIcon;



    // Constructor: Accepts no input arguments
    public LegendPanel() {
        // Calls the JPanel class' setLayout method, passes a GridLayout instance object
        // with 6 rows, and 1 column as the arguments
        setLayout(new GridLayout(4,1));

        // Creates a border around the panel
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        // Calls the buildIcons() method
        buildIcons();
        // Calls the buildLabels() method
        buildLabels();

        // add the labels and the icons onto the panel
        // Adds the legend label to the panel
        add(legend);
        // Add the trolls label to the panel
        add(trolls);
        // Add the treasure label to the panel
        add(treasure);
        // Add the empty label to the panel
        add(empty);
    }

    // Purpose: To build instance objects of the ImageIcon class in order to display the icons on the panel
    // Signature: Accepts no input arguments, void = no return
    // Example:
    // Trolls - (troll.png)
    // Treasure - (treasure.png)
    // Empty - (empty.png)
    public void buildIcons() {
        // Creates an instance of the ImageIcon class called trollIcon, passes image file "troll.png" as the argument
        trollIcon = new ImageIcon("troll.png");
        // Creates an instance of the ImageIcon class called treasureIcon, passes image file "treasure.png" as the argument
        treasureIcon = new ImageIcon("treasure.png");
        // Creates an instance of the ImageIcon class called emptyIcon, passes image file "empty.png" as the argument
        emptyIcon = new ImageIcon("empty.png");
    }

    // Purpose: To build build, set the font, and add the icons with the labels
    // Signature: accepts no input arguments, void = n0 return
    // Example:
    // Troll - (troll.png)
    // Treasure - (treasure.png)
    // Empty - (empty.png)
    public void buildLabels() {
        // Creates an instance of the JLabel class calledd legend, passes "Legend" as the argument
        legend = new JLabel("Legend", SwingConstants.CENTER);
        // Sets the font of the legend label to "Serif", bold and italisized, and font size 22
        legend.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 29));
        // Sets the font color of the legend labael to orange
        legend.setForeground(Color.ORANGE);

        // Creates an instance object of the JLabel class called trolls, passes "Trolls" as the argument
        trolls = new JLabel("Trolls", SwingConstants.CENTER);
        // Sets the font of the trolls label to "Serif", bold and italisizedm and font size 16
        trolls.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 17));

        // Creates an instance of the JLabel class called treasure, passes "Treasure" as the argument
        treasure = new JLabel("Treasure", SwingConstants.CENTER);
        // Sets the font of the treasures label to "Serif", bold and italisizedm and font size 16
        treasure.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 17));

        // Creates an instance object of the JLabel class called emptym passes "Empty" as the argument
        empty = new JLabel("Empty", SwingConstants.CENTER);
        // Sets the font of the empty label to "Serif", bold and italisized, and font size 16
        empty.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 17));


        // Add the trollIcon icon to the trolls label
        trolls.setIcon(trollIcon);
        // Add the treasureIcon icon to the treasure label
        treasure.setIcon(treasureIcon);
        // Add the emptyIcon icon to the empty label
        empty.setIcon(emptyIcon);
    }
}
