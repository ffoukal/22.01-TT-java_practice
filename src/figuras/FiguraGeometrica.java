package figuras;

public abstract class FiguraGeometrica {

    abstract double area();

    @Override
    public String toString(){
        return "El area es de: " + area();
    }
}
