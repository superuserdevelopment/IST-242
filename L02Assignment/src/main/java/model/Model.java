package model;
/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */
import model.Height;
public class Model {
    private FootballPlayer p1, p2, p3;
    private OffensiveLine ofl;
    
    /**
     * Default constructor
     */
    public Model(){
        p1 = new FootballPlayer(1, "Arya", "Center", new Height(6, 2), 70, "Mumbai", "Smt. Sulochanadevi Singhania School");
        p2 = new FootballPlayer(2, "John", "Offensive Guard", new Height(5, 5), 80, "New York", "Brooklyn Central High");
        p3 = new FootballPlayer(3, "Harry", "Offensive Tackle", new Height(6, 0), 75, "Philadelphia", "John Cannon Cathedral School");
        ofl = new OffensiveLine(p1, p2, p3);
        System.out.println(ofl.toString());
        System.out.println("Average height of the offensive line is: " + ofl.getAverageHeight().toString());
        System.out.println("Average weight of the offensive line is: " + ofl.getAverageWeight() + " lbs");
    }
}
