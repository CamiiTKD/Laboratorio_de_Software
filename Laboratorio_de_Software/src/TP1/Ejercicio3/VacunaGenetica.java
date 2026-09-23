package TP1.Ejercicio3;
import TP1.Ejercicio1.Vacuna;

// Subclase 3
public class VacunaGenetica extends Vacuna {
    private double temperaturaMinima;
    private double temperaturaMaxima;

    public VacunaGenetica(double temperaturaMinima, double temperaturaMaxima) {
        super();
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }
}
