package loggingutils;

public class Logger {
    private static Logger instancia;
    private final java.util.logging.Logger loggerInterno;

    // Constructor privado para implementar el patrón Singleton
    private Logger() {
        // Se obtiene la instancia de java.util.logging.Logger
        this.loggerInterno = java.util.logging.Logger.getLogger(Logger.class.getName());
    }

    // Método estático para acceder a la instancia única
    public static synchronized Logger getInstance() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void logInfo(String mensaje) {
        loggerInterno.info(mensaje);
    }

    public void logWarning(String mensaje) {
        loggerInterno.warning(mensaje);
    }

    public void logError(String mensaje) {
        loggerInterno.severe(mensaje); // O loggerInterno.log(Level.SEVERE, mensaje);
    }
}
