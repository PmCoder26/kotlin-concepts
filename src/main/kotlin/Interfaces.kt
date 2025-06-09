

interface Car {
    fun accelerate()

    fun stop()

    fun neutralize()

}

class MyCar : Car {
    override fun accelerate() {
        println("Accelerating...")
    }

    override fun stop() {
        println("Stopping...")
    }

    override fun neutralize() {
        println("Neutralizing...")
    }

}

interface A {
    fun meth() {
        println("Meth call of interface A")
    }
}

interface B {
    fun meth() {
        println("Meth call of interface B")
    }
}


class C : A, B {
    override fun meth() {
        super<A>.meth()
        super<B>.meth()
    }
}

fun main() {

    // simple interface.
//    val car = MyCar()
//    car.accelerate()
//    car.neutralize()
//    car.stop()

    // multiple interface inheritance and resolving the method name conflicts.
//    val c = C()
//    c.meth()



}