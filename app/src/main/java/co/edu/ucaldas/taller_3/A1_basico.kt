package co.edu.ucaldas.taller3

fun calcularIMC(pesoKg: Double, estaturaM: Double): Double {
    return pesoKg / (estaturaM * estaturaM)
}

fun presentacion(nombre: String, edad: Int, imc: Double): String =
    "$nombre tiene $edad años y un IMC de ${"%.2f".format(imc)}"

fun clasificarIMC(imc: Double): String = when {
    imc < 18.5 -> "Bajo peso"
    imc < 25.0 -> "Normal"
    imc < 30.0 -> "Sobrepeso"
    else       -> "Obesidad"
}

fun main() {
    val nombre = "Ana Gómez"
    val edad = 21
    val estaturaM = 1.68
    val pesoKg = 62.5

    val imc = calcularIMC(pesoKg, estaturaM)
    println(presentacion(nombre, edad, imc))
    println("Categoría: ${clasificarIMC(imc)}")
}