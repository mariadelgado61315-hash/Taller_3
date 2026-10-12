# Taller 3 — Fundamentos de Kotlin II
**Curso: "Programación para Dispositivos Móviles"  
**Universidad: Universidad de Caldas  
**Namespace: `co.edu.ucaldas.taller3`

---

## Estructura del Proyecto

```text
co.edu.ucaldas.taller3
  |-A1_basicos.kt   --Perfil y cálculo/clasificación de IMC
  |-A2_cond_null.kt --Manejo seguro de cupones, nulabilidad y tarifas
  |-A3_poo.kt       --Data class Producto con ventas, reposición y copy()
  |- A4_lambdas.kt  --Funciones de orden superior y filtrado de catálogo

Analisis del desarrollo del proyecto 
1. Dificultades y Soluciones
Configuración de Git/GitHub: cuando se fue a subir la informacion surgió un inconveniente de permisos de clave pública y al intentar realizar el push inicial. 
Se resolvió ajustando la configuración de VCS en Android Studio para utilizar autenticación HTTPS y el ejecutable nativo (Built-in), activando el credential helper.

Manejo de Nulabilidad: Evitar el uso del operador destructivo de debio  aplicar estructuras idiomáticas como llamadas seguras (?.) 
combinadas con el alcance de .let.

2. Aplicación en Android Real
Modelado de Estados de UI (sealed class): En una aplicación comercial con arquitectura MVVM/Jetpack Compose, los sealed class o sealed interface son fundamentales para representar 
los estados de una pantalla (por ejemplo: Cargando, Exito(listaDatos), Error(mensaje)).

Callbacks y Eventos (Lambdas): Se utilizarán constantemente para manejar eventos de la interfaz gráfica
 como onClick, respuestas a peticiones HTTP asíncronas o transformaciones de listas con .map y .filter.

3. tres cosas claves aprendidas 
Modelado inmutable y expresivo: La potencia de las data class nos ayudo a  reducir
 drásticamente el código repetitivo en comparación con Java.

Seguridad contra NullPointerException: Kotlin obliga a contemplar la nulabilidad desde el diseño 
del tipo de dato (T?), promoviendo aplicaciones más estables.

Flexibilidad con HOF: Pasar comportamiento como parámetro
 mediante lambdas nos permite escribir algoritmos e independientes y reutilizables.