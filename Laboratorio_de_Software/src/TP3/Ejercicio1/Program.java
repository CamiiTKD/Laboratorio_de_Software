package TP3.Ejercicio1;

public class Program {
    public static void main(String[] args) {
        Stack pila = new Stack();
        pila.push("Primer elemento");
        pila.push("Segundo elemento");
        pila.push("Tercer elemento");
        System.out.println("--- Primer Recorrido ---");

        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        System.out.println("--- Intentando Segundo Recorrido ---");

        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
}
