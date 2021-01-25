package figuras;

public class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area(){
        return Math.PI*Math.pow(radio, 2);
    }
}
