module wsiz.pl.lab3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens wsiz.pl.lab3 to javafx.fxml;
    exports wsiz.pl.lab3;
}