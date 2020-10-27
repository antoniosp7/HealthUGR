## Lenguaje de programación

Para la selección del lenguaje se realizó un estudio principalmente entre tres lenguajes JavaScript, Go y Scala. A pesar de contar con experiencia usando JavaScript he decidido aprender un nuevo lenguaje ya que sería contar con más experiencia en diversos campos, posteriormente decidí descartar Go ya que aunque según la bibliografía estudiada comenta que tiene una curva de aprendizaje corta tiene una sintaxis parecida al lenguaje C, con el cual tengo muy poca experiencia, y por lo tanto he decidido elegir el lenguaje Scala que tiene ciertas similitudes con Java que es un lenguaje que he usado mucho y además es un lenguaje que siempre he querido aprender por ciertas recomendaciones.

## Base de datos

Como no contaba con experiencia previa con Scala, he tenido que investigar que tipo de base de datos puede ser apropiada para este lenguaje, los documentos estudiados coinciden en usar base de datos no relacionales y en concreto algunos de ellos aconsejan MongoDB por lo que al contar con cierta experiencia con esta tecnología decidí escogerla.

## REST API Framework 

Al igual que con la base de datos para saber que tecnología puedo usar para la realización de la API encargada de las comunicaciones entre los microservicios he tenido que investigar que posibilidades tengo, [en esta página](https://nordicapis.com/8-frameworks-to-build-a-web-api-in-scala/) se muestran las tecnologías mas usadas. Indagando en el framework Play vi que es posible la realización de este tipo de APIs e incluso he visto ciertos proyectos con arquitectura basada en microservicios que lo usan, por eso a día de hoy he decidido su utilización.

## Herramienta de construcción y gestor de dependencias

Para este campo he escogido usar la herramienta sbt la cual hemos visto de una manera ligera durante un ejercicio de autoevaluación de la asignatura.

## Integración Continua

Aunque aún no he indagado suficientemente en como realizaré la integración continua, la herramienta que mas he usado es Travis CI la cual hemos visto también en la asignatura, al ver que tiene soporte para el lenguaje Scala he decidido usarla en el futuro como herramienta de Integración Continua.