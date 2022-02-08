
package model;

import java.util.Objects;

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */
public class OffensiveLine {
    private FootballPlayer center, offensiveGuard, offensiveTackle;
    
    
    public OffensiveLine(FootballPlayer center, FootballPlayer offensiveGuard, FootballPlayer offensiveTackle){
        this.center = center;
        this.offensiveGuard = offensiveGuard;
        this.offensiveTackle = offensiveTackle;
    }
    public OffensiveLine(){
        center = null;
        offensiveGuard = null;
        offensiveTackle = null;
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
     */
    @Override
    public String toString(){ 
        if(Objects.isNull(center) || Objects.isNull(offensiveGuard) || Objects.isNull(offensiveTackle)) return null;
        return "Center: " + center.toString() + "\nOffensive Guard: " + offensiveGuard.toString() + "\nOffensive Tackle: " + offensiveTackle.toString();
    }
}
