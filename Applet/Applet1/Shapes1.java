import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class Shapes1 extends Applet {
    @Override
    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.DARK_GRAY);
        g.drawLine(50, 50, 200, 50);
        g.drawString("Line", 110, 40);
        g.setColor(Color.RED);
        g.drawRect(50, 80, 120, 70);
        g.drawString("Rectangle", 80, 165);
        g.setColor(Color.GREEN);
        g.drawOval(220, 80, 80, 80);
        g.drawString("Circle", 245, 175);
        g.setColor(Color.BLUE);
        int[] xPoints = {150, 100, 200}; 
        int[] yPoints = {200, 300, 300};
        g.drawPolygon(xPoints, yPoints, 3);
        g.drawString("Triangle", 135, 320);
    }
}