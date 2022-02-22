
package model;

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */
public class OffensiveLine {
    private FootballPlayer center, offensiveGuard, offensiveTackle;
    
    /**
     * Parameterized constructor
     */
    public OffensiveLine(FootballPlayer center, FootballPlayer offensiveGuard, FootballPlayer offensiveTackle){
        this.center = center;
        this.offensiveGuard = offensiveGuard;
        this.offensiveTackle = offensiveTackle;
    }
    
    /**
     * Default/Empty constructor
     */
    public OffensiveLine(){
        center = new FootballPlayer();
        offensiveGuard = new FootballPlayer();
        offensiveTackle = new FootballPlayer();
    }

    /**
     * @return the center player
     */
    public FootballPlayer getCenter() {
        return center;
    }

    /**
     * @param center the center player to set
     */
    public void setCenter(FootballPlayer center) {
        this.center = center;
    }

    /**
     * @return the offensiveGuard player
     */
    public FootballPlayer getOffensiveGuard() {
        return offensiveGuard;
    }

    /**
     * @param offensiveGuard the offensiveGuard player to set
     */
    public void setOffensiveGuard(FootballPlayer offensiveGuard) {
        this.offensiveGuard = offensiveGuard;
    }

    /**
     * @return the offensiveTackle
     */
    public FootballPlayer getOffensiveTackle() {
        return offensiveTackle;
    }

    /**
     * @param offensiveTackle the offensiveTackle to set
     */
    public void setOffensiveTackle(FootballPlayer offensiveTackle) {
        this.offensiveTackle = offensiveTackle;
    }
    
    /**
     * Overrides method in the Object class
     * Returns the String representation of the Offensive Line
     */
    @Override
    public String toString(){ 
        return "Center: " + center.toString() + "\nOffensive Guard: " + offensiveGuard.toString() + "\nOffensive Tackle: " + offensiveTackle.toString();
    }
    
    /**
     * Returns the average weight in lbs of the offensive line
     */
    public int getAverageWeight(){
        return Math.round((center.getWeight() + offensiveGuard.getWeight() + offensiveTackle.getWeight())/3f);
    }
    
    /**
     * Returns the average height of the offensive line
     */
    public Height getAverageHeight(){
        return new Height(Math.round((center.getHeight().getHeightInInches() + offensiveGuard.getHeight().getHeightInInches() + offensiveTackle.getHeight().getHeightInInches())/3f));
    }
}
