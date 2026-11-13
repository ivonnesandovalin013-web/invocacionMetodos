import kotlin.math.pow
//nular
fun obetenerMensaje():String{
    return "Funcion Nular" //es pura porque no usa un println()
}

//unaria - El cuerpo de la funcion depende de la actividad que se va a programar.
fun esPrimo(numeros:Int):Boolean{
    if(numeros < 2) return false
    for(i in 2 until numeros){
        if(numeros % i == 0){
            return false
        }
    }
    return true
}

//binaria
fun calcularMCD(a: Int, b:Int):Int{
    var x=a
    var y=b
    while(y != 0){
        val residuo = x % y
        x = y
        y = residuo
    }
    return x
}

//ternaria
fun promedioPonderado(nota1: Double, nota2: Double, nota3: Double):Double{
    return nota1*0.30+nota2*0.30 +nota3*0.30
}

/*//cuaternaria
fun calcularDistancia(x1: Double, y1: Double, x2: Double, y2: Double):Double{
    return sqrt(pow((x2 - x1), 2.0) + pow((x1 - x2), 2.0))
}*/

//n-aria
fun calcularNotaFinal(examen: Double, proyecto:Double, deberes: Double, lecciones: Double, participaciones:Double):Double{
    return examen*0.30 + proyecto*0.25 + deberes*0.20 + lecciones*0.15+participaciones*0.10
}

fun ecuacion(a: Double, b:Double, c:Double):String{
    val d= b.pow(2)-(4*a*c)
    return when{
        d > 0.0 -> "La ecuacion tiene 2 raices reales y distintas, discriminate: $d"
        d == 0.0 -> "La ecuacion tiene una solucion, discriminate: $d"
        else -> "La ecuacion no tiene valores reales,discriminate: $d"
    }
}

//1, 1.5,6
data class Punto(val x: Double, val y: Double)
fun puntoMedio(x1: Double, y1: Double, x2: Double, y2: Double):Punto{
    val mx = (x1+x2)/2
    val my = (x1+x2)/2
    return Punto(mx,my)
}
//Pair metodo generico que te permite mostrar numero en formas de cordenadas.
fun main(){


}