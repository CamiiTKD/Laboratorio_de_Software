package TP1.Ejercicio5;
import javax.swing.JOptionPane;

public class PaintTest {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.init();

        StringBuilder reporte = new StringBuilder();

        for (FiguraGeometricaSealed figura : paint.getPaleta()) {
            figura.dibujar();

            int valorArea = figura.area();
            System.out.println("Área: " + valorArea);
            reporte.append("Figura: ").append(figura.getClass().getSimpleName())
                    .append(" | Color: ").append(figura.getColor())
                    .append(" | Área: ").append(valorArea);

            if (figura instanceof Circulo) { // esto se puede delegar al objeto así no pregunto el tipo pero me da fiaca.
                Circulo c = (Circulo) figura; // Downcasting o pattern matching: if (figura instanceof Circulo c)
                System.out.println("Radio: " + c.getRadio());
                reporte.append(" | Radio: ").append(c.getRadio());
            }
            reporte.append("\n");
        }

        // Diálogo gráfico para que al ejecutar por doble click no se cierre al instante sin mostrar salida
        JOptionPane.showMessageDialog(null, reporte.toString(), "Resultado Paint", JOptionPane.INFORMATION_MESSAGE);
    }
}
