package TP1.Ejercicio5;

public final class Rectangulo extends FiguraGeometricaSealed {
    int alto;
    int ancho;

    public Rectangulo() {
        super();
    }

    public Rectangulo(int alto, int ancho) {
        super();
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public void dibujar() {
        System.out.println("se dibuja un rectángulo de alto " + alto + ", ancho " + ancho + " y de color " + getColor());
    }

    @Override
    public int area() {
        return alto * ancho;
    }
}
