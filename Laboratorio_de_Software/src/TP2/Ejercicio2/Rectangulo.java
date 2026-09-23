package TP2.Ejercicio2;

public class Rectangulo extends FiguraGeometrica {
    private int alto;
    private int ancho;

    public Rectangulo() {

    }

    public Rectangulo(int alto, int ancho, String color) {
        super(color);
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un rectángulo de alto " + alto + ", ancho " + ancho + " y de color " + getColor());
    }

    @Override
    public int area() {
        return alto * ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
}
