package model;

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */
public class FootballPlayer extends Person {

    private int number;
    
    private String position;

    
    public FootballPlayer(){
        number = 0;        
        position = "";
        
    }
    
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
}
