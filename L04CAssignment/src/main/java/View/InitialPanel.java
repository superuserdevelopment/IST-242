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

public class InitialPanel extends JPanel {

    private CenterPanel cp;

    /**
     * Default/Empty constructor
     */
    public InitialPanel() {
        cp = new CenterPanel();
        add(cp);
    }

    /**
     * @return the cp
     */
    public CenterPanel getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(CenterPanel cp) {
        this.cp = cp;
        add(cp);
    }

}
