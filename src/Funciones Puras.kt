//Incrementar un contador


//imperativa
var contador = 0
fun incremetar(){
    contador ++
}
//funcional
fun incremetarF(contador: Int): Int{
    return contador+1 //cambiar el valor que le mandas como atributo a la funcion
}


//Agregar un número a una lista
//Imperativa
fun agregar(lista:MutableList<Int>, numero: Int){
    lista.add(numero)
}
//Funcional
fun agregarF(lista: List<Int>, numero: Int):List<Int>{
    return lista+numero
}


//operar y mostrar resultados
//imperativa:
fun calcularCuadrardo(numero:Int){
    println(numero*numero)
}
//funcional
fun calcularCuadradoF(numero:Int):Int{
    return numero*numero
}


//ingresar informacion
//imperativa
fun obtenerNombre():String{return readln()}
//funcional
fun obtenerNombreF(nombre:String):String{
    return nombre
}


fun convertirTemperaturaF(celsius:Double):Double{
    return (celsius *9/5) +32
}


fun verificarPar(numero: Int):Boolean{
    return numero %2 == 0
}


fun calcularEdad(anioNacimiento:Int, anioActual:Int):Int = return anioActual-anioNacimiento




fun main(){
    println("Grados: ${convertirTemperaturaF(18.0)}")
    println("Es par: ${verificarPar(8)}")
    println("Edad: ${calcularEdad(2001,2026)}")
}
