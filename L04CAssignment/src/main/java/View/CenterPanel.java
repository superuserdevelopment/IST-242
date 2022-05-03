package View;

import Model.FootballPlayerData;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */
public class CenterPanel extends JPanel {

    private ArrayList<ArrayList<JButton>> BodyButtonArray;
    private ArrayList<JButton> HeaderButtonArray;
    private int columns;
    private int rows;

    /**
     * Default/Empty constructor
     */
    public CenterPanel() {
        super();
        setPreferredSize(new Dimension(1120, 680));
        HeaderButtonArray = new ArrayList<JButton>();
        BodyButtonArray = new ArrayList<>();
    }

    /**
     * This method displays the output in the panel
     */
    public void display() {
        
        for (int i = 0; i < getColumns(); i++) {
            JButton jb = new JButton("");
            jb.setBackground(Color.black);
            jb.setForeground(Color.white);
            getHeaderButtonArray().add(jb);
            add(getHeaderButtonArray().get(i));
        }
        
        JButton jba[][] = new JButton[rows][columns];
        for (int i = 0; i < getRows(); i++) {  
            ArrayList<JButton> jbl = new ArrayList<JButton>();
            for (int j = 0; j < getColumns(); j++) {
                JButton jb = new JButton("");
                jb.setBackground(Color.white);
                jb.setForeground(Color.black);
                jbl.add(jb);
                jba[i][j] = jb;
                add(jba[i][j]);
            }
            getBodyButtonArray().add(jbl);
        }
    }

    /**
     * @return the columns
     */
    public int getColumns() {
        return columns;
    }

    /**
     * @param columns the columns to set
     */
    public void setColumns(int columns) {
        this.columns = columns;
    }

    /**
     * @return the rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * @param rows the rows to set
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * @return the BodyButtonArray
     */
    public ArrayList<ArrayList<JButton>> getBodyButtonArray() {
        return BodyButtonArray;
    }

    /**
     * @param BodyButtonArray the BodyButtonArray to set
     */
    public void setBodyButtonArray(ArrayList<ArrayList<JButton>> BodyButtonArray) {
        this.BodyButtonArray = BodyButtonArray;
    }

    /**
     * @return the HeaderButtonArray
     */
    public ArrayList<JButton> getHeaderButtonArray() {
        return HeaderButtonArray;
    }

    /**
     * @param HeaderButtonArray the HeaderButtonArray to set
     */
    public void setHeaderButtonArray(ArrayList<JButton> HeaderButtonArray) {
        this.HeaderButtonArray = HeaderButtonArray;
    }
    

}
