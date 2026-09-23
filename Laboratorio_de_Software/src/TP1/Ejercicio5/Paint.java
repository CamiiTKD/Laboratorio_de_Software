package TP1.Ejercicio5;

public class Paint {
    private FiguraGeometricaSealed[] paleta;

    public Paint() {
    }

    public void setPaleta(FiguraGeometricaSealed[] paleta) {
        this.paleta = paleta;
    }

    public FiguraGeometricaSealed[] getPaleta() {
        return paleta;
    }

    public void init() {
        paleta = new FiguraGeometricaSealed[4];
        paleta[0] = new Circulo(2);
        paleta[0].setColor("azul");
        paleta[1] = new Circulo(3);
        paleta[1].setColor("amarillo");
        paleta[2] = new Rectangulo(2, 3);
        paleta[2].setColor("verde");
        paleta[3] = new Rectangulo(4, 10);
        paleta[3].setColor("rojo");
    }
}
