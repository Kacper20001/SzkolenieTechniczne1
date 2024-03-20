module wsiz.pl.lab1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens wsiz.pl.lab1 to javafx.fxml;
    exports wsiz.pl.lab1;
}