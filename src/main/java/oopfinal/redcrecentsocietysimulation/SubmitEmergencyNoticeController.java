package oopfinal.redcrecentsocietysimulation;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SubmitEmergencyNoticeController
{
    @javafx.fxml.FXML
    private ComboBox toComboBox;
    @javafx.fxml.FXML
    private TextArea Noticefield;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextField TitleField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SubmitNoticeOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void backOnAction(ActionEvent actionEvent) {
    }
}