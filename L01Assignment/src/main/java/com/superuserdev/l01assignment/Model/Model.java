/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */
package com.superuserdev.l01assignment.Model;

public class Model {
    public Model(){
        FootballPlayer p1 = new FootballPlayer();
        FootballPlayer p2 = new FootballPlayer(1, "Arya", "Quarter-Back", new Height(6,5), 70, "Mumbai", "Smt. Sulochanadevi Singhania School");
        FootballPlayer p3 = new FootballPlayer(45, "John", "Goalkeeper", new Height(5,5), 80, "Mumbai", "St John The Baptist School");
        compare(p2, p3);        
    }
    
    private void compare(FootballPlayer p1, FootballPlayer p2){
        if(p1.getHeight().getHeightIninches() > p2.getHeight().getHeightIninches())
            System.out.println(p1.getName() + " is taller than " + p2.getName());
        else if(p1.getHeight().getHeightIninches() < p2.getHeight().getHeightIninches())
            System.out.println(p2.getName() + " is taller than " + p1.getName());
        else
            System.out.println(p1.getName() + " and " + p2.getName() + " are of the same height");
    }
}
