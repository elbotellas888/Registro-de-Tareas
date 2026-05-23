# Registro de Tareas

Este es un proyecto de registro de tareas desarrollado en Java utilizando la interfaz gráfica de Swing y Apache NetBeans.

## Librerías Necesarias

Para que este proyecto compile y funcione correctamente, es indispensable descargar y agregar las siguientes dependencias (archivos `.jar`) a la carpeta **Libraries** de tu proyecto en NetBeans:

### 1. iTextPDF (Versión 5.5.9)
* **Archivo:** `itextpdf-5.5.9.jar`
* **Descripción:** Librería utilizada para la generación, exportación y manipulación de reportes en formato PDF.
* **Descarga:** [Descargar desde Maven Repository](https://mvnrepository.com/artifact/com.itextpdf/itextpdf/5.5.9) *(Haz clic en el enlace "jar" dentro de la fila "Files").*

### 2. Gson (Versión 2.14.0)
* **Archivo:** `gson-2.14.0.jar`
* **Descripción:** Herramienta de Google para convertir objetos de Java a formato JSON y viceversa, ideal para guardar o leer registros de tareas.
* **Descarga:** [Descargar desde Maven Repository](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.14.0) *(Haz clic en el enlace "jar" dentro de la fila "Files").*

### 3. JCalendar (Versión 1.4)
* **Archivo:** `jcalendar-1.4 (1).jar`
* **Descripción:** Proporciona componentes visuales para interfaces Swing, como selectores de fecha (`JDateChooser`), muy útiles para establecer fechas de vencimiento en las tareas.
* **Descarga:** [Descargar desde la página oficial (Toedter)](https://toedter.com/jcalendar/) *(Descarga el `.zip` y extrae el `.jar` de la carpeta lib)* o desde [Maven Repository](https://mvnrepository.com/artifact/com.toedter/jcalendar/1.4).

---

## Entorno de Desarrollo
* **Java Development Kit (JDK):** El proyecto está configurado para ejecutarse con **JDK 25 (Default)**. Asegúrate de tener esta versión o una compatible instalada.
* **IDE Recomendado:** Apache NetBeans.

## ¿Cómo agregar las librerías en NetBeans?
1. Descarga los tres archivos `.jar` desde los enlaces proporcionados.
2. Abre este proyecto en tu entorno de NetBeans.
3. En el panel de **Projects**, despliega la estructura de tu proyecto.
4. Haz clic derecho sobre la carpeta **Libraries**.
5. Selecciona la opción **Add JAR/Folder...**.
6. Busca en tu explorador los archivos que acabas de descargar, selecciónalos y presiona **Open**.
