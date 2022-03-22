package View;

import Model.Student;
import java.util.ArrayList;
import javax.swing.JButton;

public class View
{

    /**
     * Default/Empty constructor
     */
    public View()
    {
        
    }
    
    /** 
     * @param student is the student object whose details are to be displayed
     */
    public void displayData(Student student){
        System.out.println(student.getInfo()+" "+student.creditsThisSemester());
    }

}
