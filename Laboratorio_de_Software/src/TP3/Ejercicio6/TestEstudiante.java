package TP3.Ejercicio6;

import java.util.Arrays;
import java.util.Comparator;

public class TestEstudiante {
    public static void main(String[] args) {
        // Creación del arreglo de prueba
        Estudiante[] estudiantes = new Estudiante[]{
                new Estudiante("Gómez", "Ana", 22, "12345/6", 18),
                new Estudiante("Pérez", "Juan", 25, "11000/2", 24),
                new Estudiante("López", "Ana", 20, "15432/8", 10),
                new Estudiante("Álvarez", "Carlos", 24, "09876/1", 30),
                new Estudiante("Gómez", "Bruno", 21, "13579/0", 15)
        };

        System.out.println("=== ARREGLO ORIGINAL ===");
        imprimirArreglo(estudiantes);
        // ---------------------------------------------------------------------
        // Criterio 1: Por cantidad de materias aprobadas (Ascendente)
        // ---------------------------------------------------------------------
        Arrays.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante e1, Estudiante e2) {
                return Integer.compare(e1.getMateriasAprobadas(), e2.getMateriasAprobadas());
            }
        });
        System.out.println("\\n=== 1 POR MATERIAS APROBADAS (ASCENDENTE) ===");
        imprimirArreglo(estudiantes);
        // ---------------------------------------------------------------------
        // Criterio 2: Por edad (Descendente)
        // ---------------------------------------------------------------------
        Arrays.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante e1, Estudiante e2) {
                // Invertimos el orden de comparación para lograr orden descendente
                return Integer.compare(e2.getEdad(), e1.getEdad());
            }
        });
        System.out.println("\\n=== 2 POR EDAD (DESCENDENTE) ===");
        imprimirArreglo(estudiantes);
        // ---------------------------------------------------------------------
        // Criterio 3: Por legajo (Ascendente)
        // ---------------------------------------------------------------------
        Arrays.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante e1, Estudiante e2) {
                return e1.getLegajo().compareTo(e2.getLegajo());
            }
        });
        System.out.println("\\n=== 3 POR LEGAJO (ASCENDENTE) ===");
        imprimirArreglo(estudiantes);
        // ---------------------------------------------------------------------
        // Criterio 4: Por nombre y apellido (Descendente)
        // ---------------------------------------------------------------------
        Arrays.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante e1, Estudiante e2) {
                // Primero comparamos por nombre de forma descendente
                int compNombre = e2.getNombre().compareTo(e1.getNombre());
                if (compNombre != 0) {
                    return compNombre;
                }
                // Si tienen el mismo nombre, desambiguamos por apellido (descendente)
                return e2.getApellido().compareTo(e1.getApellido());
            }
        });
        System.out.println("\\n=== 4 POR NOMBRE Y APELLIDO (DESCENDENTE) ===");
        imprimirArreglo(estudiantes);
    }

    private static void imprimirArreglo(Estudiante[] arreglo) {
        for (Estudiante e : arreglo) {
            System.out.println(e);
        }
    }
}
