import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/*
 * HTML embed tag for testing:
 * <applet code="HumanFaceApplet.class" width="400" height="400"></applet>
 */
public class Shapes3 extends Applet {

    @Override
    public void paint(Graphics g) {
        // Set background color
        setBackground(Color.WHITE);

        // 1. Draw Head (Yellow/Skin-toned Circle/Oval)
        g.setColor(new Color(255, 220, 177)); // Peach/Skin tone
        g.fillOval(100, 80, 200, 240);
        g.setColor(Color.BLACK);
        g.drawOval(100, 80, 200, 240); // Outline of the face

        // 2. Draw Left Eye and Right Eye
        g.setColor(Color.WHITE);
        g.fillOval(140, 150, 40, 25);  // Left eye white
        g.fillOval(220, 150, 40, 25);  // Right eye white
        
        g.setColor(Color.BLACK);
        g.drawOval(140, 150, 40, 25);
        g.drawOval(220, 150, 40, 25);

        // Pupils
        g.fillOval(155, 157, 12, 12);  // Left pupil
        g.fillOval(235, 157, 12, 12);  // Right pupil

        // 3. Draw Nose (Line/Triangle structure)
        g.drawLine(200, 180, 190, 220); // Left side of nose
        g.drawLine(190, 220, 210, 220); // Bottom of nose
        g.drawLine(210, 220, 200, 180); // Right side (or simple vertical line)

        // 4. Draw Mouth (Smiling Arc)
        g.setColor(Color.RED);
        g.drawArc(150, 220, 100, 60, 0, -180); // Smiling arc (start angle 0, arc angle -180)

        // 5. Title Text
        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font("SansSerif", Font.BOLD, 16));
        g.drawString("A Simple Human Face", 115, 360);
    }
}