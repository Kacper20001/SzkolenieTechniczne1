package wsiz.pl.lab3;

import javafx.beans.property.SimpleStringProperty;

public class Osoba {
    private SimpleStringProperty imie;
    private SimpleStringProperty nazwisko;

    public Osoba() {
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = new SimpleStringProperty(imie);
        this.nazwisko = new SimpleStringProperty(nazwisko);
    }

    public String getImie() {
        return imie.get();
    }

    public void setImie(String imie) {
        this.imie.set(imie);
    }

    public String getNazwisko(){
        return nazwisko.get();
    }

    public void setNazwisko(String nazwisko){
        this.nazwisko.set(nazwisko);
    }

}
