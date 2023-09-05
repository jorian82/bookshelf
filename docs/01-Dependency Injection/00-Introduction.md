# Dependency Injection

Inyeccionde dependencias ens la heramienta mas importante de Spring, es un concepto muy poderoso, el cual debemos tener 
muy presente y bien 

## Principios SOLID de POO

Estos principios datan de 1995, fueron descritos por Robert Martin (tambien conocido como Tio Bob), éstos principios 
iniciaron como posts en blogs y escritos personales.

Más tarde se convirtieron en la base de el libro de Martin "Desarrollo de Software Ágil: Principios, Patrones y 
Prácticas"

El acronimo SOLID se le atribuye a Michael Feathers

## Qué significa SOLID

Éste nombre/acronimo viene de los conceptos por sus siglas en inglés:

* S - Single Responsibility Principle
* O - Open Closed Principle
* L - Liskov Substitution Principle
* I - Interface Segregation Principle
* D - Dependency Inversion Principle

### Single Responsibility Principle - Principio de Responsabilidad Sencilla
Solo porque *puedas* no quiere decir que *debas*

* Cada clase debe tener responsabilidad única
* No debe haber más de una razón para cambiar una clase
* Las clases deben ser pequeñas. No más de una pantalla llena de código
* Evita clases "dios"
* Divide clases grandes en clases pequeñas
* Evita métodos grandes, son muy dificiles de probar 


### Open Closed Principle - Principio de Abierto Cerrado
Una cirugia a pecho abierto no es necesaria cuando vas a usar abrigo

* Las clases deben estar abiertas a extensiones
* Las clases deben estar cerradas a modificaciones
* El comportamiento de las clases puede ser extendido sin modificarla
* Usa variables privadas con getters y setters SOLO cuando sea necesario
* Usa clases base abstractas


### Liskov Substitution Principle - Principio de Substitución Liskov
Si hace como pato, parece pato pero necesita baterías, seguramente tienes la abstracción equivodcada

* Éste principio fue creado por Barbara Liskov en 1998
* Los objetos de un programa pueden ser reemplazadas con instancias de sus subtipos SIN alterar la correctez del programa
* Las violaciones a este principio fallan la prueba "Es un". Ejemplo un Cuadrado es un Rectangulo pero un Rectangulo NO es un cuadrado


### Interface Segregation Principle - Principio de Segregación de Interfaces
Quieres que conecte ésto en donde?

* Crea interfaces sencillas que sea específicas para cada cliente
* Muchas interfaces sencillas son mejores que una interfaz de propósito general
* Mantén tus componentes enfocados en minimizar dependencias entre ellos
* Observea la relacion que se guarda con el principio de responsabilidad sencilla
* Evita interfacez "Dios"


### Dependency Inversion Principle - Principio de Inversión de Dependencias
Soldarías la conexión de una lámpara directamente al contacto?

* Las abstracciones no deben depender de los detalles
* Los detalles no debeb depender de las abstracciones
* Es importante que los objetos de mayor y menor nivel dependan de la misma interaccón abstracta
* Ésto no se refiere a la inyección de dependencias, que se refiere a cómo los objetos obtienen otros objetos independientes
* 

### En resumen

* Los principios SOLID nos guian para tener código de mejor calidad
* El código será más estable y fácil de mantener
* Algo importante es evitar el acoplamiento estrecho en el código
* Es necesario ser pragmático cuando seguimos éstos principios, cada ruta no necesariamente requiere una clase controlador

