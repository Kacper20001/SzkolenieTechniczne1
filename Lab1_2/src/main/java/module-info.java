module wsiz.pl.lab1_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens wsiz.pl.lab1_2 to javafx.fxml;
    exports wsiz.pl.lab1_2;
}