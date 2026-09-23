package TP3.Ejercicio2;

import static java.lang.Math.pow;
// Requisito del inciso c)
public class InnerStatic {
    static double PI = 3.1416;

    public static class Circulo {
        public static double radio = 2;

        public static double getArea() {
            // Inciso c): uso de pow() mediante import static
            var a = PI * pow(radio, 2);
            System.out.println("El area es: " + a);
            return a;
        }

        public static double getLongitudCircunferencia() {
            var l = 2 * PI * radio;
            System.out.println("La longitud es: " + l);
            return l;
        }
    }
}
