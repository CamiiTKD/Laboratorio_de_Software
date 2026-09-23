package TP1.Ejercicio1;

public class Vacuna {
    private String marca;
    private String paisOrigen;
    private String enfermedadQuePreviene;
    private int cantidadDosis;

    public Vacuna() {
    }

    public Vacuna(String marca, String paisOrigen, String enfermedadQuePreviene, int cantidadDosis) {
        this.marca = marca;
        this.paisOrigen = paisOrigen;
        this.enfermedadQuePreviene = enfermedadQuePreviene;
        this.cantidadDosis = cantidadDosis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getEnfermedadQuePreviene() {
        return enfermedadQuePreviene;
    }

    public void setEnfermedadQuePreviene(String enfermedadQuePreviene) {
        this.enfermedadQuePreviene = enfermedadQuePreviene;
    }

    public int getCantidadDosis() {
        return cantidadDosis;
    }

    public void setCantidadDosis(int cantidadDosis) {
        this.cantidadDosis = cantidadDosis;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Vacuna [Marca: ").append(marca)
                .append(", País: ").append(paisOrigen)
                .append(", Previene: ").append(enfermedadQuePreviene)
                .append(", Dosis: ").append(cantidadDosis)
                .append("]");
        return sb.toString();
    }
    // Sin toString() sobreescrito: Se hereda la implementación por defecto de java.lang.Object,
    // la cual retorna una cadena con la estructura NombreClase@HashHexadecimal
    // (por ejemplo, Vacuna@6b718e0f), representando el nombre de la clase y el hash code del objeto en memoria.
}