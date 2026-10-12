# Cuestionario de Comprensión — Taller 3 (Kotlin)

## 1. punto 1 "Básicos"
1. **Pregunta1 — Diferencia entre `val` y `var`
    - la diferecia entre :
    - `val` se puede decir que val es una variable que solo va a permitir la lectura, es decir que no se va a cambiar o que es una constante.
    - `var` es una variable cuyo valor puede reasignarse.
2. **Pregunta 2 — Inferencia de tipos: Kotlin es un luenguaje que puede  deducir automáticamente el tipo de dato según el valor asignado cuando declaramos una variable.
3. **Pregunta 3 — Plantillas de cadena (*String templates*): Permiten insertar variables (`$variable`) o expresiones (`${expresion}`) dentro de un texto sin necesidad de concatenar con `+`.

## 2. punto 2 "Condicionales"
1. **Pregunta 4 — `if`= En Kotlin, se puede utilizar la expresión  `if`  y este puede devolver un valor que se fue  asignado directamente a una variable o puede retornar  una función.
2. **Pregunta 5 — `when`: Reemplaza al conocico `switch`, es más expresivo a demas  permite evaluar rangos, tipos y condiciones complejas.
3. **Pregunta 6 — 'Retorno directo':lo podemos definir como unas  funciones de expresión única usando `= if (...) ... else ...`.

## 3. punto 3 "Nulabilidad"
1. **Pregunta 7 — "Llamada segura" (`?.`): esta ejecuta una propiedad o método solo si el objeto receptor no es `null`; de lo contrario, lo evalua.
2. **Pregunta 8 — "Operador Elvis" (`?:`): Proporciona un valor por defecto es decir  en caso de que la "llamada segura"  sea `null`.
3. **Pregunta 9 — Operador `!!` y `let`: `!!` obliga a tratar una referencia como no nula, lanzando `NullPointerException` si resulta ser `null` (debe evitarse).
                                         `let`este  ejecuta un bloque de código solo cuando el objeto no es nulo, pasando la referencia como `it`.

## 4. punto 4 "POO Moderna"
1. **Pregunta 10 — `data class`: Son clases diseñadas para almacenar datos que generan automáticamente métodos como `equals()`, `hashCode()`, `toString()`, `copy()` y funciones de desestructuración.
2. **Pregunta 11 — `copy()`: Permite copiar un objeto de una `data class` y ademas permite modificar si se require algunas de sus propiedades sin mutar la instancia original.
3. **Pregunta 12 — `sealed class`: Define jerarquías cerradas de clases, garantizando que el compilador identifique  todas las subclases posibles y permite evaluaciones exhaustivas con `when`.

## 5. punto 5 "Lambdas y Funciones de Orden Superior"
1. **Pregunta 13 — Parámetro implícito `it`: es el nombre asignado automáticamente al parámetro único de una lambda en Kotlin.
2. **Pregunta 14 — Función de Orden Superior (HOF):Función que recibe otras funciones como parámetros o devuelve una función.
3. **Pregunta 15 — Extension Functions:Permiten agregar nuevas funciones a clases existentes sin modificar su código fuente ni heredar de ellas.