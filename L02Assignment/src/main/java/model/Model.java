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
    
    public Model(){
        p1 = new FootballPlayer(1, "Arya", "Center", new Height(6, 2), 70, "Mumbai", "Smt. Sulochanadevi Singhania School");
        p2 = new FootballPlayer(2, "John", "Offensive Guard", new Height(5, 5), 80, "New York", "Brooklyn Central High");
        p3 = new FootballPlayer(3, "Harry", "Offensive Tackle", new Height(6, 0), 75, "Philadelphia", "John Cannon Cathedral School");
        ofl = new OffensiveLine(p1, p2, p3);
        System.out.println(ofl.toString());
        Height avg = new Height(Math.round((p1.getHeight().getHeightInInches() + p2.getHeight().getHeightInInches() + p3.getHeight().getHeightInInches())/3f));
        System.out.println("Average height of the offensive line is: " + avg.toString());
        System.out.println("Average weight of the offensive line is: " + Math.round((p1.getWeight() + p2.getWeight() + p3.getWeight())/3f) + " lbs");
    }
}
