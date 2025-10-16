import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new FlowLayout());

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(5);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(15);

        JButton submitButton = new JButton("Submit");

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(submitButton);

        // Make frame visible
        frame.setVisible(true);
    }
}