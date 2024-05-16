package cme;
import javax.swing.*;
import java.awt.Color;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Still running!" );

        BpmInput bpmInput = new BpmInput();
        bpmInput.setBackground(new Color(57, 70, 84));

        JFrame frame = new JFrame();

        frame.add(bpmInput);

        // WINDOW SETTINGS
        frame.setTitle("DeskMet"); // Sets title of the frame

        // TODO: Change back to HIDE_ON_CLOSE
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits out of application on window close
        frame.setLocationRelativeTo(null); // Centers frame on opening
        frame.setSize(400, 400); // Sets x dimension, then y dimension of the frame
        frame.getContentPane().setBackground(new Color(57, 70, 84)); // sets the background color
        frame.setVisible(true); // makes the frame visible
        // setForeground(Color.white);
    }
}
