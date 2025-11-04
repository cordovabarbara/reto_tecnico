# Automatización DatePicker - Reto Técnico

Este proyecto automatiza la selección de fechas en un campo de formulario usando **DatePicker** de jQuery UI, con **Serenity BDD**, **Screenplay Pattern** y **JUnit 5**.

---

## 📄 Funcionalidades automatizadas

- Selección de una fecha específica en un mes diferente al actual.
- Automatización de la interacción en **Chrome** usando Serenity BDD y Screenplay.


## ⚙️ Tecnologías y Herramientas

- Java 11
- Serenity BDD (Screenplay)
- Selenium WebDriver
- JUnit 5
- Gradle
- IntelliJ IDEA

---

## 🚀 Cómo ejecutar los tests y generar reportes

1. Clonar el repositorio:

```bash
git clone https://github.com/tu_usuario/tu_repositorio.git
```
2. Entrar al directorio del proyecto:

```
cd reto_tecnico/app

```
3. Ejecutar los tests y generar los reportes de Serenity:
```
./gradlew clean test aggregate

```
4. Abrir el reporte HTML generado:
```
app/build/reports/serenity/index.html
