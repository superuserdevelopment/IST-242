package Controller;

import Model.Model;
import View.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;

public class Controller {

    Model model;
    View view;
    int k = 0;

    /**
     * Default/Empty constructor
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        //Code to display the output
        int n1 = 0;
        view.displayData(model.findStudent(n1));
        int n2 = 1;
        view.displayData(model.findStudent(n2));
        int n3 = 2;
        view.displayData(model.findStudent(n3));
    }

}
