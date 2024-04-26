import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


//testing for Main --- intersection of all sub/inhereted classes. 
class Test {

    private Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void testStatusLabelNotNull() { //label for GUI
        JLabel statusLabel = main.getStatusLabel();
        assertNotNull(statusLabel);
    }

    @Test
    void testActionPerformed_Student() { //Student check
        JButton studentButton = new JButton();
        studentButton.setActionCommand("Student");
        main.actionPerformed(new ActionEvent(studentButton, ActionEvent.ACTION_PERFORMED, "Student"));
        String expectedText = "Please select your status:";
        assertEquals(expectedText, main.getStatusLabel().getText());
    }

    @Test
    void testActionPerformed_Educator() {//Educator Check
        JButton educatorButton = new JButton();
        educatorButton.setActionCommand("Educator");
        main.actionPerformed(new ActionEvent(educatorButton, ActionEvent.ACTION_PERFORMED, "Educator"));
        String expectedText = "Please select your status:";
        assertEquals(expectedText, main.getStatusLabel().getText());
    }
}
