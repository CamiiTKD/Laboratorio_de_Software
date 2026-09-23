package TP3.Ejercicio8;

public interface InstrumentoMusical {
    void hacerSonar();
    String queEs();

    default void afinar() {
        System.out.println("Afinando instrumento a frecuencia estándar (440 Hz)...");
    }

    // Sobrecargas solicitadas en el inciso c)
    void hacerSonar(Notas n, int duracion);
    void afinar(FrecuenciasDeLA f);
}
