package figuras;

import java.util.Arrays;

public class Util {
    public static double areaPromedio(FiguraGeometrica arr[]){
        int suma = 0;
        int muestra = arr.length;

        for(FiguraGeometrica fig : arr){
            suma += fig.area();
        }

        return suma / muestra;
    }
}
