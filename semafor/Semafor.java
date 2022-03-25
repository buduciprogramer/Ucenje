package semafor;

import javax.swing.*;

public class Semafor {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new StopSemafor();

        frame.add(panel);
    frame.setSize(250,350);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

    }

}
