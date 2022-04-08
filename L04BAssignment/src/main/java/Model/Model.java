package Model;

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */

import java.util.ArrayList;

public class Model
{

    ArrayList<Student> sts = new ArrayList<>();
    
    /**
     * Default/Empty constructor
     */
    public Model()
    {
        //creates 3 students
        MailAddress addr1 = new MailAddress("107 W College Avenue", "State College", "PA", 16801);
        Student st1 = new Student("Emily", "Smith", 20, addr1);
        MailAddress addr2 = new MailAddress("200 W College Avenue", "State College", "PA", 16801);
        Student st2 = new Student("Mary", "Doe", 20, addr2);
        MailAddress addr3 = new MailAddress("300 W College Avenue", "State College", "PA", 16801);
        Student st3 = new Student("John", "Doe", 20, addr3);
        //add them to the array of students
        sts.add(st1);
        sts.add(st2);
        sts.add(st3);
    }
    
    /** 
     * @param n is the index of the student object in the ArrayList
     * @return the Student object in the ArrayList according to the argument passed
     */
    public Student findStudent(int n){
        if(n >= sts.size()) return null;
        return sts.get(n);
    }
    
    /** 
     * @return the ArrayList of Student objects in the ArrayList according to the argument passed
     */
    public ArrayList<Student> findStudents(){
        return sts;
    }
    
    

}
