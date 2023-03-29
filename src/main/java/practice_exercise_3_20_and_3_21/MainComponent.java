package practice_exercise_3_20_and_3_21;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.*;

public class MainComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;

        // Add at least three houses of different positions and sizes

        House house1 = new House(50, 50, 80, 80);
        House house2 = new House(200, 200, 80, 100);
        House house3 = new House(450, 200, 125, 120);

        house1.drawHouse(g2);
        house2.drawHouse(g2);
        house3.drawHouse(g2);


    }
}
