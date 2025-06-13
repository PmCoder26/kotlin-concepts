

data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)
operator fun Point.unaryPlus() = Point(x, y)

operator fun Point.inc() = Point(x + 1, y + 1)
operator fun Point.dec() = Point(x - 1, y - 1)


@JvmInline
value class Counter(val counter: Int)

operator fun Counter.inc() = Counter(counter + 1)
operator fun Counter.dec() = Counter(counter - 1)
operator fun Counter.plus(b: Int) = Counter(counter + b)
operator fun Counter.minus(b: Int) = Counter(counter - b)
operator fun Counter.div(b: Int) = Counter(counter / b)
operator fun Counter.times(b: Int) = Counter(counter * b)
operator fun Counter.rem(b: Int) = Counter(counter % b)


fun main() {

    // unary plus and minus.
    var point = Point(12, 23)
    println("Normal point : $point")
    println("UnaryMinus point: ${-point}")
    println("UnaryPlus point: ${+point}")

    // note - the below operations alter the 'point' variable.
    println("Increment point: ${++point}")
    println("Normal point: $point")
    println("Decrement point: ${--point}")

    println()

    var counter = Counter(100)
    // note - the below operations alter the 'counter' variable.
    println("Counter increment: ${++counter}")
    println("Counter decrement: ${--counter}")
    // note - the below operations won't alter the 'counter' variable, they just
    // temporarily calculate and return new object
    println("Counter plus: ${counter + 100}")
    println("Counter minus: ${counter - 50}")
    println("Counter multiplication: ${counter * 2}")
    println("Counter division: ${counter / 2}")
    println("Counter mod %: ${counter % 2}")
    println()

    // Now, to update the 'counter' variable, we need to use the plusAssign, minusAssign, ... etc.
    // These are assignment operation functions and not need to overload in many cases.
    // Hence, it will change the variable.
    // And for these operations, we need the same datatype in declaring the function.
                // Or
    counter += 10
    println("Counter plusAssign: $counter")
    counter -= 20
    println("Counter minusAssign: $counter")
    counter *= 10
    println("Counter timesAssign: $counter")
    counter /= 10
    println("Counter divAssign: $counter")
    counter %= 2
    println("Counter modAssign: $counter")



}
