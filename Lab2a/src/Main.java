import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Prostokat p1 = new Prostokat(1,2);
        System.out.println(p1.getA());
        p1.info();
        System.out.println("Pole wynosi: " + p1.pole());
        Prostokat p2 = new Prostokat();
        p2.setB(2);
        p2.setA(3);
        p2.info();
        System.out.println(p2.getB());
        System.out.println("Pole wynosi: " + p2.pole());

        Kolo k1 = new Kolo(4);
        k1.info();
        System.out.println("Pole wynosi: " + k1.pole());
        List<Figura> figury = new ArrayList<>();
        figury.add(p1);
        figury.add(p2);
        figury.add(k1);

        for(var el:figury)
            if(el.pole() < 4) {
                el.info();
        }
    }
}