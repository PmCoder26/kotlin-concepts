

/*
                            Theory for TypeAlias
            Type aliases provides alternative names for existing types.
            If the type name is too long, you can introduce a different
            shorter name and use the new one instead.
 */


typealias Str = String

typealias BoolFun = (String) -> Boolean

typealias SumFun = (Int, Int, Int) -> Int


fun main() {

    // typealias basic example. Here we used Str as String datatype alias.
    val s: Str = "This is a string"
    println("The string is $s")

    // typealias of a boolean function with a single parameter.
    val boolFun: BoolFun = {it == "Parimal"}
    println(boolFun("Parimal"))

    // typealias of an integer function with multiple parameters.
    val threeSum: SumFun = {a, b, c -> a + b + c}
    println(threeSum(10, 34, 2))

}