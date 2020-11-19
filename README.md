## Justificación y elección del gestor de tareas

Para el gestor de tareas usaremos archivos makefile junto al gestor de dependencias sbt, es decir en el archivo makefile automatizaremos las sentencias sbt mientras que con sbt a través del archivo build.sbt gestionaremos las dependencias necesarias del proyecto. El principal motivo para elegir estas herramientas ha sido la información aportada sobre ella en el temario y en las clases, para el gestor de tareas no he encontrado muchas opciones aparte de make, la opción más viable para no usar make sería usar simplemente sbt sin embargo make a través de un makefile nos permite automatizar por ejemplo los comandos sbt. Por ejemplo si queremos compilar código scala debemos borrar los archivos del directorio target de un proyecto scala, y esto se haría a través de otro comando de sbt, sin embargo make nos permite agrupar estas dos sentencias sbt en una sola make.

Sin embargo para gestionar las dependencias si que hay más variedad, en concreto se tuvieron en cuenta cbt y mill aparte de sbt.

En concreto [aquí](https://jaxenter.com/build-tools-in-scala-144195.html) podemos ver una lista de herramientas para scala. El principal incoveniente de sbt es la dificultad que presenta comparado con los otros dos mencionados, si el proyecto a desarrollar fuera simple seguramente sería mejor idea usar mill o cbt sobre todo mill ya que opta por la simplicidad y la rapidez y sobre todo cuenta con una buena documentación, pero como a día de hoy no se hasta que punto llegará este proyecto a nivel de dificultad me decanto por sbt aunque requiera mayor tiempo de aprendizaje ya que es una elección prácticamente seguro en un proyecto scala con una gran cantidad de plugins.


## Marco de pruebas

Para el marco de pruebas se tuvieron en cuenta dos herramientas mencionadas anteriormente las cuales son ScalaTest y MUnit que es una herramienta que ha salido este año.

ScalaTest es la herramienta más popular dentro del campo del 'testeo' de código en Scala sin embargo se ha tenido en cuenta MUnit ya que a pesar de ser nueva cuenta ya con numerosos seguidores que la respaldan y a su vez al final de esta asignatura se nos evalua la originalidad por lo que me planteé en este caso salir de lo clásico, a su vez munit comparte característiscas con jUnit que es una librería con la que ya he trabajado anteriormente y los enfoques similares que poseen las dos me ayuda a iniciarme con esta nueva librería.

## Biblioteca de aserciones

Para la biblioteca de aserciones hemos considerado tres de ellas, la éstandar que posee el propio lenguaje scala, la que nos proporciona la herramienta de 'testing' ScalaTest y la que nos proporciona la herramienta MUnit que fue lanzada este año.

- Scala Standard Library: En este caso las aserciones se encuentran declaradas en el objeto [Scala.Predef](https://www.scala-lang.org/api/current/scala/Predef$.html) de la librería éstandar del lenguaje, como nos dice la documentación nos proporciona una seria de funciones de aserción para comprobar las invariantes del código, en concreto con la función 'assert' y también nos ofrece funciones para análisis estático como 'assume', 'require' y 'ensuring'.

- Aserciones de ScalaTest: Esta librería nos ofrece por defecto tres aserciones las cuales son 'assert'(para las generales), 'assertResult'(para diferenciar lo esperado de lo actual) y 'assertThrows'(para lanzar excepciones en una parte del código)

- Aserciones de MUnit: este marco nos proporciona varias formas de testear código, el más básico sería la función 'assert' que comprueba la condición de dentro, esta librería nos ofrece una opción muy interesante la cual se llama 'clue' que nos ofrece información más detallada en caso de error de los datos dentro del 'assert', también contamos con una función 'assertEquals' que comprueba si los dos valores son iguales, 'assertNotEquals' para comprobar que no sean iguales y aparte de varias más tenemos la función 'intercept' que capta una excepción.

Al no tener experiencia previa con Scala no cuento con referencias con ninguna biblioteca de aserciones por lo que mi mayor motivación para elegir es usar una biblioteca que sea parecida a otras con las que si cuento con experiencia y sobre todo que cuente con información detallada acerca de errores, por ello me voy a decantar por probar la librería de MUnit ya que me parece muy interesante la función de Clues las cuales me pueden ayudar sobre todo al principio del desarrollo de test al aportarme una información más detallada de los tests realizados.

## Documentos aparte

  - [Herramientas del proyecto](https://github.com/antoniosp7/HealthUGR/blob/master/docs/tools.md)
  - [Configuración de Git y Github](https://github.com/antoniosp7/HealthUGR/blob/master/docs/GitConfiguration.md)
  - [READMEs anteriores](https://github.com/antoniosp7/HealthUGR/blob/master/docs/READMEs.md)
  - [Planificación del proyecto](https://github.com/antoniosp7/HealthUGR/blob/master/docs/Planning.md)
  
