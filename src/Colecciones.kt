//imperativa
var descuento =10
fun calcularPrecio(precio:Double):Double{
    return precio - (precio*descuento/100)
}
fun doble(x:Int)=x*2
fun suma(a: Int, b:Int)=a+b


val resultado = suma(doble(2+1), doble(3))


//pura
fun calcularPrecio2(precio:Double, descuento: Double):Double {
    return precio - (precio * descuento / 100)
}


//listas
fun duplicarListas(listas: List<Int>): List<Int>{
    return listas.map{it*2}//it para recorrer cada espacio de la lista en este caso para duplicar dice que cada elemento lo multiplique x2
}


//Fitltre los numero pares de una lista
fun filtrarListas(listas: List<Int>): List<Int>{
    return listas.filter { it % 2 == 0 }
}


fun sumaLista(listas: List<Int>): Int{
    return listas.sum()
}


fun promedio(listas: List<Int>): Double{
    return listas.average()
}


fun maximo(listas: List<Int>): Int{
    return listas.max()
}


fun min(listas: List<Int>): Int{
    return listas.min()
}


//Obtener el cuadrado de un numero
fun cuadrado(n: Int): Int = n*n
//Los impares de un numero
fun esImpar(n: Int): Boolean = n % 2 !=0


//funciones dentro de una lista


fun procesar(listas: List<Int>): List<Int>{
    return listas.map { cuadrado(it) }.filter { esImpar(it) } //usamos
    // la funcion del cuadrodo a cada elemento de la lista y filtre solo los impares de la lista
}
//transforme una lista de temperaturas(Int) a String bajo que si son temperatura que 4 fria, 8 a 9 templado y mayor a 10 caliente
fun clasificarTem(listas: List<Int>): List<String> {
    return listas.map {
        //atributo dentro del lambda
        when{
            it<4 ->"Frio"
            it<=8 -> "Templado"
            else ->"caliente"
        }
    }
}


//Funcion pura que permita contar los numeros pares de mi lista numeros
fun cantidadPares(listas: List<Int>): Int{
    return listas.count{it % 2 == 0}
}


fun main(){
    val numero = listOf(1,2,3,4,5,6,7,8,9,10)
    //para utilizar mi funcion debo crear un nuevo estado(variable)
    val resultado = duplicarListas(numero)
    println(numero)
    println(resultado)
    val pares = filtrarListas(numero)
    println(pares)


    val suma = sumaLista(numero)
    println(suma)


    val promedio = promedio(numero)
    println(promedio)


    val max = maximo(numero)
    println(max)


    val min = min(numero)
    println(min)


    val procesarEjemplo = procesar(numero)
    println(procesarEjemplo)


    val temperatura = clasificarTem(numero)
    println(temperatura)


    val valor =cantidadPares(numero)
    println(valor)


}
