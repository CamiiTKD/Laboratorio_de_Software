package TP1.Ejercicio4;

public class TestLogger {
    public static void main(String[] args) {
        // Obtenemos la instancia del Logger
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        // Verificamos que ambas variables apunten exactamente al mismo objeto en memoria
        System.out.println("¿Es la misma instancia?: " + (log1 == log2)); // Imprime true

        // Uso de los métodos de log
        log1.logInfo("La aplicación inició correctamente.");
        log2.logWarning("El archivo de configuración tiene valores por defecto.");
        log1.logError("No se pudo conectar con la base de datos.");

        // Intento de instanciación directa:
        // Logger logDirecto = new Logger();
        // Error de compilación: The constructor Logger() is not visible
    }
}
