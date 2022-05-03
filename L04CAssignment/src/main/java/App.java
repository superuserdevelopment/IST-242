

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */
import Controller.Controller;
import Model.Model;
import View.View;

class App {

    /**
     * Main method to run the app
     *
     * @param args
     */
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
    }
}
