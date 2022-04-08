package Controller;

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */

import Model.Model;
import View.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;

public class Controller
{

    Model model;
    View view;
    
    /**
     * Default/Empty constructor
     */
    public Controller(Model model, View view)
    {
        this.model = model;
        this.view = view;
        //Code to display the output
        view.displayData(model.findStudents());
    }

}
