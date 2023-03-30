package practice_exercise_3_20_and_3_21;

import java.awt.*;

public class House {

    private int x, y, width, height;

    public House(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void drawHouse(Graphics2D gDraw){

        Rectangle houseWalls = new Rectangle(x, y, width, height);
        Rectangle houseWindow = new Rectangle(x + (width / 4), y + (height / 4), width/8, height/8);
        Rectangle houseDoor = new Rectangle(x + (width / 2), y + (height / 2), width/4, height/2);

        // Roof
        gDraw.drawLine(x, y, x + (width /2), y - (height / 2));
        gDraw.drawLine(x + width, y, x + (width / 2), y - (height /2));

        gDraw.draw(houseWalls);
        gDraw.draw(houseWindow);
        gDraw.draw(houseDoor);




    }

}
