package test;

import loggingutils.Logger;

public class Main {
    public static void main(String[] args) {
        // Obtenemos la instancia del Logger del módulo loggingutils
        Logger logger = Logger.getInstance();

        System.out.println("=== INICIANDO REGISTRO DE MENSAJES ===");

        logger.logInfo("Este es un mensaje informativo (INFO).");
        logger.logWarning("Este es un mensaje de advertencia (WARNING).");
        logger.logError("Este es un mensaje de error crítico (SEVERE).");
    }
}
