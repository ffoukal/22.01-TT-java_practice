package figuras;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica c = new Circulo(4);
        FiguraGeometrica t = new Triangulo(2, 4);
        FiguraGeometrica r = new Rectangulo(3, 5);
        FiguraGeometrica[] arr = {c, t, r};

        System.out.println(c);
        System.out.println(t);
        System.out.println(r);

        System.out.println(Util.areaPromedio(arr));
    }
}
