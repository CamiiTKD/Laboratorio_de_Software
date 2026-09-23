package TP1.Ejercicio1;

public final class VacunaInmutable {
    private final String marca;
    private final String paisOrigen;
    private final String enfermedadQuePreviene;
    private final int cantidadDosis;

    public VacunaInmutable(String marca, String paisOrigen, String enfermedadQuePreviene, int cantidadDosis) {
        this.marca = marca;
        this.paisOrigen = paisOrigen;
        this.enfermedadQuePreviene = enfermedadQuePreviene;
        this.cantidadDosis = cantidadDosis;
    }

    public String getMarca() { return marca; }
    public String getPaisOrigen() { return paisOrigen; }
    public String getEnfermedadQuePreviene() { return enfermedadQuePreviene; }
    public int getCantidadDosis() { return cantidadDosis; }

    @Override
    public String toString() {
        return "VacunaInmutable [Marca=" + marca + ", País=" + paisOrigen +
                ", Previene=" + enfermedadQuePreviene + ", Dosis=" + cantidadDosis + "]";
    }

    // (En Java moderno también se puede implementar directamente como un public record VacunaInmutable(String marca, String paisOrigen, String enfermedadQuePreviene, int cantidadDosis) {}).
}