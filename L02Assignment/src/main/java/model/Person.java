/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Arya
 */
public class Person {
    private String name;
    private Height height;
    private int weight;
    private String hometown;
    private String highSchool;
    
    public Person()
    {
        name = "";
        height = new Height();
        weight = 0;
        hometown = "";
        highSchool = "";
    }
    
    public Person(String name, Height height, int weight, String hometown, String highSchool)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the height
     */
    public Height getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Height height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the hometown
     */
    public String getHometown() {
        return hometown;
    }

    /**
     * @param hometown the hometown to set
     */
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    /**
     * @return the highSchool
     */
    public String getHighSchool() {
        return highSchool;
    }

    /**
     * @param highSchool the highSchool to set
     */
    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }
}
