![Falabella](https://www.bitrefill.com/content/cn/b_rgb%3Abbd337%2Cc_pad%2Ch_720%2Cw_1280/v1599485967/falabella_colombia.jpg)
https://www.bitrefill.com/buy/falabella-colombia/?hl=es

# Prueba Tecnica Falabella

 Realizar la automatización del proceso de compra de un producto hasta la opción de pago en la pagina web de Falabella.

 ___

# Instalación

Se procede a instalar las herramientas, realizar la configuración de las variables de entorno y descargar los WebDrivers para poder ejecutar el proyecto:

## Herramientas

- IDE "Entorno de desarrollo integrado": se instala IntelliJ, se descarga desde: https://www.jetbrains.com/es-es/idea/download/#section=windows

- Instalar el JDK de java, se descarga desde: https://www.oracle.com/co/java/technologies/javase/javase8-archive-downloads.html

- Instalar el gestor de dependencias (Gradle) se descarga desde: https://gradle.org/releases/ seleccionar **complete** y luego descomprimir directamente en el disco C.

## Variables de entorno

Se deben agregar en las variables de entorno del sistema

- JAVA_HOME = ruta donde se ha instalado el java como por ejemplo "C:\Program Files\Java\jdk1.8.0_291\"

- GRADLE_HOME = ruta donde se descomprimio el gradle como por ejemplo "C:\gradle-6.9.1"

Despues de crear ambas variables, buscar la variable Path y editar, allí se deben agregar: %JAVA_HOME%\bin y %GRADLE_HOME%\bin

## WebDrivers

Los WebDrivers se deben descargar de acuerdo a la version del navegador que se disponga, desde la URL: **Chrome** https://chromedriver.chromium.org/downloads o **Firefox** https://github.com/mozilla/geckodriver/releases y se deben agregar en la carpeta target del proyecto como por ejemplo: "D:\GitHub\Prueba_Tecnica_Falabella\target"

___

