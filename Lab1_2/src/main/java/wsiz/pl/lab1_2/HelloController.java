package wsiz.pl.lab1_2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    private Label result;
    @FXML
    private TextArea textArea;
    @FXML
    protected void onCountButton() {
        String text = textArea.getText();
        int charCount = text.length();
        String[] words = text.trim().split("\\s+");
        int wordCount = words.length;
        result.setText("Number of characters: " + charCount + "\nNumber of words: " + wordCount);
    }
}