module wsiz.pl.lab2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens wsiz.pl.lab2 to javafx.fxml;
    exports wsiz.pl.lab2;
}