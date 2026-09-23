package TP2.Ejercicio2;

import java.util.Arrays;

public class PaintTest {
    public static void main(String[] args) {
        Paint p = new Paint();
        p.init();
        FiguraGeometrica[] paleta = p.getPaleta();
        // 1\. Ordenamos el arreglo utilizando java.util.Arrays.sort()
        Arrays.sort(paleta);
        // 2\. Imprimimos las figuras geométricas ordenadas por área
        System.out.println("=== FIGURAS ORDENADAS POR ÁREA ===");
        for (FiguraGeometrica f : paleta) {
            f.dibujar();
            System.out.println(" ->; Área: " + f.area());
            // Requisito de Práctica 1: invocar getRadio() solo si es un Círculo
            if (f instanceof Circulo c) {
                System.out.println(" -&gt; Radio del círculo: " + c.getRadio());
            }
            System.out.println("------------------------------------");
        }
    }
}
