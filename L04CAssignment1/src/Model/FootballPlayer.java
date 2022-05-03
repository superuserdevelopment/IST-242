package Model;
/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */

import java.util.ArrayList;

/**
 * This class is used to store the details of a Football Player
 */
public class FootballPlayer extends Person implements TableMember{

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
     * @param number stores the jersey number of the Football Player
     * @param position stores the position of the Football Player
     * @param name stores the name of the Football Player
     * @param height stored the height of the Football Player
     * @param weight stores the weight of the Football Player
     * @param hometown stores the home town of the Football Player
     * @param highSchool stores the high school of the Football Player
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
    
    /**
     * @param n the index of the attribute for which value is to be returned
     * @return the attribute's value as String or "Attribute not found" if index is invalid
     */
    @Override
    public String getAttribute(int n){
        switch(n){
            case 0:
                return Integer.toString(number);            
            case 1:
                return super.getName();                  
            case 2:
                return position;  
            case 3:
                return super.getHeight().toString();                
            case 4:
                return Integer.toString(super.getWeight());                              
            case 5:
                return super.getHometown();               
            case 6:
                return super.getHighSchool();                               
            default:
                return "Attribute not found";
        }
    }
    
    /**
     * @param n the index of the attribute for which Attribute Name is to be returned
     * @return the attribute's name as String or "Attribute not found" if index is invalid
     */
    @Override
    public String getAttributeName(int n){
        switch(n){
            case 0:
                return "number";
            case 1:
                return "name";                
            case 2:
                return "position";                
            case 3:
                return "height";                
            case 4:
                return "weight";                
            case 5:
                return "hometown";
            case 6:
                return "highSchool";
            default: 
                return "Attribute not found";
        }
    }
    
    /**
     * @return the list of attribute values as ArrayList
     */
    @Override
    public ArrayList<String> getAttributes(){
        ArrayList<String> attributes = new ArrayList<String>();
        int i = 0;
        while(!getAttribute(i).equals("Attribute not found")){
            attributes.add(getAttribute(i));
            i++;
        }        
        return attributes;
    }
    
    /**
     * @return the list of attribute names as ArrayList
     */
    @Override
    public ArrayList<String> getAttributeNames(){
        ArrayList<String> attributes = new ArrayList<String>();
        int i = 0;
        while(!getAttribute(i).equals("Attribute not found")){
            attributes.add(getAttributeName(i));
            i++;
        }        
        return attributes;
    }
    
}
