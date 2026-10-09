import javax.swing.*;
import java.awt.*;

public class FlowLayoutAlignmentDemo extends JFrame {
    public FlowLayoutAlignmentDemo() {
        setTitle("FlowLayout Alignment Demonstration");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main panel using BorderLayout to hold sections
        setLayout(new BorderLayout(10, 10));

        // 1. Center Aligned Panel (Default)
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        centerPanel.setBorder(BorderFactory.createTitledBorder("FlowLayout.CENTER"));
        centerPanel.add(new JButton("One"));
        centerPanel.add(new JButton("Two"));
        centerPanel.add(new JButton("Three"));

        // 2. Left Aligned Panel
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        leftPanel.setBorder(BorderFactory.createTitledBorder("FlowLayout.LEFT"));
        leftPanel.add(new JButton("One"));
        leftPanel.add(new JButton("Two"));
        leftPanel.add(new JButton("Three"));

        // 3. Right Aligned Panel
        JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        rightPanel.setBorder(BorderFactory.createTitledBorder("FlowLayout.RIGHT"));
        rightPanel.add(new JButton("One"));
        rightPanel.add(new JButton("Two"));
        rightPanel.add(new JButton("Three"));

        // Container panel to stack the three alignment rows vertically
        JPanel container = new JPanel(new GridLayout(3, 1, 5, 5));
        container.add(leftPanel);
        container.add(centerPanel);
        container.add(rightPanel);

        add(container, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Run on the Event Dispatch Thread (EDT) for thread safety in Swing
        SwingUtilities.invokeLater(() -> {
            new FlowLayoutAlignmentDemo().setVisible(true);
        });
    }
}