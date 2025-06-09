

class MyClass {

    fun classMeth() {
        println("Calling from classMeth of MyClass...")
    }

}

enum class Gender {
    MALE,
    FEMALE
}

class Person(var name: String, var age: Int, var gender: Gender) {          // method-1

//    var name: String
//    var age: Int
//    var gender: Gender

    // method-2
//    constructor(name: String, age: Int, gender: Gender) {
//        this.name = name
//        this.age = age
//        this.gender = gender
//    }

    fun displayDetails() {
        println("**********************************")
        println("Name: $name, Age: $age, Gender: $gender")
        println("**********************************")
    }

    init {      // Execute logic during object creation, and constructor is called when the object is created.
                // That means the init{} is called first then constructor(){}
        println("Object is creating for $name...")
    }

}

class MyPen private constructor() {
    // private constructor, when you don't want the class's instance is created outside the class itself.
    // useful when you want to just mimic the static things of the class.

    companion object {
        fun displayDetails(name: String, price: Int) {
            println("**********************************")
            println("Name: $name, price: $price")
            println("**********************************")
        }
    }
}

abstract class Polygon {
    abstract fun draw()
}

class Hexagon : Polygon() {
    override fun draw() {
        println("Drawing Hexagon with 6 sides...")
    }
}

open class Shape(val name: String) {
    open fun draw() { /*TODO*/ }
}

class Circle(name: String) : Shape(name) {
    override fun draw() {
        this.name
        println("Drawing the $name circle")
    }
}

open class Metal {      // class with the variables that are read-only

    val name: String        // provides read-only ability.
        get() = "Metal"

    public var metalPurity: Double = 0.89       // visible publicly and can be modified(set) inside the class only
        private set

}



fun main() {

    // normal class.
//    val mc = MyClass()
//    mc.classMeth()

    // class with init(){} and constructor(){}
//    val p1 = Person("Parimal", 21, Gender.MALE)
//    val p2 = Person("Neha", 20, Gender.FEMALE)

    // class with private constructor containing private variables.
//    MyPen.displayDetails("Fair", 50)

    // abstract class.
//    val hexagon = Hexagon()
//    hexagon.draw()

    // inheritance.
//    val circle = Circle("Parimal-Circle")
//    circle.draw()

    // classes with get() and set() mechanisms.
//    val metal = Metal()
//    println("Metal's default name is: ${metal.name}")



}
