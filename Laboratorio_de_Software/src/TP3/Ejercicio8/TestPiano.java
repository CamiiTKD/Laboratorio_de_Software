package TP3.Ejercicio8;

public class TestPiano {
    public static void main(String[] args) {
        InstrumentoMusical piano = new Piano();

        System.out.println("Tipo de instrumento: " + piano.queEs()); piano.hacerSonar();
        System.out.println("\n--- Probando métodos sobrecargados ---");

        piano.afinar(FrecuenciasDeLA.BACH);
        piano.hacerSonar(Notas.DO, 3);
        piano.hacerSonar(Notas.SOL, 2);
    }
}
