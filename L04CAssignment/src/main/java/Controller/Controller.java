package Controller;

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */
import Model.Model;
import View.View;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;
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
        view.centerInitialSetup(model.getFpData().getLinesBeingDisplayed(), model.getFpData().getHeaders().size());
        view.centerUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(), model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
        addScrolling();
        addHighlighting();
    }

    /**
     * Adds scrolling to the CenterPanel
     */
    private void addScrolling() {
        view.getMf().getIp().getCp().addMouseWheelListener(
                new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent e) {    
                model.getFpData().setFirstLineToDisplay(model.getFpData().getFirstLineToDisplay() + e.getUnitsToScroll());
                view.centerUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(), model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
            }
        }
        );
    }

    /**
     * Adds highlighting to the header buttons
     */
    private void addHighlighting() {
        ArrayList<JButton> header = view.getMf().getIp().getCp().getHeaderButtonArray();
        for (int i = 0; i < model.getFpData().getHeaders().size(); i++) {
            header.get(i).addActionListener(
                    new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    ArrayList<JButton> header = view.getMf().getIp().getCp().getHeaderButtonArray();
                    for (int i = 0; i < model.getFpData().getHeaders().size(); i++) {
                        header.get(i).setBackground(Color.black);
                    }
                    JButton source = (JButton) e.getSource();
                    source.setBackground(Color.red);
                }
            }
            );
        }
    }

}
