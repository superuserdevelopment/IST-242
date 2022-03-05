package Model;
/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */


import java.util.ArrayList;

/**
 * This class is used to execute the functions in the FootballPlayerData class
 */
public class Model
{
    /**
     * Default/Empty constructor
     */
    public Model()
    {
        FootballPlayerData fpData = new FootballPlayerData();
        System.out.println("=============================================================");
        System.out.println(fpData.getHeaders().toString());
        System.out.println("=============================================================");
        System.out.println(fpData.getLine(50).toString());
        System.out.println("=============================================================");
        ArrayList<ArrayList<String>> lines = fpData.getLines(0, 4);
        for (int i = 0; i < lines.size(); i++)
        {
            System.out.println(lines.get(i).toString());
        }
        System.out.println("=============================================================");
    }
}
