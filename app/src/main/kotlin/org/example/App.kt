package org.example

class Complejo(
    private var real:Double=0.0,
    private var imag:Double=0.0) {

    fun inicializar(real:Double,imag:Double){
        this.real=real
        this.imag=imag}
    fun mostrar(){
        println(this.toString())}
    override fun toString():String{
        return "(${real},${imag})"
    }
    fun sumar(otro:Complejo):Complejo{
        return Complejo(
            real+otro.real,
            imag+otro.imag
        )}
    fun restar(otro:Complejo):Complejo{
        return Complejo(
            real-otro.real,
            imag-otro.imag
        )}
    fun multiplicar (otro: Complejo): Complejo {
        val nuevoReal=real*otro.real-imag*otro.imag
        val nuevoImag=real*otro.imag+imag*otro.real
        return Complejo(nuevoReal,nuevoImag)
    }
    fun dividir(otro: Complejo): Complejo {
        val denominador = otro.real * otro.real + otro.imag * otro.imag
        val nuevoReal = (real * otro.real + imag * otro.imag) / denominador
        val nuevoImag = (imag * otro.real - real * otro.imag) / denominador
        return Complejo(nuevoReal, nuevoImag)
    }
}

fun main() {
    var complejo:Complejo
    complejo=Complejo()
    complejo.inicializar(3.0,4.0)
    println("mi número complejo es ${complejo.toString()}")
    var c2:Complejo=Complejo(1.0,2.0)
    var c3:Complejo
    c3=complejo.sumar(c2)
    println("la suma de complejos es:")
    c3.mostrar()
    var c4:Complejo
    c4=complejo.restar(c2)
    println("la resta de complejos es:")
    c4.mostrar()
    var c5:Complejo
    c5 =complejo.multiplicar(c2)
    println("la multiplicación de complejos es:")
    c5.mostrar()
    var c6:Complejo
    c6=complejo.dividir(c2)
    println("la división de complejos es:")
    c6.mostrar()

}