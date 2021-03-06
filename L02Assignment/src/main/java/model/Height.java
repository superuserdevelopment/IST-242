package model;
/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */

public class Height {
    private int feet;
    private int inch;
    
    /**
     * Default constructor
     */
    Height(){
        feet = 0;
        inch = 0;
    }
    
    /**
     * Parameterized constructor
     */
    Height(int feet, int inch){
        this.feet = feet;
        this.inch = inch;
    }
    
    /**
     * Parameterized constructor
     */
    Height(int inch){
        this.feet = inch/12;
        this.inch = inch%12;
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
    public int getInch() {
        return inch;
    }

    /**
     * @param inch the inch to set
     */
    public void setInch(int inch) {
        this.inch = inch;
    }
    
    /**
     * @return the height in a format of feet'inch"
     */
    public String toString(){
        return feet + "\'" + inch + "\"";
    }
    
    public int getHeightInInches(){
        return feet * 12 + inch;
    }
}
