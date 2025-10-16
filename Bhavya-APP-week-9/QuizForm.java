import javax.swing.*;
import java.awt.*;

public class QuizForm {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Simple Quiz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Create a question label
        JLabel questionLabel = new JLabel("Which language is used for Android development?");

        // Create radio buttons for options
        JRadioButton option1 = new JRadioButton("Java");
        JRadioButton option2 = new JRadioButton("Python");
        JRadioButton option3 = new JRadioButton("C++");
        JRadioButton option4 = new JRadioButton("Swift");

        // Group radio buttons so only one can be selected
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        group.add(option4);

        // Create a Submit button
        JButton submitButton = new JButton("Submit");

        // Add all components to frame
        frame.add(questionLabel);
        frame.add(option1);
        frame.add(option2);
        frame.add(option3);
        frame.add(option4);
        frame.add(submitButton);

        // Make frame visible
        frame.setVisible(true);
    }
}