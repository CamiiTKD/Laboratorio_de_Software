package TP1.Ejercicio5;

public abstract class FiguraGeometrica {
    private String color;

    public FiguraGeometrica() {
    }

    public abstract void dibujar();

    public abstract int area();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    //clase previa a transformar las subclases en final para que solo puedan heredar del sealed.
}
