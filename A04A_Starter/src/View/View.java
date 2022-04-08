package View;

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */

import Model.Student;
import java.util.ArrayList;
import javax.swing.BoxLayout;

public class View
{

    private MainFrame mf;
    
    /**
     * Default/Empty constructor
     */
    public View()
    {        
        mf = new MainFrame();
    }

    /**
     * @return the mf
     */
    public MainFrame getMf()
    {
        return mf;
    }

    /**
     * @param mf the mf to set
     */
    public void setMf(MainFrame mf)
    {
        this.mf = mf;
    }
    
    /** 
     * @param student is the ArrayList of student objects whose details are to be displayed
     * 
     */
    public void displayData(ArrayList<Student> students){        
        //System.out.println(student.getInfo()+" "+student.creditsThisSemester());
        for(int i = 0 ; i < students.size() ; i++){
            mf.getIp().setButtonData(students.get(i).getInfo(), i);
        }
    }
}
