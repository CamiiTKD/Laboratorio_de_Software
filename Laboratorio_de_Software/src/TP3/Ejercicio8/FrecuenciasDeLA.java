package TP3.Ejercicio8;

public enum FrecuenciasDeLA {
    ISO_16(440, "Organización Internacional de Estandarización ISO 16"),
    CAMARA(444, "Afinación de cámara"),
    RENACIMIENTO(446, "Renacimiento"),
    BACH(480, "Órganos alemanes que tocaba Bach");

    private final int frecuencia;
    private final String descripcion;

    FrecuenciasDeLA(int frecuencia, String descripcion) {
        this.frecuencia = frecuencia;
        this.descripcion = descripcion;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
