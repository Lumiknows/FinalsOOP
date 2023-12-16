import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JPanel panel1;
    private JLabel usernameLabel, passwordLabel, displayBg;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private ImageIcon p1bg;

    public LoginFrame() {
        super("Ebike Parts & Accessories Picker");

        setLayout(new BorderLayout());

        panel1 = new JPanel();

        panel1.setBackground(new Color(255, 153, 0));
        panel1.setPreferredSize(new Dimension(200, 100));
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        try {
            p1bg = new ImageIcon("C:/Users/playb/OneDrive/Documents/PROJECT_OOP/Ebike/lib/misc/p1bg.png");
            displayBg = new JLabel(p1bg);
            displayBg.setPreferredSize(new Dimension(100, 700));
            this.add(displayBg);
        } catch (Exception e) {
            System.out.println("Unable to Display Image!");
        }

        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);

        panel1.add(usernameLabel);
        panel1.add(usernameField);
        panel1.add(passwordLabel);
        panel1.add(passwordField);

        loginButton = new JButton("Log in");
        loginButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("admin") && password.equals("password")) {
                    new Menu();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
                }
            }
        });

        panel1.add(loginButton);

        this.add(panel1, BorderLayout.WEST);
        this.setSize(1200, 620);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
