public class Kolo extends Figura{
    private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }
    public void setPromien(double promien) {
        this.promien = promien;
    }
    public double getPromien() {
        return promien;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Koło o promieniu: " + promien);
    }
    @Override
    public double pole() {
        return Math.PI * promien * promien;
    }
}
