package model;

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */
public class FootballPlayer extends Person {

    private int number;
    
    private String position;

    /**
     * Default/Empty constructor
     */
    public FootballPlayer(){
        //Written -1 so as to not clash with anyone with a number zero
        number = -1;        
        position = "";        
    }
    
    /**
     * Parameterized constructor
     */
    public FootballPlayer(int number, String name, String position, Height height, int weight, String hometown, String highSchool){
        super(name, height, weight, hometown, highSchool);
        this.number = number;        
        this.position = position;        
    }
    
    /**
     * @return the number of the football player
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number of the football player to be set
     */
    public void setNumber(int number) {
        this.number = number;
    }
    
    /** 
     * @return the position of the football player
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position of the football player to be set
     */
    public void setPosition(String position) {
        this.position = position;
    }
    
    /**
     * Overrides method in the Person class
     */
    @Override
    public String toString(){
        return super.toString() + " | Number: " + number + " | Position: " + position;
    }
}
