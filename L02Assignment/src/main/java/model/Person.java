
package model;

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */
public class Person {
    private String name;
    private Height height;
    private int weight;
    private String hometown;
    private String highSchool;
    
    /**
     * Default/Empty constructor
     */
    public Person()
    {
        name = "";
        height = new Height();
        weight = 0;
        hometown = "";
        highSchool = "";
    }
    
    /**
     * Parameterized constructor
     */
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
    
    /**
     * Overrides method in the Person class
     */
    @Override
    public String toString(){
        return "Name: " + name + " | Height: "+ height.toString() + " | Weight: " + weight + " lbs | Hometown: " + hometown + " | High School: "+ highSchool;
    }
}
