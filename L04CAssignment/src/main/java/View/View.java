package View;

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */
import Model.FootballPlayer;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;

public class View {

    private InitialFrame mf;

    /**
     * Default/Empty constructor
     */
    public View() {
        mf = new InitialFrame();
        mf.getIp();
    }

    /**
     * @return the mf
     */
    public InitialFrame getMf() {
        return mf;
    }

    /**
     * @param mf the mf to set
     */
    public void setMf(InitialFrame mf) {
        this.mf = mf;
    }
    
    /**
     * This method initializes the table with blank buttons in the given number of rows and columns
     * @param linesToBeDisplayed the number of rows to be displayed
     * @param numberOfHeaders the number of columns(headers) to be displayed
     */
    public void centerInitialSetup(int linesToBeDisplayed, int numberOfHeaders) {
        mf.getIp().getCp().setLayout(new GridLayout(linesToBeDisplayed + 1, numberOfHeaders));
        mf.getIp().getCp().setRows(linesToBeDisplayed);
        mf.getIp().getCp().setColumns(numberOfHeaders);
        mf.getIp().getCp().display();

    }
    
    /**
     * This method updates the table with values from the FootballPlayerData that is passed to it
     * @param footballPlayerData is the data of the players that is to be displayed in the table
     * @param headers is the headers of the columns that are to be displayed
     */
    public void centerUpdate(ArrayList<ArrayList<String>> footballPlayerData, ArrayList<String> headers) {
        for(int i = 0 ; i < headers.size() ; i++){
            mf.getIp().getCp().getHeaderButtonArray().get(i).setText(headers.get(i));
        }
        
        for(int i = 0 ; i < footballPlayerData.size() ; i++){
            for(int j = 0 ; j < headers.size() ; j++){
                mf.getIp().getCp().getBodyButtonArray().get(i).get(j).setText(footballPlayerData.get(i).get(j));
                
            }
        }
        mf.getIp().getCp().validate();
        mf.getIp().getCp().repaint();
        
    }
}
