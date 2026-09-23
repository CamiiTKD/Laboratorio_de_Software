package TP2.Ejercicio2;

public class Circulo extends FiguraGeometrica {
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

    @Override public int area() {
        return (int) (Math.PI * radio * radio);
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
