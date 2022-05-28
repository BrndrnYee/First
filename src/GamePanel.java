import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public void paintComponent(Graphics g)
    {
        Color sky = new Color(135, 206, 235);
        g.setColor(sky);
        g.fillRect(0, 0, 1280, 720);
        Color ground = new Color (135, 235, 164);
        g.setColor(ground);
        g.fillRect(0, 600, 1280, 720);
        Color house = new Color(228, 131, 91);
        g.setColor(house);
        g.fillRect(500, 400, 280, 200);
        Color roof = new Color(170, 74, 68);
        g.setColor(roof);
        int[][] points = {
                {450, 830, 640},
                {400, 400, 250}
        };
        g.fillPolygon(points[0], points[1], 3);
        g.setColor(Color.YELLOW);
        g.fillOval(100, 100, 100, 100);

        g.fillOval(1000, 350, 60, 60);
        g.fillOval(1010, 400, 40, 125);

        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.YELLOW);
        g2d.rotate(Math.toRadians(-10));
        g2d.fillOval(1000, 410, 30, 100);
        g2d.rotate(Math.toRadians(10));
        g.fillOval(1030, 410, 30, 100);
    }

}
