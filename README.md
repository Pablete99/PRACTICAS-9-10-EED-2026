
# Prácticas Entornos de Desarrollo - Unidades 9 y 10

Este repositorio contiene el conjunto de prácticas dedicadas al **Testing, QA, Optimización y Documentación** de software.

## 🛠️ Tecnologías y Herramientas
* **Lenguaje:** Java 17
* **IDE:** Eclipse IDE
* **Testing:** JUnit 5
* **Cobertura:** EclEmma (JaCoCo)
* **Calidad de código:** SonarLint / SonarQube for IDE
* **Documentación:** Javadoc y Markdown

## 📝 Descripción de las Prácticas

### 1. Tests Unitarios con JUnit 5
Se ha implementado una clase `Rectangle` con lógica para evitar valores negativos o nulos. Se han diseñado pruebas para cubrir:
* Valores positivos (Caso normal).
* Valores cero (Caso degenerado).
* Valores negativos (Caso inválido).

### 2. Cobertura de Código (QA)
Gracias a **EclEmma**, se ha verificado que el juego de pruebas cubre el **100%** de las líneas de código, garantizando que no existan flujos sin testear.

### 3. Análisis Estático con SonarLint
Se ha integrado SonarLint para asegurar que el código cumple con las mejores prácticas de desarrollo y seguridad, logrando un reporte de 0 incidencias.

### 4. Refactorización
El código original fue optimizado mediante:
* Renombrado de clases y métodos a inglés profesional.
* Extracción de constantes para evitar "números mágicos".
* Extracción de lógica de validación a un método privado `checkDimensions`.

### 5. Documentación Profesional
* **Javadoc:** Generación de documentación técnica en HTML con etiquetas `@author`, `@version`, `@param` y `@return`.
* **Markdown:** Redacción de este manual de uso.

## 📊 Evidencias
![JUnit Report](https://github.com/TU_USUARIO/PRACTICAS-9-10-EED-2026/blob/main/captura_junit.png?raw=true)
*Ejemplo de ejecución de tests unitarios.*
