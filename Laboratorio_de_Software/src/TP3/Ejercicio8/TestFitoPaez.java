package TP3.Ejercicio8;

public class TestFitoPaez {
    public static void main(String[] args) {
        // Accedemos a la instancia única de Fito Páez
        FitoPaez fito = FitoPaez.INSTANCIA;

        // Afinar el piano antes del show
        fito.getPiano().afinar(FrecuenciasDeLA.CAMARA);

        // Definimos la secuencia de notas y tiempos para la intro de una canción
        Notas[] melodia = { Notas.DO, Notas.MI, Notas.SOL, Notas.LA, Notas.DO };
        int[] tiempos = { 2, 1, 2, 1, 4 };

        // Pedimos a Fito que toque la canción
        fito.tocarCancion(melodia, tiempos);
    }
}
