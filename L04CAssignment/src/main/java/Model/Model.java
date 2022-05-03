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
public class Model {

    private FootballPlayerData fpData;

    /**
     * Default/Empty constructor
     */
    public Model() {
        fpData = new FootballPlayerData();
        fpData.setLinesBeingDisplayed(25);
        fpData.setFirstLineToDisplay(0);
    }

    /**
     * @return the fpData
     */
    public FootballPlayerData getFpData() {
        return fpData;
    }

    /**
     * @param fpData the fpData to set
     */
    public void setFpData(FootballPlayerData fpData) {
        this.fpData = fpData;
    }
}
