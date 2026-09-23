package TP2.Ejercicio2;

public class Paint {
    private FiguraGeometrica[] paleta;

    public Paint() {

    }

    public FiguraGeometrica[] getPaleta() {
        return paleta;
    }

    public void setPaleta(FiguraGeometrica[] paleta) {
        this.paleta = paleta;
    }

    public void init() {
        paleta = new FiguraGeometrica[4];
        paleta[0] = new Circulo(2, "azul"); // Área ≈ 12
        paleta[1] = new Circulo(3, "amarillo"); // Área ≈ 28
        paleta[2] = new Rectangulo(2, 3, "verde"); // Área = 6
        paleta[3] = new Rectangulo(4, 10, "rojo"); // Área = 40
    }
}
