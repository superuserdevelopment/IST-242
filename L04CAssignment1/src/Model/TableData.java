package Model;
/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */

import java.util.ArrayList;

public interface TableData
{

    public void loadTable();

    public ArrayList getTable();

    public ArrayList<String> getHeaders();

    public ArrayList<String> getLine(int line);

    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine);

}
