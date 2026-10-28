fun main(){
    //inmutable(lectura)
    val numeros1 = listOf(1,2,3,4,5)//No existe forma que se pueda hacer algo con esta lista
    //mutable
    var numeros2 = mutableListOf(1,2,3)

    //operaciones
    //añadir elemento
    numeros2.add(6)
    numeros2.add(7)
    //recorrer
    //Existen 3 formas
    //1.
    for(numero in numeros1){
        println(numero)
    }
    //2. Imprime lo que esta en cada posicion
    for(i in numeros2.indices){
        println(numeros2[i])
    }
    //3. Como programacion funcional
    numeros2.forEach { println(it) } //Funcion pura, es palabra reservada para recorrer los elementos


    //eliminar
    //Existen 2 formas
    //1.elemento en especifico, el contenido, si existen varios elimina solo el primero
    numeros2.remove(2)
    numeros2.forEach { println(it) }
    //2.Se elimina el de la posicion 0
    numeros2.removeAt(0)
    numeros2.forEach { println(it) }

    //Acceder a los elementos
    //Existen 2 formas
    //1.
    println(numeros2[0]) //Saber el tamaño de la lista
    //2.
    println(numeros2.get(1))//Saber el tamaño de la lista



}