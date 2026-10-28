class Producto(val name:String,
               val precio: Double,
               val cantidad:Int) {

    fun subtotal(): Double {
        return precio * cantidad
    }
    fun calcularDescuento(): Double{
        //val subtotal = subtotal()
        return if(subtotal()>= 100) subtotal()*0.10 else 0.0
    }
    fun total(): Double {
        return subtotal()-calcularDescuento()
    }
}

fun main() {
    val producto1= Producto("Brasil", 10.0,3)
    println("El subtotal es: ${producto1.subtotal()}")
    println("El descuento es: ${producto1.calcularDescuento()}")
    println("El total es: ${producto1.total()}")

}