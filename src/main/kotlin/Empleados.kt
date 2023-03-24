
class Empleados {

    var edad = 0
        get() = field + 1
        set(value) {
            if (value <= 80 && value >= 18) {
                field = value
            } else {
                println("La edad no entra dentro de los rangos permitidos")
            }
        }

    var nombre : String? = null
        get() = field?.uppercase()
        set(value) {
            if (value!!.isEmpty()) {

            } else {
                field = value
            }
        }

    /*
    fun edad(_edad : Int){
        if (_edad <= 80 && _edad>=18){
            edad = _edad
        }else{
            println("La edad no entra dentro de los rangos")
        }
    }

    fun nombre(_nombre : String){
        if (_nombre?.isEmpty()){
            println("El nombre debe tener texto")
        }else{
            nombre = _nombre
        }
    }
    */

}