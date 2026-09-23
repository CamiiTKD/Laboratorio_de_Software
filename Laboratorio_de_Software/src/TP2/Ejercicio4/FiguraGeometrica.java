package TP2.Ejercicio4;

import java.io.Serializable;

public abstract class FiguraGeometrica implements Serializable {
    // Identificador único de versión para la serialización
    private static final long serialVersionUID = 1L;
    private String color;

    public FiguraGeometrica() {

    }

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public abstract void dibujar();
    public abstract double area();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
