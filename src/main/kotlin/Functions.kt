import java.math.BigDecimal
import java.math.BigInteger
import kotlin.reflect.typeOf


fun square(x: BigInteger): BigInteger {
    return x * x
}

fun product(x: Int, y: Int): Int = x * y

fun <T> genFun(x: T) {
    println("The datatype of the argument is: ${x!!::class.simpleName}")
}

fun main() {

    // Normal functions.
//    print("Enter the number to square it: ")
//    val x = readln().toBigInteger()
//    println("The square of $x is: ${square(x)}")

    // functions with expressions.
//    print("Enter x: ")
//    val x = readln().toInt()
//    print("Enter y: ")
//    val y = readln().toInt()
//    println("The product of $x and $y is: ${product(x, y)}")

    // Lambda functions.
//    val divide = { a: Int, b: Int -> a/b }
                // Or
//    val divide: (Int, Int) -> Int = { a, b -> a/b }
//    print("Enter a: ")
//    val a = readln().toInt()
//    print("Enter b: ")
//    val b = readln().toInt()
//    print("Division of $a by $b is: ${divide(a, b)}")

    // Function inside code block, function scopes.
//    fun subtract(a: Int, b: Int): Int {
//        return a - b
//    }
//    println("The subtraction of $b from $a is: ${subtract(a, b)}")

    // Generic functions.
//    genFun(1)

}