package Model;
/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */

/**
 * This class is used to store the height of a person in feet and inches
 */
public class Height {
    private int feet;
    private int inches;
    
    /**
     * Default constructor
     */
    public Height(){
        feet = 0;
        inches = 0;
    }
    
    /**
     * Parameterized constructor
     * @param feet stores the height in feet
     * @param inches stores the height in inches
     */
    public Height(int feet, int inches){
        this.feet = feet;
        this.inches = inches;
    }
    
    /**
     * Parameterized constructor
     * @param inches stores the height in inches
     */
    public Height(int inches){
        this.feet = inches/12;
        this.inches = inches%12;
    }


    /**
     * @return the feet
     */
    public int getFeet() {
        return feet;
    }

    /**
     * @param feet the feet to set
     */
    public void setFeet(int feet) {
        this.feet = feet;
    }

    /**
     * @return the inch
     */
    public int getInches() {
        return inches;
    }

    /**
     * @param inches the inch to set
     */
    public void setInches(int inches) {
        this.inches = inches;
    }
    
    /**
     * @return the height in a format of feet'inches"
     */
    public String toString(){
        return feet + "\'" + inches + "\"";
    }
    
    public int getHeightInInches(){
        return feet * 12 + inches;
    }
}
