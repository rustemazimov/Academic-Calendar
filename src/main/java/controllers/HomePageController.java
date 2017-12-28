package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class HomePageController {

    @FXML private ChoiceBox<String> monthChoiceBox;

    @FXML private ChoiceBox<String> yearChoiceBox;

    @FXML private ListView<String> eventListVIew;

    @FXML private TextField searchTextFIeld;

    @FXML private Text statusText;

    @FXML private TextField titleTextField;

    @FXML private TextField detailsTextField;

    @FXML private DatePicker datePicker;

    @FXML private GridPane calendarGridPane;





}
