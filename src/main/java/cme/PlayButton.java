package cme;

import javax.swing.*;
import java.awt.Dimension;

public class PlayButton extends JButton {
    
    public PlayButton(String text) {
        super(text);
        setFont(getFont().deriveFont(20f));
        setPreferredSize(new java.awt.Dimension(100, 50));
    }
}
