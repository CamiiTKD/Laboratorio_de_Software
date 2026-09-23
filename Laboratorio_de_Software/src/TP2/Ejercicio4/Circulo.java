package TP2.Ejercicio4;

public class Circulo extends FiguraGeometrica {
    private static final long serialVersionUID = 1L;
    private int radio;

    public Circulo() {

    }

    public Circulo(int radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un círculo de radio " + radio + " y de color " + getColor());
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
