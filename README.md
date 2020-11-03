# Arquitectura del sistema

Tras realizar un estudio de las distintas arquitecturas propuestas en el material de la asignatura se ha decidido utilizar una arquitectura basada en microservicios. Se ha decidido utilizar esta arquitectura ya que aunque el resultado de los informes usará datos tanto alimenticios como de ejercicio realizado, la gestión tanto de alimentos como de ejercicio se realizará de forma independiente por lo que esta arquitectura es una buena opción para nuestro proyecto.

Esta arquitectura tiene la característica de estar formada por un conjunto de servicios que actuan de manera independiente y autónoma, y conjuntanmente proporcionan la funcionalidad total del sistema. Estos servicios o microservicios se comunican entre sí a través de APIs. Este tipo de arquitectura requiere flexibilidad y adaptabilidad ya que debemos ser capaces de modificar un servicio sin alterar el resto.

Si adaptamos esta arquitectura a nuestro problema nos quedaría dividido en dos microservicios:

- Microservicio Alimenticio: en este microservicio se realizará la gestión de los nutrientes aportados a la dieta del usuario.
- Microservicio Ejercicio Físico: aquí se realizará la gestión del ejercicio físico que realice el usuario, como sus pasos, su recuento de calorías gastadas, etc.


## Planificación
  La planificación del proyecto se encuntra en el siguiente [documento](https://github.com/antoniosp7/HealthUGR/blob/master/docs/Planning.md).

## Clases

 - [Alimento](https://github.com/antoniosp7/HealthUGR/blob/master/src/Food.scala) :
    - Calorías x 100 gramos
    - Descripción
    - Nutrientes
 - [Ejercicio](https://github.com/antoniosp7/HealthUGR/blob/master/src/Exercise.scala) :
   - Descripción
   - Calorías quemadas por hora
 - [Usuario](https://github.com/antoniosp7/HealthUGR/blob/master/src/User.scala) :
   - Nombre
   - Peso
   - Estatura
   - Género
   - Edad
  - [Registro diario](https://github.com/antoniosp7/HealthUGR/blob/master/src/Record.scala) :
    - Lista de alimentos
    - Lista de ejercicios
    - Calorías consumidas
    - Calorías gastadas

En la siguiente imagen se muestra el resultado de ejecutar el compilado del código con la herramienta sbt.

![](https://raw.githubusercontent.com/antoniosp7/HealthUGR/master/docs/images/SBTCompile.png)

  ## Documentos aparte

  - [Herramientas del proyecto]()
  - [Configuración de Git y Github]()
  - [READMEs anteriores]()
  
