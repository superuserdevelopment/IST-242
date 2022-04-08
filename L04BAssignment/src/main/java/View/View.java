package View;

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */

import Model.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
     * @param students is the ArrayList of student objects whose details are to be displayed
     * 
     */
    public void displayData(ArrayList<Student> students){        
        //System.out.println(student.getInfo()+" "+student.creditsThisSemester());
        for(int i = 0 ; i < students.size() ; i++){
            mf.getIp().setButtonData(students.get(i).getInfo(), i);
        }
    }
    
    /** 
     * @param student is the ArrayList of student objects whose details are to be displayed
     * 
     */
    public void displayIndividualData(Student student, int index){  
        student.creditsThisSemester();
        mf.getIp().setButtonData(student.getInfo(), index);
        
    }
    
    /** 
     * @param e is the ActionListener object to be assigned to each button
     * @param index is used to identify button whose ActionListener is to be sets
     */
    public void setActionListener(ActionListener e, int index){
        mf.getIp().setActionListener(e, index);
    }
}
