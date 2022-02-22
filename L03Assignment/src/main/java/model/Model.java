package model;
/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */
import model.Height;
public class Model
{
 public Model()
 {
        FootballPlayer fp = new FootballPlayer(2, "Marcus Allen", "S", new Height(6, 2), 209, "Upper Marlboro, MD", "Dr. Henry A. Wise");
        System.out.println(fp.getAttributes().toString());
        System.out.println(fp.getAttributes().toString()); //Yes, we are running getAttributes twice just to test it
        for (int i = 0; i < fp.getAttributes().size(); i++)
        {
            System.out.println(i + " = " + fp.getAttributeName(i) + " - " + fp.getAttribute(i));
        }
        System.out.println(fp.getAttributeNames().toString());
        System.out.println(fp.getAttributeNames().toString()); //Yes, we are running getAttributeNames twice just to test it
        //if the implementation of TableMember by FootballPlayer is correct, 
        //the output will be
        //
        //[Marcus Allen, 6'2", 209, Upper Marlboro, MD, Dr. Henry A. Wise, 2, S]
        //[Marcus Allen, 6'2", 209, Upper Marlboro, MD, Dr. Henry A. Wise, 2, S]
        //0 = name - Marcus Allen
        //1 = height - 6'2"
        //2 = weight - 209
        //3 = hometown - Upper Marlboro, MD
        //4 = highSchool - Dr. Henry A. Wise
        //5 = number - 2
        //6 = position - S
        //[name, height, weight, hometown, highSchool, number, position]
        //[name, height, weight, hometown, highSchool, number, position]        //
  }
}
