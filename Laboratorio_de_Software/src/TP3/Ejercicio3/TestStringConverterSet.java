package TP3.Ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class TestStringConverterSet {
    public static void main(String[] args) {
        // 1\. Creamos un Set original con elementos numéricos (Integer)
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // 2\. Envolvemos el conjunto en StringConverterSet
        Set<String> adaptadorNumeros = new StringConverterSet<>(numeros);

        System.out.println("=== RECORRIDO DEL SET CONVERTIDO A STRINGS ===");
        System.out.println("Tamaño del conjunto: " + adaptadorNumeros.size());

        for (String valorTexto : adaptadorNumeros) {
            // Cada elemento retornado es de tipo String
            System.out.println("Elemento (tipo " + valorTexto.getClass().getSimpleName() + "): " + valorTexto);
        }

        // 3\. Verificamos operaciones heredadas de AbstractSet
        System.out.println("\\n¿Contiene '20'?: " + adaptadorNumeros.contains("20"));
        System.out.println("¿Está vacío?: " + adaptadorNumeros.isEmpty());
    }
}
