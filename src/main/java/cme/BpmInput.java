package cme;

import javax.swing.*;
import java.awt.*;


public class BpmInput extends JPanel {
    
    BpmInput() {

        JPanel bpmField = new JPanel();
        bpmField.setLayout(new FlowLayout());

        JLabel label = new JLabel ("Tempo");

        JTextField textField = new JTextField(3);

        bpmField.add(label);
        bpmField.add(textField);

        add(bpmField);
    }
}
