package TP2.Ejercicio2;

public abstract class FiguraGeometrica implements Comparable<FiguraGeometrica> {
    private String color;

    public FiguraGeometrica() {

    }

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public abstract void dibujar();
    public abstract int area();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    } // Regla de comparación: una figura A es menor que B si su área es menor

    @Override
    public int compareTo(FiguraGeometrica otra) {
        return Double.compare(this.area(), otra.area());
    // También equivale a: return this.area() - otra.area();
    }
}