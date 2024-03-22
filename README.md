# Test-Automation-https://www.saucedemo.com/
### 🛠  Automatización de casos https://www.saucedemo.com/ y muestra de reportes CucumberSerenity

📢 
Este repositorio contiene un proyecto de prueba automatizado para Swag Labs utilizando Java, Cucumber, BDD, Selenium, Gherkin, ChromeDriver, JUnit 4, Maven y Eclipse IDE. Las pruebas están diseñadas para cubrir varios escenarios en el sitio web de Sauce Demo (https://www.saucedemo.com).
## Table of Contents


- [Alcance](#Alcance)
- [Características](#Características)
- [Herramientas y tecnologías utilizadas](#Herramientas-y-tecnologías-utilizadas)
- [Casos de prueba](#Casos-de-prueba)
- [Instalación](#Instalación)
- [Uso](#Uso)

## Alcance

El proyecto cubre las siguientes áreas del sitio web de Swag Labs:

• Autenticarse con el usuario: standard_user y password: secret_sauce
• Agregar dos productos al carrito
• Visualizar el carrito • Completar el formulario de compra
• Finalizar la compra hasta la confirmación: “THANK YOU FOR YOUR ORDER”

## Características

- Utiliza Cucumber para el desarrollo impulsado por el comportamiento (BDD) para escribir pruebas en un formato legible por humanos.
- Utiliza Selenium para interactuar con elementos web y realizar acciones automatizadas.
- Organiza escenarios de prueba utilizando la sintaxis de Gherkin.
- Incluye una amplia gama de casos de prueba que cubren inicio de sesión, características del producto, funcionalidad del carrito y más.
- Proporciona informes de errores y resultados de pruebas fáciles de entender.


## Herramientas y tecnologías utilizadas

Este proyecto de automatización de pruebas para Swag Labs utiliza una variedad de herramientas y tecnologías para optimizar el proceso de prueba y garantizar resultados eficientes y precisos.

- **Java**: el lenguaje de programación principal utilizado para escribir el código de automatización de pruebas.

- **Cucumber**: una herramienta de desarrollo basado en el comportamiento (BDD) que permite escribir escenarios de prueba en un formato legible por humanos.

- **Selenium**: un popular marco de código abierto para automatizar las interacciones y pruebas del navegador web.

- **Gherkin**: un lenguaje de texto sin formato que utiliza palabras clave para definir escenarios de prueba de forma estructurada, haciéndolos fáciles de leer y comprender.

- **ChromeDriver**: la implementación de WebDriver para Google Chrome, que permite a Selenium automatizar las acciones del navegador Chrome.

- **JUnit**: un marco de prueba ampliamente utilizado para aplicaciones Java, utilizado para ejecutar y gestionar casos de prueba.

- **Maven**: una herramienta de gestión de dependencias y compilación que simplifica la configuración y el mantenimiento del proyecto.

- **IntelliJ IDE**: un entorno de desarrollo integrado para Java que proporciona un espacio de trabajo para codificar, probar y depurar.

Estas tecnologías se combinan para crear un marco de prueba eficaz que automatiza casos de prueba, realiza comparaciones entre los resultados esperados y reales y genera informes de prueba detallados.



## Installation

Ensure that you have the following tools and technologies installed on your machine:

- [Java](https://www.java.com/en/download/)
- [Maven](https://maven.apache.org/install.html)
- [IntelliJ IDE](https://www.jetbrains.com/idea/download/other.html)
- [Selenium](https://www.selenium.dev/downloads/) 
- [Cucumber](https://cucumber.io/)
- [Chrome driver](https://chromedriver.chromium.org)
  <br><br>Nota: Asegúrese de descargar la versión del controlador Chrome correspondiente a su navegador Chrome, colóquela en la carpeta ChromeDriver y establezca la ruta relevante en el archivo DOM.java

## Uso

1. Abra el proyecto en Intellj o su IDE preferido.
2. Navegue hasta el directorio `src/test/java`.
3. Localice los archivos de prueba con la extensión `.feature`.
4. Ejecute los archivos de prueba usando maven "mvn clean verify" para ejecutar los escenarios de prueba automatizados.
![image](https://github.com/ttbr101081/saucedemoE2E/assets/79415192/0870b109-407c-4174-9e45-b5d20f2c9c5d)
o dentro de la terminal con el mismo comando 
![image](https://github.com/ttbr101081/saucedemoE2E/assets/79415192/94e08986-a805-45c6-b11a-b84fd74542e8)
5. Al finalizar se podrá observar un informe resumido en cucumber  
![image](https://github.com/ttbr101081/saucedemoE2E/assets/79415192/b67c10cc-bd55-43ec-9748-7d633ab09a1f)
![image](https://github.com/ttbr101081/saucedemoE2E/assets/79415192/f81afd11-b2bf-439e-9f06-cbaedbb507ba)
o podremos encontrar el informe mas detallado en la ruta “\target\site\cucumber-html-reports” dentro del proyecto y le daremos abrir con el navegador preferido
![image](https://github.com/ttbr101081/saucedemoE2E/assets/79415192/34a38eb6-1433-4a21-b38a-89a0037a63eb)
![image](https://github.com/ttbr101081/saucedemoE2E/assets/79415192/1ed4318d-0065-4c1e-a7d2-407cc0465b08)




