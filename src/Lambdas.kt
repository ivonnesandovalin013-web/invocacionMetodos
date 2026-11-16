import java.lang.Math.pow
import kotlin.math.sqrt
import kotlin.math.pow
//lambdas
/*fun():hdsod{
    return
}

val sum = {parametros->cuerpo} //mas apropiada a programacion funcional.*/

//nularia

fun obtenerMensaje():String{
    return "Hola Mundo"
}

//unaria
fun calcularCubo(numero:Int):Int{
    return numero*numero*numero
}

/*fun sumar(a:Int, b:Int): Int{
    return a+b
}*/

fun calcularCosto(precio:Double, cantidad:Int, descuento: Double, impuesto: Double, transporte: Double ): Double{
    val subtotal = precio * cantidad
    val totalDescuento = subtotal * (descuento/100)
    val baseImponible = subtotal - totalDescuento
    return baseImponible+ (baseImponible*(impuesto/100))+transporte
}
//cuando tenemos expresiones lambda extensos las llaves se escribe despues
val calcularTotal : (Double, Int, Double, Double, Double)-> Double = {
    precio, cantidad, descuento, impuesto, transporte ->
    val subtotal = precio * cantidad
    val totalDescuento = subtotal * (descuento/100)
    val baseImponible = subtotal - totalDescuento
    baseImponible+ (baseImponible*(impuesto/100))+transporte
}

//Ejemplo de data class
data class Estudiante1(
    val nombre:String,
    val nota: Double)

val crearEstudiante : (String, Double) -> Estudiante1 = {
    nombre, nota -> Estudiante1(nombre, nota)
}

val mostrarEstudiante: (String, Double) -> Unit = {
    nombre, nota ->
    println("Estudiante $nombre")
    println("Calificacion $nota")
}

//estudiante paso o reprobo con nota mayor que 7

val pasarAño : (Estudiante1) -> String = {
    estudiante1 ->
    if(estudiante1.nota >= 7.0){
        "Aprobado"
    }else{
        "Reprobado"
    }
}

//crea una clase triangulo que reciba las coordenadas de los 3 vectices.
//crear funciones lambda que determinen:
//1. la distancia entre los 3 pares de puntos
//2. el perimetro de la figura
//3. el area mediante la formula de Herón =
// area = la raiz cuadrada del (semiperimetro(semiperimetro del primer lado)(semiperimetro del segundo

data class Triangulo(
    val coorX1: Double,
    val coorY1: Double,
    val coorX2: Double,
    val coorY2: Double,
    val coorX3: Double,
    val coorY3: Double,
)

/*val distanciaDeLosPuntos : (Double)-> Double = {
    x1,y1,x2,y2,x3,y3 ->
    val ab = sqrt(pow(x2-x1)+(y2-y1))

}*/

fun main(){
    println(obtenerMensaje())

    //nularia
    val mensaje : ()-> String = {"Hola Mundo"} //cuando son funciones que no reciben parametros
    println(mensaje)

    //unaria
    val cubo : (Int) -> Int = {numero -> numero*numero*numero}
    val sumar : (Int, Int) -> Int = {a,b -> a+b}

    //calcularCosto
    val calcularCosto = calcularCosto(10.0,2,30.0,12.0,23.0)
    println(calcularCosto)

    val calcularTotal = calcularTotal(10.0,2,30.0,12.0,23.0)
    println(calcularTotal)

    val estudiante1 = Estudiante1("Juan",3.0)
    val pasarAño = pasarAño(estudiante1)
    println(pasarAño)

}