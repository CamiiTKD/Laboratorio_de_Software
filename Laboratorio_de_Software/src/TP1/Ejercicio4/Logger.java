package TP1.Ejercicio4;

public class Logger {
    // 1. Variable de instancia única y estática
    private static Logger instance;

    // 2. Constructor privado para evitar la instanciación directa con 'new'
    private Logger() {
    }

    // 3. Metodo estático público de acceso global (Lazy Initialization)
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Métodos de registro de mensajes
    public void logInfo(String mensaje) {
        System.out.println("[INFO] " + mensaje);
    }

    public void logWarning(String mensaje) {
        System.out.println("[WARNING] " + mensaje);
    }

    public void logError(String mensaje) {
        System.err.println("[ERROR] " + mensaje);
    }
}
