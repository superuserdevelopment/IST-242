package View;

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class InitialPanel extends JPanel
{
    private JButton b1;
    private JButton b2;
    private JButton b3;
    
    /**
     * Default/Empty constructor
     */
    public InitialPanel()
    {
        super(new GridLayout(3,1));
        setBackground(Color.darkGray);
        b1 = new JButton("number 01");
        add(b1);
        b2 = new JButton("number 01"); 
        add(b2);
        b3 = new JButton("number 01");
        add(b3);
        
    }
    
    /** 
     * Sets relevant Button data from View class
     * @param student is the string data of student object whose details are to be displayed
     * @param index is the location where the details are to be displayed on the layout
     */
    public void setButtonData(String student, int index){
        switch(index){
            case 0:
                b1.setText(student);                
                break;
            case 1:
                b2.setText(student);                
                break;
            case 2:
                b3.setText(student);                
            break;
            default:
                System.out.println("Button index invalid");
        }
    }
    
    /** 
     * Sets the ActionListeners for the buttons in the InitialPanel
     * @param a is the ActionListener to be added to the buttons
     * @param index is the button whose ActionListener is to be set
     */
    public void setActionListener(ActionListener a, int index){
        switch(index){
            case 0:
                b1.addActionListener(a);
            break;
            case 1:
                b2.addActionListener(a);
            break;
            case 2:
                b3.addActionListener(a);
            break;
        }
    }
}
