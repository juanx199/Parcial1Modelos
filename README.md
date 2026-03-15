# Diseñar e implementar un sistema de generación de informes modulares que emplee de forma combinada los patrondes Bridge, Decorator, Flyweight y Proxy, atendiendo a los siguientes requisitos.
- Patrón Bridge: Se encuentra en parcial1.modelos.reports, con las abstracciones Report, DetailedReport y ExcecutiveReport.
- - Bridge - Implementación:Se encuentra en parcial1.modelos.exporters, en donde van los tipos de formatos, Exporter, PDFExporter y HTMLExporter.
- Patrón Decorator: Se encuentra en parcial1.modelos.decorators, en donde s eencontrarán ReportDecorator, MarcaAguaDecorator y HeaderDecorator.
- Patrón Flyweight: Se encuentra en parcial1.modelos.styles, en donde irán TextStyle y StyleFactory.
- Patrón Proxy: Se encuentra en parcial1.modelos.secuity, en donde van ReportProxy, User y lógica para verificar los roles.
## Paquete de ejecución: Estará en parcial1.modelos.main en la clase Main.java
