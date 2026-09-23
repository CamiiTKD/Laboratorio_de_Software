package TP3.Ejercicio8;

public enum FitoPaez {
    INSTANCIA; // Única instancia del Singleton

    private final InstrumentoMusical piano;

    FitoPaez() {
        this.piano = new Piano();
    }

    public InstrumentoMusical getPiano() {
        return piano;
    }

    // Metodo para tocar una canción recibiendo arreglos de notas y duraciones
    public void tocarCancion(Notas[] notas, int[] tiempos) {
        System.out.println("\n FITO PÁEZ ESTÁ TOCANDO UNA CANCIÓN EN SU PIANO ");
        int limite = Math.min(notas.length, tiempos.length);
        for (int i = 0; i < limite; i++) {
            piano.hacerSonar(notas[i], tiempos[i]);
        }
        System.out.println(" ¡Fin de la canción! ");
    }
}
