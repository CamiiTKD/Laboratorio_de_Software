package TP1.Ejercicio5;

public final class Circulo extends FiguraGeometricaSealed {
    private int radio;

    public Circulo() {
        super();
    }

    public Circulo(int radio) {
        super();
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("se dibuja un círculo de radio " + radio + " y de color " + getColor());
    }

    @Override
    public int area() {
        return (int) (Math.PI * radio * radio);
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }
}
