import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;
import displays.*;

public class Menu extends JFrame implements ActionListener {
    private JComboBox<String> accessoryComboBox, partComboBox;
    private JButton searchButton, nextButton, prevButton;
    private JLabel partLabel, accessoryLabel, partImageLabel;
    private Map<String, String[]> partImageMap, accessoryImageMap;
    private JLabel specs;
    private String[] currentImagePaths;
    private int currentIndex;

    Menu() {
        JPanel leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(200, 100));
        leftPanel.setBackground(new Color(167, 49, 33));
        leftPanel.setBorder(new LineBorder(Color.BLACK, 3));

        UIManager.put("Button.font", new Font("SANS_SERIF", Font.BOLD, 13));
        UIManager.put("Label.font", new Font("SANS_SERIF", Font.BOLD, 15));
        UIManager.put("ComboBox.font", new Font("SAN_SERIF", Font.BOLD, 13));

        setLayout(new BorderLayout());

        partLabel = new JLabel("Select part: ");
        partLabel.setBounds(100, 30, 200, 30);

        accessoryLabel = new JLabel("Select accessory: ");
        accessoryLabel.setBounds(100, 90, 200, 30);

        String[] partOptions = {
                "Batteries", "Charger", "Tires", "Controllers", "Connectors",
                "Cycle Analysts", "DC-DC Converters", "Ebrakes", "Freewheels and Cassettes",
                "Lights", "Hub Motors", "Solar", "Spokes",
                "Throttles", "Torque Arms", "Wiring", "Rims"
        };

        String accessories[] = {
                "Helmet", "Locks", "Side Mirrors", "Bicycle Light", "Fenders", "Kickstands",
                "Phone mounts", "Speedometers", "Repair kits"     
        };

        specs = new JLabel();
        specs.setVerticalAlignment(JLabel.TOP);
        specs.setPreferredSize(new Dimension(200, 100));
        specs.setBorder(new LineBorder(Color.BLACK, 3));
        specs.setOpaque(true);
        specs.setBackground(new Color(242, 232, 198));

        partComboBox = new JComboBox<>(partOptions);
        partComboBox.setPrototypeDisplayValue("Freewheels and Cassettes"); // To make the ComboBox even
        partComboBox.setBounds(50, 50, 90, 20); 

        accessoryComboBox = new JComboBox<>(accessories);
        accessoryComboBox.setPrototypeDisplayValue("Freewheels and Cassettes");
        accessoryComboBox.setBounds(100, 60, 200, 30);

        searchButton = new JButton("Search");
        searchButton.setPreferredSize(new Dimension(50, 20));
        searchButton.setBounds(320, 60, 80, 30);
        searchButton.setBorder(new LineBorder(Color.BLACK));
        searchButton.addActionListener(this);

        nextButton = new JButton("Next");
        nextButton.setPreferredSize(new Dimension(50, 20));
        nextButton.setBounds(420, 60, 80, 30);
        nextButton.setBorder(new LineBorder(Color.BLACK));
        nextButton.addActionListener(this);

        prevButton = new JButton("Previous");
        prevButton.setPreferredSize(new Dimension(60, 20));
        prevButton.setBounds(520, 60, 100, 30);
        prevButton.setBorder(new LineBorder(Color.BLACK));
        prevButton.addActionListener(this);

        partImageLabel = new JLabel();
        partImageLabel.setBackground(new Color(218, 212, 181));
        partImageLabel.setBorder(new LineBorder(Color.BLACK, 3));
        partImageLabel.setBounds(100, 150, 500, 500);

        partImageMap = new HashMap<>();
        accessoryImageMap = new HashMap<>();
        initializeImageMaps();

        leftPanel.add(partLabel);
        leftPanel.add(partComboBox);
        leftPanel.add(accessoryLabel);
        leftPanel.add(accessoryComboBox);
        leftPanel.add(searchButton);
        leftPanel.add(nextButton);
        leftPanel.add(prevButton);

        this.add(specs, BorderLayout.EAST);
        this.add(leftPanel, BorderLayout.WEST);
        this.add(partImageLabel, BorderLayout.CENTER);
        this.setSize(1200, 620);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        JMenu menu = new JMenu("ABOUT US");
        JMenu submenu1 = new JMenu("MEMBERS");
        JMenu submenu2 = new JMenu("TEACHER");
        JMenuBar menubar = new JMenuBar();

        JMenuItem n1 = new JMenuItem("Batac");
        JMenuItem n2 = new JMenuItem("Ibona");
        JMenuItem n3 = new JMenuItem("Diaz");
        JMenuItem n4 = new JMenuItem("Daniel");
        JMenuItem n5 = new JMenuItem("Teopiz");
        JMenuItem n6 = new JMenuItem("Teogangco");
        JMenuItem n7 = new JMenuItem("Sy");
        JMenuItem n8 = new JMenuItem("Semontiza");

        JMenuItem t1 = new JMenuItem("Carl-san Kim");

        submenu1.add(n1);
        submenu1.add(n2);
        submenu1.add(n3);
        submenu1.add(n4);
        submenu1.add(n5);
        submenu1.add(n6);
        submenu1.add(n7);
        submenu1.add(n8);

        submenu2.add(t1);

        menu.add(submenu1);
        menu.add(submenu2);
        menubar.add(menu);
        setJMenuBar(menubar);
    }

    private void initializeImageMaps() {
        partImageMap = InitializeImages.initializePartImageMap();
        accessoryImageMap = InitializeImages.initializeAccessoryImageMap();
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Successfully Performed" + e.getActionCommand());
        if (e.getSource() == searchButton) {
            String selectedPart = (String) partComboBox.getSelectedItem();
            displayPartImages(selectedPart);
        } else if (e.getSource() == nextButton) {
            showNextImage();
        } else if (e.getSource() == prevButton) {
            showPreviousImage();
        } else if (e.getSource() == accessoryComboBox) {
            String selectedAccessory = (String) accessoryComboBox.getSelectedItem();
            displayAccessoryImages(selectedAccessory);
        }
    }

    private void displayPartImages(String selectedPart) {
        currentImagePaths = partImageMap.get(selectedPart);

        if (currentImagePaths != null && currentImagePaths.length > 0) {
            currentIndex = 0;
            showImageAtIndex(selectedPart, currentIndex, 500, 500);
        }
    }

    private void displayAccessoryImages(String selectedAccessory) {
        currentImagePaths = accessoryImageMap.get(selectedAccessory);

        if (currentImagePaths != null && currentImagePaths.length > 0) {
            currentIndex = 0;
            showImageAtIndex(selectedAccessory, currentIndex, 500, 500);
        }
    }

    private void showNextImage() {
        if (currentImagePaths != null && currentIndex < currentImagePaths.length - 1) {
            currentIndex++;
            System.out.println("Next Image: " + currentImagePaths[currentIndex]);
            showImageAtIndex((String) partComboBox.getSelectedItem(), currentIndex, 500, 500);
        } else if (currentIndex == 3) {
            currentIndex = -1;
        }
    }

    private void showPreviousImage() {
        if (currentImagePaths != null && currentIndex > 0) {
            currentIndex--;
            System.out.println("Previous Image: " + currentImagePaths[currentIndex]);
            showImageAtIndex((String) partComboBox.getSelectedItem(), currentIndex, 500, 500);
        } else if (currentIndex == 0) {
            currentIndex = 4;
        }
    }

    private void showImageAtIndex(String selectedPart, int index, int maxWidth, int maxHeight) {
        try {
            if (currentImagePaths != null && index >= 0 && index < currentImagePaths.length) {
                System.out.println("Current Index: " + index);
                ImageIcon originalIcon = new ImageIcon(currentImagePaths[index]);
                Image originalImage = originalIcon.getImage();
                Image scaledImage = originalImage.getScaledInstance(maxWidth, maxHeight, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scaledImage);
                partImageLabel.setIcon(scaledIcon);
    
                partImageLabel.setIcon(new ImageIcon(scaledImage));
                partImageLabel.setHorizontalAlignment(JLabel.CENTER);
                partImageLabel.setVerticalAlignment(JLabel.CENTER);
    
                partImageLabel.setBackground(new Color(255, 255, 255));
                partImageLabel.setBorder(new LineBorder(Color.BLACK, 3));
                partImageLabel.setOpaque(true);
    
                System.out.println("Setting Image for Index: " + index);
    
                displaySpecs(selectedPart, index);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void displaySpecs(String selectedPart, int index) {
        String[] partSpecs = getSpecs(selectedPart, index);

        if (partSpecs != null) {
            StringBuilder specsText = new StringBuilder();

            for (String spec : partSpecs) {
                specsText.append(spec).append("<br>");
            }

            specs.setText("<html>" + specsText.toString() + "</html>");
        }
    }
    
    private String[] getSpecs(String selectedPart, int index) {
        return PartSpecs.getSpecs(selectedPart, index);
    }
}
