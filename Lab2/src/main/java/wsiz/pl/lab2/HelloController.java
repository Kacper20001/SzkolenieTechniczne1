package wsiz.pl.lab2;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML private Label l_info;
    @FXML private RadioButton blueRadioButton;
    @FXML private RadioButton redRadioButton;
    @FXML private RadioButton radioButtonOne;
    @FXML private  RadioButton radioButtonTwo;
    @FXML private ImageView choosenImage;
    @FXML private RadioButton calendarRadioButton;
    @FXML private RadioButton contactsRadioButton;

    @FXML
    private  void changeColor() {
        if(blueRadioButton.isSelected()) {
            l_info.setTextFill(Color.BLUE);
        } else if (redRadioButton.isSelected()){
            l_info.setTextFill(Color.RED);
        } else {
            l_info.setTextFill(Color.GREEN);
        }
    }
    @FXML
    private void changeNumber() {
        if(radioButtonOne.isSelected()) {
            l_info.setText("1");
        } else if (radioButtonTwo.isSelected()) {
            l_info.setText("2");
        } else {
            l_info.setText("3");
        }
    }
    @FXML
    private void changeImage() {
        try {
            if (calendarRadioButton.isSelected()) {
                choosenImage.setImage(new Image(getClass().getResourceAsStream("Calendar.jpg")));
            } else if (contactsRadioButton.isSelected()) {
                choosenImage.setImage(new Image(getClass().getResourceAsStream("Contacts.jpg")));
            } else {
                choosenImage.setImage(new Image(getClass().getResourceAsStream("Home.jpg")));
            }
        } catch (Exception e) {
            System.err.println("There was a problem loading the image: " + e.getMessage());
        }
    }
    @FXML
    private void closePlatformAction() {
        Platform.exit();
    }

}