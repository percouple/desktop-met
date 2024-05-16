package cme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class PlayButton extends JButton {
    
    public PlayButton(String text) {
        super(text);
        setFont(getFont().deriveFont(20f));
        setPreferredSize(new java.awt.Dimension(100, 50));

        addActionListener(new PlayButtonClickListener());
    }

    private class PlayButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("I'm getting clicked yo");
        }
    }
}
