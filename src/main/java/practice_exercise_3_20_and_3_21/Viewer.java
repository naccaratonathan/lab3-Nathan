package practice_exercise_3_20_and_3_21;

import javax.swing.*;

public class Viewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 500);
        frame.setTitle("Houses");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MainComponent component = new MainComponent();
        frame.add(component);
        frame.setVisible(true);
    }

}
