package TP1.Ejercicio1;

public class TestInmutable {
    public static void main(String[] args) {
        VacunaInmutable[] vacunas = new VacunaInmutable[5];
        vacunas[0] = new VacunaInmutable("Pfizer", "EE.UU.", "COVID-19", 2);
        vacunas[1] = new VacunaInmutable("Sputnik V", "Rusia", "COVID-19", 2);
        vacunas[2] = new VacunaInmutable("BCG", "Francia", "Tuberculosis", 1);
        vacunas[3] = new VacunaInmutable("Triple Viral", "EE.UU.", "Sarampión", 2);
        vacunas[4] = new VacunaInmutable("Sabin", "EE.UU.", "Polio", 3);

        for (VacunaInmutable v : vacunas) {
            System.out.println(v);
        }

        // Intento de modificación:
        // vacunas[0].setCantidadDosis(3);
        // Error de compilación: The method setCantidadDosis(int) is undefined for the type VacunaInmutable.
        // vacunas[0].cantidadDosis = 3;
        // Error de compilación: The field VacunaInmutable.cantidadDosis is not visible / cannot be assigned.
    }
}
