package slika;

import javax.swing.*;


public class Slika extends JFrame {

    JFrame frame;
    JLabel displayfield;
    ImageIcon slika;

    public Slika() {

        frame = new JFrame("Displaj slike test");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        try {
slika=new ImageIcon(getClass().getResource("golf.jpg"));
displayfield=new JLabel(slika);
frame.add(displayfield);
        } catch (Exception e) {
            System.out.println("Slika se ne moze pronaci");
        }
frame.pack();
    frame.setVisible(true);
    }

    public static void main(String[] args) {
        Slika slika=new Slika();
    }
}
