package TP1.Ejercicio5;

// Se declara la clase abstracta como sealed indicando las subclases permitidas
public abstract sealed class FiguraGeometricaSealed permits Circulo, Rectangulo {
    private String color;

    public FiguraGeometricaSealed() {}

    public abstract void dibujar();
    public abstract int area();

    public void setColor(String color) { this.color = color; }
    public String getColor() { return color; }
}
