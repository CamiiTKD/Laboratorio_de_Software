package TP2.Ejercicio4;

public class Rectangulo extends FiguraGeometrica {
    private static final long serialVersionUID = 1L;
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
    public double area() {
        return (double) alto * ancho;
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
