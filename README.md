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
  
- [System management](https://github.com/antoniosp7/Proyecto-CC/milestone/5)
  
  
- [Food management](https://github.com/antoniosp7/Proyecto-CC/milestone/3)
  - [[HU1] Añadir nueva comida al sistema](https://github.com/antoniosp7/Proyecto-CC/issues/7)
  - [[HU5] Registrar comida ingerida](https://github.com/antoniosp7/Proyecto-CC/issues/11)
 
- [Exercise management](https://github.com/antoniosp7/Proyecto-CC/milestone/4)
  - [[HU2] Añadir nuevo ejercicio al sistema.](https://github.com/antoniosp7/Proyecto-CC/issues/8)In this issue the definition of the architecture in the README of the project will be carried out

  - [[HU3] Ver el registro diario de nutrientes.](https://github.com/antoniosp7/Proyecto-CC/issues/9)

  - [[HU4] Ver registro diario de ejercicio.](https://github.com/antoniosp7/Proyecto-CC/issues/10)
  


## Clases

 - Alimento:
    - Calorías x 100 gramos
    - Descripción
    - Nutrientes
 - Ejercicio:
   - Descripción
   - Calorías quemadas por hora
 - Usuario:
   - Nombre
   - Peso
   - Estatura
   - Género
   - Edad
   - Contraseña
  - Registro diario:
    - Lista de alimentos
    - Lista de ejercicios
    - Calorías consumidas
    - Calorías gastadas

  ## Documentos aparte

  - [Herramientas del proyecto]()
  - [Configuración de Git y Github]()
  - [READMEs anteriores]()
  
