import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/*
 * HTML embed tag for testing:
 * <applet code="CustomShapesApplet.class" width="400" height="300"></applet>
 */
public class Shapes2 extends Applet {

    @Override
    public void paint(Graphics g) {
        // Set the background color of the applet window
        setBackground(Color.WHITE);

        // 1. Draw a Red Rectangle
        g.setColor(Color.RED);
        g.fillRect(50, 50, 160, 90); // Use fillRect for a solid shape, or drawRect for an outline

        // 2. Draw a Blue Oval
        g.setColor(Color.BLUE);
        g.fillOval(230, 50, 110, 90); // Use fillOval for a solid shape, or drawOval for an outline

        // 3. Display message in bold font
        g.setColor(Color.DARK_GRAY);
        Font boldFont = new Font("SansSerif", Font.BOLD, 18);
        g.setFont(boldFont);
        g.drawString("Java Applets are fun!", 105, 200);
    }
}