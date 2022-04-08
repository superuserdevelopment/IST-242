

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */

import Controller.Controller;
import Model.Model;
import View.View;

class App
{
    /**
     * Main method to run the app
     * @param args 
     */
    public static void main(String[] args)
    {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
    }
}
