package com.superuserdev.l01assignment.Model;

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */
public class FootballPlayer {

    private int number;
    private String name;
    private String position;
    private Height height;
    private int weight;
    private String hometown;
    private String highSchool;

    
    public FootballPlayer(){
        number = 0;
        name = "";
        position = "";
        height = new Height();
        weight = 0;
        hometown = "";
        highSchool = "";
    }
    
    public FootballPlayer(int number, String name, String position, Height height, int weight, String hometown, String highSchool){
        this.number = number;
        this.name = name;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;
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
     * @return the name of the football player
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name of the football player to be set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the height of the football player
     */
    public Height getHeight() {
        return height;
    }

    /**
     * @param height the height of the football player to be set
     */
    public void setHeight(Height height) {
        this.height = height;
    }

    /**
     * @return the weight of the football player
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight of the football player to be set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the hometown of the football player
     */
    public String getHometown() {
        return hometown;
    }

    /**
     * @param hometown the hometown of the football player to be set
     */
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    /**
     * @return the highSchool of the football player
     */
    public String getHighSchool() {
        return highSchool;
    }

    /**
     * @param highSchool the highSchool of the football player to be set
     */
    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }
}
