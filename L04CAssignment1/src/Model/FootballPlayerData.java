package Model;
/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

/**
 * This class is used to read the XML file and store the Football Players data in Football Player Objects
 */
public class FootballPlayerData implements TableData
{
    private ArrayList<FootballPlayer> players;
    
    /**
     * Default/Empty constructor
     */
    public FootballPlayerData()
    {
        players = new ArrayList<>();
        loadTable();
    }
    
    /**
     *Reads the data from the XML file and encodes it in the form of FootballPlayer objects
     */
    public void readPlayersFromXML()
    {
        try
        {
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
            fp = new FootballPlayer();
            while (fp != null)
            {
                try
                {
                    fp = (FootballPlayer) decoder.readObject();
                    getPlayers().add(fp);

                } catch (ArrayIndexOutOfBoundsException theend)
                {
                    //System.out.println("end of file");
                    break;
                }
            }
            decoder.close();
        } catch (Exception xx) {xx.printStackTrace();}
    }
    
    /**
     *  Loads the table by calling the function to read the XML file
     */
    public void loadTable(){
        readPlayersFromXML();
    }
    
    
    /**
     * @return the headers
     * Returns the headers
     */
    @Override
     public ArrayList<String> getHeaders(){
         return getPlayers().get(0).getAttributeNames();
     }
     
    /**
     * @param line is the line of the table to be returned
     * @return one line in the table
     * Returns a specific line in the table
     */
    @Override 
    public ArrayList<String> getLine(int line){
        if(line >= 0 && line < players.size()){
            return getPlayers().get(line).getAttributes();
        }
        return new ArrayList<String>();
    }
    
    /**
     * @param firstLine is the start of the lines
     * @param lastLine is the end of the lines
     * @return a set of lines
     * This method rolls over the lines.
     * i.e. putting in getLines(4,3) with a 10 line data will get you lines 4,5,6,7,8,9,0,1,2,3
     */
    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine){
        ArrayList<ArrayList<String>> output = new ArrayList<>();
        firstLine = firstLine % players.size();
        lastLine = lastLine % players.size();
        if(firstLine == lastLine){
            output.add(getLine(firstLine));
            return output;
        }
        else{
        do{
            if(firstLine >= players.size()){
                firstLine = 0;
            }
            output.add(getLine(firstLine));
            firstLine++;
        }while(firstLine != lastLine );
        output.add(getLine(firstLine));
        return output;
        }
    }
    
    /**
     * @return the ArrayList of FootballPlayers
     * Returns the ArrayList of FootballPlayers
     */
    @Override
    public ArrayList getTable(){
        return players;
    }

    /**
     * @return the players
     * Returns the players
     */
    public ArrayList<FootballPlayer> getPlayers() {
        return players;
    }

}
