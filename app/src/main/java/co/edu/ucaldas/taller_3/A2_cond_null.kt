package co.edu.ucaldas.taller3


fun costoEnvioBase(subtotal: Int): Int =
    if (subtotal >= 150_000) 0 else 12_000

fun costoEnvioConCupon(subtotal: Int, cupon: String?): Int {
    val base = costoEnvioBase(subtotal)
    val esGratis = cupon?.uppercase() == "ENVIOGRATIS"
    return if (esGratis) 0 else base
}

fun descuentoPremium(subtotal: Int, esPremium: Boolean): Int =
    if (esPremium) (subtotal * 0.10).toInt() else 0

fun main() {
    val subtotal = 180_000
    val cupon: String? = "ENVIOGRATIS"
    val esClientePremium = false

    val envio = costoEnvioConCupon(subtotal, cupon)
    val descuento = descuentoPremium(subtotal, esClientePremium)
    val total = subtotal - descuento + envio

    cupon?.let { println("Cupón aplicado: $it") }
    println("Subtotal:  $subtotal")
    println("Descuento: $descuento")
    println("Envío:     $envio")
    println("TOTAL:     $total")
}