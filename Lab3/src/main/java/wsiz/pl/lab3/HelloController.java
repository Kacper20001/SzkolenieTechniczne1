package wsiz.pl.lab3;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.collections.ListChangeListener;
import javafx.collections.ListChangeListener.Change;


public class HelloController {
    @FXML
    private TableColumn<Osoba, String> col_imie;
    @FXML
    private TableColumn<Osoba, String> col_nazwisko;
    @FXML
    private TableView<Osoba> tabela;
    @FXML private TextField input_imie;
    @FXML private TextField input_nazwisko;
    @FXML
    public void initialize() {
        col_imie.setCellValueFactory(new PropertyValueFactory<>("imie"));
        col_nazwisko.setCellValueFactory(new PropertyValueFactory<>("nazwisko"));

        ObservableList<Osoba> lista = FXCollections.observableArrayList();
        lista.add(new Osoba("Jan", "Kowalski"));
        lista.add(new Osoba("Zbigniew", "Wiśniewski"));
        lista.add(new Osoba("Tomek", "Michniewicz"));
        tabela.setItems(lista);

        TableViewSelectionModel<Osoba> selectionModel = tabela.getSelectionModel();
        selectionModel.setSelectionMode(SelectionMode.SINGLE);

        selectionModel.getSelectedItems().addListener(new ListChangeListener<Osoba>() {
            @Override
            public void onChanged(Change<? extends Osoba> change) {
                if (!change.getList().isEmpty()) {
                    Osoba selectedOsoba = change.getList().get(0);
                    input_imie.setText(selectedOsoba.getImie());
                    input_nazwisko.setText(selectedOsoba.getNazwisko());
                }
            }
        });

    }
    @FXML
    public void dodaj_Osobe() {
        String Imie = input_imie.getText().toString();
        String Nazwisko = input_nazwisko.getText().toString();

        if (!Imie.isEmpty() &&  !Nazwisko.isEmpty()) {
            Osoba nowaOsoba = new Osoba(Imie, Nazwisko);
            tabela.getItems().add(nowaOsoba);
            input_imie.clear();
            input_nazwisko.clear();
        }
    }

}