import javax.swing.*;
import java.awt.*;

public class CalculatorGridLayout {
    public static void main(String[] args) {
        // 1. Create the main application frame
        JFrame frame = new JFrame("Calculator - GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);

        // 2. Set BorderLayout on the frame for header (display screen) and keypad
        frame.setLayout(new BorderLayout(5, 5));

        // --- TOP: Calculator Display Screen ---
        JTextField displayField = new JTextField("0");
        displayField.setEditable(false);
        displayField.setFont(new Font("SansSerif", Font.BOLD, 22));
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setBackground(Color.WHITE);
        
        // Add padding around display using a north panel
        JPanel displayPanel = new JPanel(new BorderLayout());
        displayPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));
        displayPanel.add(displayField);
        frame.add(displayPanel, BorderLayout.NORTH);

        // --- CENTER: Calculator Buttons Keypad ---
        // Create a panel with GridLayout (4 rows, 4 columns, with 5px horizontal/vertical gaps)
        JPanel keypadPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        keypadPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));

        // Array of button labels representing a standard calculator layout
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        // Loop through the array and add each button to the grid
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("SansSerif", Font.BOLD, 16));
            keypadPanel.add(button);
        }

        // Add the keypad panel to the center of the frame
        frame.add(keypadPanel, BorderLayout.CENTER);

        // 3. Make the frame visible on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> frame.setVisible(true));
    }
}