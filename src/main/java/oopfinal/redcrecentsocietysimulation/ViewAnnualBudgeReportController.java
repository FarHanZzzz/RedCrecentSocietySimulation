package oopfinal.redcrecentsocietysimulation;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewAnnualBudgeReportController
{
    @javafx.fxml.FXML
    private TableColumn toCol;
    @javafx.fxml.FXML
    private TableColumn amountCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableView tableview;
    @javafx.fxml.FXML
    private TableColumn remarksCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void showOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void backOnAction(ActionEvent actionEvent) {
    }
}