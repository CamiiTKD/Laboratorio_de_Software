package TP1.Ejercicio3;
import TP1.Ejercicio1.Vacuna;

// Subclase 2
public class VacunaSubunidadAntigenica extends Vacuna {
    private int cantidadAntigenos;
    private String tipoProceso;

    public VacunaSubunidadAntigenica(int cantidadAntigenos, String tipoProceso) {
        super();
        this.cantidadAntigenos = cantidadAntigenos;
        this.tipoProceso = tipoProceso;
    }

    public int getCantidadAntigenos() {
        return cantidadAntigenos;
    }

    public void setCantidadAntigenos(int cantidadAntigenos) {
        this.cantidadAntigenos = cantidadAntigenos;
    }

    public String getTipoProceso() {
        return tipoProceso;
    }

    public void setTipoProceso(String tipoProceso) {
        this.tipoProceso = tipoProceso;
    }
}
