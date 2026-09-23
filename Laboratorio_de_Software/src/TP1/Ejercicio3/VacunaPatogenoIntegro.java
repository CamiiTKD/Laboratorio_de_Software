package TP1.Ejercicio3;
import TP1.Ejercicio1.Vacuna;

// Subclase 1
public class VacunaPatogenoIntegro extends Vacuna {
    private String nombreVirus;

    public VacunaPatogenoIntegro(String nombreVirus) {
        super(); // Invocación implícita o explícita al constructor por defecto de Vacuna
        this.nombreVirus = nombreVirus;
    }

    public String getNombreVirus() {
        return nombreVirus;
    }

    public void setNombreVirus(String nombreVirus) {
        this.nombreVirus = nombreVirus;
    }
}
