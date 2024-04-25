import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main extends JFrame implements ActionListener {
    private JLabel statusLabel;

    public Main() {
        setTitle("Coding Challenge");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //all da colors and fonts ahhhhh
        Color backgroundColor = new Color(255, 204, 204);//pink
        Color buttonColor = new Color(255, 153, 153); //pink
        Font labelFont = new Font("Comic Sans MS", Font.BOLD, 20);
        Font buttonFont = new Font("Comic Sans MS", Font.BOLD, 16);

        //GUI components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        panel.setBackground(backgroundColor);

        JLabel welcomeLabel = new JLabel("Welcome to Coding Challenge!");
        welcomeLabel.setFont(labelFont);
        panel.add(welcomeLabel);

        statusLabel = new JLabel("Please select your status:");
        statusLabel.setFont(labelFont);
        panel.add(statusLabel);

        JButton studentButton = new JButton("Student");
        studentButton.setActionCommand("Student");
        studentButton.addActionListener(this);
        studentButton.setBackground(buttonColor);
        studentButton.setFont(buttonFont);
        panel.add(studentButton);

        JButton educatorButton = new JButton("Educator");
        educatorButton.setActionCommand("Educator");
        educatorButton.addActionListener(this);
        educatorButton.setBackground(buttonColor);
        educatorButton.setFont(buttonFont);
        panel.add(educatorButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Student")) {//student input
            String name = showInputDialogWithStyle("Hello Student. What is your name?", "Student's Name");
            String educatorName = showInputDialogWithStyle("What is your Educator's name?", "Educator's Name");
            statusLabel.setText("Hello " + name);

            // Check if the student has challenges assigned
            Student student = new Student(name, educatorName);
            if (student.hasChallengesAssigned()) {
                JOptionPane.showMessageDialog(this, name + " has challenges assigned.");
            } //only show for challenges
        } else if (command.equals("Educator")) { //educator input
            String name = showInputDialogWithStyle("Hello Educator. What is your name?", "Educator's Name");
            String studentName = showInputDialogWithStyle("What is your student's name?", "Student's Name");
            statusLabel.setText("Hello " + name);

            // Educator assigns challenges to the student
            Educator educator = new Educator(name, studentName);
            String title = showInputDialogWithStyle("Enter the Title of the Coding Challenge:", "Title");
            String desc = showInputDialogWithStyle("Enter a Description of the Challenge:", "Description");
            String diff = showInputDialogWithStyle("Enter the Difficulty Level (Easy, Medium, Hard):", "Difficulty Level");
            String lang = showInputDialogWithStyle("Enter Coding language:", "Language");

            // Create + assign the coding challenge
            CodingChallenge challenge = new CodingChallenge(title, desc, diff, lang);
            educator.addCodingChallenge(challenge);

            JOptionPane.showMessageDialog(this, "Coding Challenge Assigned to: "+name+"\n" + challenge);
        }
    }

    // make it pretty tbh
    private String showInputDialogWithStyle(String message, String title) {
        JTextField inputField = new JTextField(10);
        inputField.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 204)); //yellow
        panel.add(new JLabel(message));
        panel.add(inputField);
        JOptionPane.showConfirmDialog(null, panel, title, JOptionPane.OK_CANCEL_OPTION);
        return inputField.getText();
    }

    public static void main(String[] args) {
        new Main();
    }
}
