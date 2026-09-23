package TP3.Ejercicio6;

public class Estudiante {
    private String apellido;
    private String nombre;
    private int edad;
    private String legajo;
    private int materiasAprobadas;

    public Estudiante(String apellido, String nombre, int edad, String legajo, int materiasAprobadas) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getLegajo() {
        return legajo;
    }

    public int getMateriasAprobadas() {
        return materiasAprobadas;
    }

    @Override
    public String toString() {
        return String.format("Estudiante{legajo='%s', nombre='%s %s', edad=%d, aprobadas=%d}", legajo, nombre, apellido, edad, materiasAprobadas);
    }
}
