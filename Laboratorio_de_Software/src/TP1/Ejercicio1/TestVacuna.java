package TP1.Ejercicio1;

public class TestVacuna {
    public static void main(String[] args) {
        Vacuna[] vacunas = new Vacuna[5];

        vacunas[0] = new Vacuna("Pfizer-BioNTech", "EE.UU./Alemania", "COVID-19", 2);
        vacunas[1] = new Vacuna("Sputnik V", "Rusia", "COVID-19", 2);
        vacunas[2] = new Vacuna("BCG", "Francia", "Tuberculosis", 1);
        vacunas[3] = new Vacuna("Triple Viral", "EE.UU.", "Sarampión, Rubéola, Paperas", 2);
        vacunas[4] = new Vacuna("Sabin", "EE.UU.", "Poliomielitis", 3);

        for (Vacuna v : vacunas) {
            System.out.println(v);
        }

        Vacuna v1 = new Vacuna("BCG", "Francia", "Tuberculosis", 1);
        Vacuna v2 = new Vacuna("BCG", "Francia", "Tuberculosis", 1);

        System.out.println(v1.equals(v2)); // Retorna false si no se sobreescribe equals(), true si se sobreescribe.

        // e) La variable CLASSPATH le indica a la máquina virtual (JVM) y al compilador (javac) los directorios o archivos .jar/.zip donde debe buscar los binarios de las clases (.class) definidos por el usuario o librerías de terceros durante la compilación o ejecución.
    }
}