import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class AboutListener extends JFrame implements ActionListener {
    // Declares 4 JLabel reference variables to reference 4 JLabel instance objects
    private JLabel nameLabel, eMailLabel, phoneLabel, cityLabel, establishLabel;
    // Declares 4 JPanel reference variables to reference 4 JLabel instance objects
    private JPanel namePanel, eMailPanel, phonePanel, cityPanel, establishPanel;




    // Purpose: To create a content pane containing the information of the maker of the game
    // Signature: Accepts an ActionEvent instance object, void = no return
    // Example:
    // |    Trolls & Treasures By  Brian Suan    |
    // |       briancornelsuan@gmail.com         |
    // |            (123)- 456 - 789             |
    // |                est. 2019                |
    public void actionPerformed(ActionEvent about) {
        // Calls the JFrame class' setTitle() method and passes "About" as the argument
        setTitle("About");



        // Calls the JFrame class' setLayout() method, passes an instance object of the GridLayout() argument
        // which has 4 rows and 1 column as its arguments
        setLayout(new GridLayout(5,1));

        // Creates a new JPanel instance object, assigns the address to the namePanel variable
        namePanel = new JPanel();
        // Creates a new JPanel instance object, assigns the address to the eMailPanel variable
        eMailPanel = new JPanel();
        // Creates a new JPanel instance object, assigns the address to the phonePanel variable
        phonePanel = new JPanel();
        // Creates a new JPanel instance object, assigns the address to the cityPanel variable
        cityPanel = new JPanel();
        // Creates a new JPanel instance object, assigns the address to the establishPanel variable
        establishPanel = new JPanel();


        // Creates an instance object of the JLabel class, assigns the address to the nameLabel variable,
        // passes "Trolls & Treasures by Brian Suan" as the argument
        nameLabel = new JLabel("Trolls & Treasures by Brian Suan");
        // Sets the nameLabel's font as Serif, bold and italisized, and font size 22
        nameLabel.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 22));

        // Creates an instance object of the JLabel class, assigns the address to the eMailLabel variable,
        // passes "briancornelsuan@gmail.com" as the argument
        eMailLabel = new JLabel("briancornelsuan@gmail.com");

        // Creates an instance object of the JLabel class, assigns the address to the phoneLabel variable,
        // passes "(858) - 361 - 0583" as the argument
        phoneLabel = new JLabel("(858) - 361 - 0583");

        // Creates an instance object of the JLabel class, assigns the address to the cityLabel variable,
        // passes "San Diego, CA" as the argument
        cityLabel = new JLabel("San Diego, CA");

        // Creates an instance object of the JLabel class, assigns the address to the establishLabel variable
        // passes "est. 2019" as the argument
        establishLabel = new JLabel("est. 2019");


        // Adds the nameLabel to the namePanel panel
        namePanel.add(nameLabel);
        // Adds the eMailLabel to the eMailPanel panel
        eMailPanel.add(eMailLabel);
        // Adds the phoneLabel to the phonePanel panel
        phonePanel.add(phoneLabel);
        // Adds the cityLabel to the cityPanel panel
        cityPanel.add(cityLabel);
        // Adds the establishLabel to the establishPanel
        establishPanel.add(establishLabel);


        // Adds the namePanel to the content pane
        add(namePanel);
        // Adds the eMailPanel to the content pane
        add(eMailPanel);
        // Adds the phonePanel to the content pane
        add(phonePanel);
        // Adds the cityPanel to the content pane
        add(cityPanel);
        // Adds the establish panel to the content pane
        add(establishPanel);


        // Calls the JFrame class' pack() method
        pack();

        // Calls the JFrame class' setVisible() method and passes true as the argument
        setVisible(true);
    }
}
