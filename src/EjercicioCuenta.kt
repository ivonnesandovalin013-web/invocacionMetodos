//dataclass (clase de datos): diseñado para almacenar, transportar y comparar informacion
//Concepto de Kotlin(genera automaticamente varios metodos. Ejm: print, toString, equals(comparar),
// copy(crear propiedades para no alterar el original), hashCode(HashSet, HashMap))
//Informacion, registros de diferentes cosas, comparar objetos de su forma directa, copiar objetos facilmente
//cuando transportamos informacion
data class Cuenta(val saldo: Double){
    //ADMINISTRAR EL SALDO DE UNA CUENTA
} //Hago una copia de mi dataclass y a esa copia le modifico, emulo como depositar, sin necesidad sin la pro. imperativa.
//Copy() es propio de los dataclass
//Funciones
fun depositar(cuenta: Cuenta, cantidad:Double):Cuenta{ //me devuelve un nuevo estado con el valor actualizado
    return  cuenta.copy(cuenta.saldo + cantidad)
}

fun retirar(cuenta: Cuenta, cantidad:Double):Cuenta{
    return  cuenta.copy(cuenta.saldo - cantidad)
}
fun main(){
    val cuentaIncial = Cuenta(10000.0)
    val cuenta1= depositar(cuentaIncial, 5000.0)
    val cuenta2= retirar(cuenta1, 2500.0)

    println(cuentaIncial)
    println(cuenta1)
    println(cuenta2)
}
