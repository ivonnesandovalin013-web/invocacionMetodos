//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//invocacion basica
fun saludar(){
    println("Bienvenidos a la programacion funcional")
}
//invocaion en secuencia
fun inicial(){
println("inciando")
}
fun procesar(){
println("Procesando")
}
fun finalizar(){
println("Finalizar")
}
//metodos con parámetros.
fun imprimirNombre(nombre: String, edad: Int){
    println("El nombre es: $nombre y tiene $edad años")
}
//Calcular el área
fun calcularArea(base:Double, altura:Double){
    val area = (base*altura)/2
    println("El area del triangulo es: $area")
}

//Funciones que devuelven algo
fun sumar(a: Int, b: Int): Int{
    /*val result = a+b
    return result*/
    return a+b //Programacion funcional
}

fun sumar2(a: Int, b: Int): Int = a+b

fun esPar(a:Int):Boolean = a % 2 == 0

fun promedio(a: Double, b: Double, c: Double): Double = (a+b+c)/3
//Operacion de orden superior.
fun operar(a: Int, b: Int, operacion:(Int,Int)->Int):Int{
    return operacion(a,b)
}

//Materia prima para usar mi funcion operar
fun sumar3(a: Int, b: Int): Int = a+b
fun multiplicar3 (a: Int, b: Int): Int = a*b

class Calculadora{
    //funciones
    fun restar(a: Int, b: Int): Int =a-b
}
class Persona(
    var nombre: String,
    var edad: Int){
    //funciones

}
fun main() {
    saludar()
    inicial()
    procesar()
    finalizar()
    imprimirNombre("Nayely", 21)
    calcularArea(5.0, 10.0)

    //Formas de invocar la funcion
    //1.
    val resultado = sumar(1, 2) //creando una instancia en la fun main
    println(resultado)
    //2.
    println(sumar(5,2)) //llamo al metodo y lo imprimo

    println("La suma es: ${sumar2(5,7)}")
    println("La es Par es: ${esPar(7)}")
    println("El promedio es: ${promedio(7.0,5.0,8.0)}")

    //Cuando lo metodos estan dentro de la clase se crea instancias.
    val calculadora = Calculadora()
    val resta2 = calculadora.restar(8,7)
    println(resta2)
    val persona = Persona("Maria",8)
    val res1 = operar(4,5,::sumar3)
    println(res1)
    val re2 = operar(2,5,::multiplicar3)
    println(re2)
}