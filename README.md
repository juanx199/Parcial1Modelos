# Sistema de Generación de Informes Modulares (Parcial 1)

Este proyecto implementa un sistema robusto de generación y exportación de informes utilizando una arquitectura basada en **patrones de diseño estructurales**, garantizando escalabilidad, eficiencia en memoria y seguridad.

## 🏗️ Estructura de Patrones de Diseño

El sistema se divide en módulos específicos dentro del paquete `parcial1.modelos`, distribuidos de la siguiente manera:

---

### 1. Patrón Bridge (Puente)
Permite desacoplar la jerarquía de los tipos de informes de la lógica de exportación a diferentes formatos.
* **Abstracciones (`.reports`):** * `Report` (Base)
    * `DetailedReport`
    * `ExecutiveReport`
* **Implementaciones (`.exporters`):** * `Exporter` (Interfaz)
    * `PDFExporter`
    * `HTMLExporter`

### 2. Patrón Decorator (Decorador)
Añade funcionalidades adicionales (metadatos visuales) a los informes de forma dinámica en tiempo de ejecución.
* **Ubicación:** `parcial1.modelos.decorators`
* **Clases:** `ReportDecorator`, `MarcaAguaDecorator`, `HeaderDecorator`.

### 3. Patrón Flyweight (Peso Ligero)
Optimiza el uso de memoria compartiendo objetos de estilo de texto que se repiten frecuentemente.
* **Ubicación:** `parcial1.modelos.styles`
* **Clases:** `TextStyle`, `StyleFactory`.

### 4. Patrón Proxy (Intermediario)
Actúa como una capa de seguridad para controlar el acceso a la generación de informes según el rol del usuario.
* **Ubicación:** `parcial1.modelos.security`
* **Clases:** `ReportProxy`, `User` y lógica de verificación de roles.

---

## 📂 Organización de Paquetes

```text
src/
└── parcial1/
    └── modelos/
        ├── reports/      # Abstracciones (Bridge)
        ├── exporters/    # Formatos de salida (Bridge)
        ├── decorators/   # Envolturas funcionales
        ├── styles/       # Optimización de recursos (Flyweight)
        ├── security/     # Control de acceso y roles (Proxy)
        └── main/         # Clase de ejecución (Main.java)
