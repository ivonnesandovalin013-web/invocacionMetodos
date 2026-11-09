//MANEJO DE ESTADOS
//como se obtiiene, como se controla, como se conserva, como se ve la información.
fun main(){
    var contador = 0
    contador ++;
    contador ++;
    contador ++;
    println(contador)

    val estadoIncial = 0
    println(estadoIncial)
    val estado1 = incrementar(estadoIncial)
    val estado2 = incrementar(estado1)
    val estado3 = incrementar(estado2)
    println(estado3)

    //La creación de un nuevo estado sea igual f(EstadoActual)
    //SiguienteEstado = f(EstadoActual)
}

fun incrementar(contador:Int):Int{
    return contador+1
}

