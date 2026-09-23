package TP3.Ejercicio8;

public class Piano implements InstrumentoMusical {
    private FrecuenciasDeLA afinacionActual = FrecuenciasDeLA.ISO_16;

    @Override
    public void hacerSonar() {
        System.out.println("El piano emite un acorde resonante.");
    }

    @Override
    public String queEs() {
        return "Piano";
    }

    @Override
    public void hacerSonar(Notas n, int duracion) {
        System.out.printf("El piano suena con la nota %s (%s) durante %d segundo(s).%n",
                n.name(), n.getCifradoAmericano(), duracion);
    }

    @Override
    public void afinar(FrecuenciasDeLA f) {
        this.afinacionActual = f;
        System.out.printf("Afinando el piano a %d Hz (%s).%n",
                f.getFrecuencia(), f.getDescripcion());
    }

    public FrecuenciasDeLA getAfinacionActual() {
        return afinacionActual;
    }
}
