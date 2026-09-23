module loggingutils {
    // Requiere el módulo java.logging para acceder a java.util.logging.Logger
    requires java.logging;
    // Exporta el paquete loggingutils para que sea accesible por otros módulos
    exports loggingutils;
}