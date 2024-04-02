public class Prostokat extends Figura{
    private double a;
    private double b;

    public void setA(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }
    public void setB(double b){
        this.b = b;
    }
    public double getB() {
        return b;
    }
    @Override
    public void info() {
        super.info();
        System.out.println("Prostokąt o boku a: " + a + " oraz boku b: " + b);
    }
    @Override
    public double pole() {
        return a*b;
    }
    public Prostokat() {
        this.a = a;
        this.b = b;
    }
    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
