
# **Factory Method**

## Definición

El Factory Method, también es un **patrón de diseño creacional** que permite la **creación de objetos sin especificar su clase concreta;** esto implica cambiar el objeto creado de manera flexible, cumpliendo así con el Principio de Responsabilidad Única.

## ¿Qué problema soluciona?

Problema: La **creación de un objeto directamente de una clase** hace esta implementación muy inflexible.

Solución: Separar la **creación del objeto fuera de la clase que lo implementa**.

## ¿Cuándo se utiliza el patrón Factory?

Cuando **no se conocen las dependencias o interacciones de los objetos** ni los tipos exactos que se espera tratar.

También es útil para dejar abierta la **posibilidad de extender la funcionalidad del software**, es decir, cumplir con el principio “abierto para extensiones, cerrado para modificaciones” **(Open/Closed)**.

## Ventajas

- Deja abierta la facilidad para **extender el software**
- Es más **fácil testear** ya que permite hacer **pruebas sobre la clase creadora** y no sobre sus implementaciones concretas.
- **Evita el acoplamiento** entre las operaciones y los productos a devolver.
- Cumple el **Principio de Responsabilidad Única**

## Desventajas

- Su implementación implica un **aumento significativo del número de clases integradas** así como el **esfuerzo que se requiere para manejarlas**.

## Fuentes

https://refactoring.guru/es/design-patterns/factory-method

https://www.digitalocean.com/community/tutorials/gangs-of-four-gof-design-patterns

https://refactorizando.com/patron-diseno-factory-method/

https://devexpert.io/factory-method/