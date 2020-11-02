# Arquitectura del sistema

Tras realizar un estudio de las distintas arquitecturas propuestas en el material de la asignatura se ha decidido utilizar una arquitectura basada en microservicios.

Esta arquitectura tiene la característica de estar formada por un conjunto de servicios que actuan de manera independiente y autónoma, y conjuntanmente proporcionan la funcionalidad total del sistema. Estos servicios o microservicios se comunican entre sí a través de APIs. Este tipo de arquitectura requiere flexibilidad y adaptabilidad ya que debemos ser capaces de modificar un servicio sin alterar el resto.

Si adaptamos esta arquitectura a nuestro problema nos quedaría dividido en dos microservicios:

- Microservicio Alimenticio: en este microservicio se realizará la gestión de los nutrientes aportados a la dieta del usuario.
- Microservicio Ejercicio Físico: aquí se realizará la gestión del ejercicio físico que realice el usuario, como sus pasos, su recuento de calorías gastadas, etc.


## Milestones

- [Milestone 0](https://github.com/antoniosp7/Proyecto-CC/milestone/1)
  - [Añadir descripción del proyecto](https://github.com/antoniosp7/Proyecto-CC/issues/4)
  - [Crear README](https://github.com/antoniosp7/Proyecto-CC/issues/3)
  - [Crear .gitignore](https://github.com/antoniosp7/Proyecto-CC/issues/1)
  - [Añadir Licencia GPL](https://github.com/antoniosp7/Proyecto-CC/issues/2)
  
- [Milestone 1](https://github.com/antoniosp7/Proyecto-CC/milestone/2)
  - [Mover README antiguo a archivo específico](https://github.com/antoniosp7/Proyecto-CC/issues/6)
  - [Crear documentación sobre herramientas](https://github.com/antoniosp7/Proyecto-CC/issues/12)
  - [Crear cc.yaml](https://github.com/antoniosp7/Proyecto-CC/issues/14)
  
- [System management](https://github.com/antoniosp7/Proyecto-CC/milestone/5)
  - [[HU6] Crear perfil](https://github.com/antoniosp7/Proyecto-CC/issues/15)
  - [[HU8] Borrar mi cuenta.](https://github.com/antoniosp7/Proyecto-CC/issues/17)
  
  
- [Food management](https://github.com/antoniosp7/Proyecto-CC/milestone/3)
  - [[HU1] Añadir nueva comida al sistema](https://github.com/antoniosp7/Proyecto-CC/issues/7)
  - [[HU3] Ver el registro diario de nutrientes.](https://github.com/antoniosp7/Proyecto-CC/issues/9)
  - [[HU5] Registrar comida ingerida](https://github.com/antoniosp7/Proyecto-CC/issues/11)
  - [[HU9] Solicitar una nueva comida](https://github.com/antoniosp7/Proyecto-CC/issues/18)
  - [[HU11] Aceptar una petición de nueva comida](https://github.com/antoniosp7/Proyecto-CC/issues/20)
  - [[HU13] Denegar una solicitud de nueva comida](https://github.com/antoniosp7/Proyecto-CC/issues/22)
 
- [Exercise management](https://github.com/antoniosp7/Proyecto-CC/milestone/4)
  - [[HU2] Añadir nuevo ejercicio al sistema.](https://github.com/antoniosp7/Proyecto-CC/issues/8)
  - [[HU4] Ver registro diario de ejercicio.](https://github.com/antoniosp7/Proyecto-CC/issues/10)
   - [[HU7] Registrar ejercicio realizado.](https://github.com/antoniosp7/Proyecto-CC/issues/16)
   - [[HU10] Solicitar un nuevo ejercicio.](https://github.com/antoniosp7/Proyecto-CC/issues/19)
   - [[HU12] Aceptar una petición de nuevo ejercicio](https://github.com/antoniosp7/Proyecto-CC/issues/21)
   - [[HU14] Denegar una petición de nuevo ejercicio](https://github.com/antoniosp7/Proyecto-CC/issues/23)
  


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

  ## Documentos aparte

  - [Herramientas del proyecto]()
  - [Configuración de Git y Github]()
  - [READMEs anteriores]()
  
