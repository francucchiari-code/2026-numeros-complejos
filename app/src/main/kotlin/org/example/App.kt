package org.example

class Complejo{
    private var real: Int = 3,
    private var imaginario: Int = 4  
    fun poner_valor_real(real: Int) {
        this.real = real
    }} 
    
    {fun poner_valor_real(real: Int) {
        return real
    }

    fun poner_valor_imaginario(imaginario:Int)

        return real
    }

    fun ponerValorImaginario(imaginario: Int) {
        this.imaginario = imaginario
    }

    fun obtenerValorImaginario(): Int {
        return imaginario
    }
}

fun main() {
    val app: Complejo
    app = Complejo()
    println(app.obtenerValorReal())
    println(app.obtenerValorImaginario())
}
