package View;

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */

import java.awt.*;
import javax.swing.*;

public class InitialFrame extends JFrame
{

    private InitialPanel ip;
    
    /**
     * Default/Empty constructor
     */
    public InitialFrame()
    {
        super("IST-242 Table Viewer");
        setupLayoutForMacs();
        ip = new InitialPanel();
        add(ip, "Center");
        //------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1160, 740);
        setVisible(true);
    }

    private void setupLayoutForMacs()
    {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //------------------------------------------------------
    }

    /**
     * @return the ip
     */
    public InitialPanel getIp()
    {
        return ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(InitialPanel ip)
    {
        this.ip = ip;
    }
    
}
