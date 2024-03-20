package wsiz.pl.lab1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label result;
    @FXML
    private TextField pole_a;
    @FXML
    private TextField pole_b;

    private void Operation(char sign){
        try {
            double a = Double.parseDouble(pole_a.getText());
            double b = Double.parseDouble(pole_b.getText());
            double resultValue = 0;
            switch (sign) {
                case '+':
                    resultValue = a + b;
                    break;
                case '-':
                    resultValue = a - b;
                    break;
                case '*':
                    resultValue = a * b;
                    break;
                case '/':
                    if (b == 0) {
                        result.setText("Division by 0 is impossible.");
                        return;
                    }
                    resultValue = a / b;
                    break;
                case '^':
                    resultValue = Math.pow(a,b);
                    break;
            }
            result.setText(Double.toString(resultValue));
        }
        catch (NumberFormatException ex){
            result.setText("Invalid input");
        }
    }
    @FXML
    protected void onPlusButtonClick() {
        Operation('+');
    }
    @FXML
    protected  void onMinusButtonClick() {
        Operation('-');
    }
    @FXML
    protected  void onMultiplicationButtonClick() {
        Operation('*');
    }
    @FXML
    protected  void onDivisionButtonClick() {
        Operation('/');
    }
    @FXML
    protected  void onPowerButtonClick() {
        Operation('^');
    }
}