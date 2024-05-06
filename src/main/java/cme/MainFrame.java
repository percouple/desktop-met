package cme;

import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {
    
    MainFrame() {


        JPanel bpmField = new JPanel();
        bpmField.setLayout(new FlowLayout());
        bpmField.setBackground(new Color(57, 70, 84));

        JLabel label = new JLabel ("Enter your name: ");

        JTextField textField = new JTextField(20);

        bpmField.add(label);
        bpmField.add(textField);

        add(bpmField);

        // WINDOW SETTINGS
        this.setTitle("DeskMet"); // Sets title of the this

        // TODO: Change back to HIDE_ON_CLOSE
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); // exits out of application on window close
        this.setLocationRelativeTo(null); // Centers this on opening
        this.setSize(400, 400); // Sets x dimension, then y dimension of the this
        this.getContentPane().setBackground(new Color(57, 70, 84)); // sets the background color
        this.setVisible(true); // makes the this visible
    }
}
