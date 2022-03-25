package hrana;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MainJava extends JFrame implements ActionListener {
    JRadioButton pizzabutton;
    JRadioButton hamburgerbutton;
    JRadioButton hotdogbutton;
    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;




    MainJava() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

pizzaIcon=new ImageIcon("resized.jpg");
hamburgerIcon=new ImageIcon("resized1.jpg");
hotdogIcon=new ImageIcon("resized2.jpg");


        pizzabutton = new JRadioButton("pizza");
        hamburgerbutton = new JRadioButton("hamburger");
        hotdogbutton = new JRadioButton("hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzabutton);
        group.add(hamburgerbutton);
        group.add(hotdogbutton);

        pizzabutton.addActionListener(this);
        hamburgerbutton.addActionListener(this);
        hotdogbutton.addActionListener(this);

        pizzabutton.setIcon(pizzaIcon);
        hamburgerbutton.setIcon(hamburgerIcon);
        hotdogbutton.setIcon(hotdogIcon);


        this.add(pizzabutton);
        this.add(hamburgerbutton);
        this.add(hotdogbutton);
        this.pack();
        this.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzabutton) {
            System.out.println("You order pizza!");

        } else if (e.getSource() == hamburgerbutton) {
            System.out.println("You order hamburger!");
        } else if (e.getSource() == hotdogbutton) {
            System.out.println("You order hotdog!");
        }

    }
}