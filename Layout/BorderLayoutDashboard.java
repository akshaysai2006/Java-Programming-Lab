import javax.swing.*;
import java.awt.*;

public class BorderLayoutDashboard {
    public static void main(String[] args) {
        // 1. Create the main application frame
        JFrame frame = new JFrame("Application Dashboard - BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 450);
        frame.setLocationRelativeTo(null);

        // 2. Set BorderLayout on the frame's content pane (with optional horizontal/vertical gaps)
        frame.setLayout(new BorderLayout(10, 10));

        // --- NORTH REGION: Header ---
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(41, 128, 185)); // Blue shade
        JLabel headerLabel = new JLabel("Welcome to Your Dashboard");
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        headerPanel.add(headerLabel);

        // --- SOUTH REGION: Footer ---
        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(new Color(189, 195, 199)); // Light gray shade
        JLabel footerLabel = new JLabel("Status: Connected | Version 1.0.0");
        footerPanel.add(footerLabel);

        // --- WEST REGION: Menu / Navigation Sidebar ---
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(4, 1, 5, 5));
        menuPanel.setBorder(BorderFactory.createTitledBorder("Navigation"));
        menuPanel.add(new JButton("Home"));
        menuPanel.add(new JButton("Profile"));
        menuPanel.add(new JButton("Settings"));
        menuPanel.add(new JButton("Logout"));

        // --- EAST REGION: Secondary Panel / Widgets ---
        JPanel eastPanel = new JPanel();
        eastPanel.setPreferredSize(new Dimension(120, 0));
        eastPanel.setBorder(BorderFactory.createTitledBorder("Widgets"));
        eastPanel.add(new JLabel("Quick Stats"));

        // --- CENTER REGION: Main Content Area ---
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBorder(BorderFactory.createTitledBorder("Main Content Window"));
        JLabel contentLabel = new JLabel("Dashboard analytics and main tools appear here.");
        contentPanel.add(contentLabel);

        // 3. Add panels to the frame using BorderLayout constraints
        frame.add(headerPanel, BorderLayout.NORTH);
        frame.add(footerPanel, BorderLayout.SOUTH);
        frame.add(menuPanel, BorderLayout.WEST);
        frame.add(eastPanel, BorderLayout.EAST);
        frame.add(contentPanel, BorderLayout.CENTER);

        // 4. Make the frame visible on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> frame.setVisible(true));
    }
}