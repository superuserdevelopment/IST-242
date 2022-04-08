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

public class Controller {

    Model model;
    View view;

    /**
     * Default/Empty constructor
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        //Code to display the output
        view.displayData(model.findStudents());
        ButtonOneListener buttonOneListener = new ButtonOneListener();
        view.setActionListener(buttonOneListener, 0);
        ButtonTwoListener buttonTwoListener = new ButtonTwoListener();
        view.setActionListener(buttonTwoListener, 1);
        ButtonThreeListener buttonThreeListener = new ButtonThreeListener();
        view.setActionListener(buttonThreeListener, 2);
    }

    /**
     * Inner Class for setting ActionListener for Button-1
     */
    class ButtonOneListener implements ActionListener {

        /**
         * Overrides actionPerformed method in ActionListener interface to perform desired operation when the button is clicked
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            view.displayIndividualData(model.findStudent(0), 0);
        }
    }

    /**
     * Inner Class for setting ActionListener for Button-2
     */
    class ButtonTwoListener implements ActionListener {
        
        /**
         * Overrides actionPerformed method in ActionListener interface to perform desired operation when the button is clicked
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            view.displayIndividualData(model.findStudent(1), 1);
        }
    }

    /**
     * Inner Class for setting ActionListener for Button-3
     */
    class ButtonThreeListener implements ActionListener {
        
        /**
         * Overrides actionPerformed method in ActionListener interface to perform desired operation when the button is clicked
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            view.displayIndividualData(model.findStudent(2), 2);
        }
    }

}
