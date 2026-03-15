# Sistema de Generación de Informes Modulares (Parcial 1)

Este proyecto implementa un sistema robusto de generación y exportación de informes utilizando una arquitectura basada en **patrones de diseño estructurales**, garantizando escalabilidad, eficiencia en memoria y seguridad.

## Estructura de Patrones 

El sistema se divide en módulos dentro del paquete `parcial1.modelos`, distribuidos de la siguiente manera:

### 1. Patrón Bridge 
* **Abstracciones (`.reports`):** * `Report` (Base)
    * `DetailedReport`
    * `ExecutiveReport`
* **Implementaciones (`.exporters`):** * `Exporter` (Interfaz)
    * `PDFExporter`
    * `HTMLExporter`

### 2. Patrón Decorator
* **Ubicación:** `parcial1.modelos.decorators`
* **Clases:** `ReportDecorator`, `MarcaAguaDecorator`, `HeaderDecorator`.

### 3. Patrón Flyweight 
Optimiza el uso de memoria compartiendo objetos de estilo de texto que se repiten frecuentemente.
* **Ubicación:** `parcial1.modelos.styles`
* **Clases:** `TextStyle`, `StyleFactory`.

### 4. Patrón Proxy 
Capa de seguridad para controlar el acceso a la generación de informes según el rol del usuario.
* **Ubicación:** `parcial1.modelos.security`
* **Clases:** `ReportProxy`, `User` y lógica de verificación de roles.

## 📂 Organización de Paquetes

```text
src/
└── parcial1.modelos.decorators/  # Decoradores de reportes
└── parcial1.modelos.exporters/   # Formatos de exportación (Bridge)
└── parcial1.modelos.reports/     # Abstracciones de reportes (Bridge)
└── parcial1.modelos.security/    # Proxy y entidad de Usuario
└── parcial1.modelos.styles/      # Gestión de estilos (Flyweight)
└── parcial1.modelos.main/        # Punto de entrada (Main.java)
