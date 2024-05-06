package cme;

import javax.swing.*;
import java.awt.*;


public class BpmInput extends JPanel {
    
    BpmInput() {


        JPanel bpmField = new JPanel();
        bpmField.setLayout(new FlowLayout());
        

        JLabel label = new JLabel ("Enter your name: ");

        JTextField textField = new JTextField(3);

        bpmField.add(label);
        bpmField.add(textField);

        add(bpmField);
    }
}
