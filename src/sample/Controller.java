package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

public class Controller {
    public Button btnBigBoi;
    public Label lblCount;
    public MenuItem btnClose;
    public MenuItem btnReset;
    Model model = new Model();


    public void handleButtonClick(ActionEvent actionEvent) {
        model.incrementCount();
        lblCount.setText(Integer.toString(model.getCount()));
    }

    public void handleCloseButton(ActionEvent actionEvent) {

    }

    public void handleReset(ActionEvent actionEvent) {
        model.resetCount();
        lblCount.setText("0");
    }
}
