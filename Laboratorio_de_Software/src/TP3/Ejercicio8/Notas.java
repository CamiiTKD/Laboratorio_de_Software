package TP3.Ejercicio8;

public enum Notas {
    DO("C"),
    RE("D"),
    MI("E"),
    FA("F"),
    SOL("G"),
    LA("A"),
    SI("B");

    private final String cifradoAmericano;
    // El constructor de un enum es implícitamente privado
    Notas(String cifradoAmericano) {
        this.cifradoAmericano = cifradoAmericano;
    }

    public String getCifradoAmericano() {
        return cifradoAmericano;
    }
}
