


class OuterClass {
    var data: Int

    constructor(data: Int) {
        this.data = data
    }

    class NormalNestedClass {       // the normal nested class doesn't have access to the outer class's members
        var normalNestedData: Int

        constructor(data: Int) {
            this.normalNestedData = data
        }

        fun getOuterDataMeth() {
//            println("Outer class data: ${this@OuterClass.data}")    -> error occurs.
            println("Error in accessing the outer class data")
        }

    }

    fun outerClassMethod() = "Hello from outer class!"

    inner class InnerClass {
        var normalNestedData: Int

        constructor(data: Int) {
            this.normalNestedData = data
        }

        fun getOuterDataMeth() {
            println("Outer class data: ${this@OuterClass.data}")    // works fine.
            println("Outer class method: ${outerClassMethod()}")
        }
    }

}



fun main() {

    val normalNestedClass = OuterClass.NormalNestedClass(10)
    normalNestedClass.getOuterDataMeth()

    val outerClass = OuterClass(10)
    // You will have to create an object of outer class to create an object of its inner class.
    val innerClass = outerClass.InnerClass(10)
    innerClass.getOuterDataMeth()

}