

/*
                                        Theory about Kotlin extensions.
            Kotlin provides the ability to extend a class or an interface with new functionality without having to
            inherit from the class or use design patterns such as Decorator. This is done via special declarations
            called extensions.
 */



// extension of the MutableList class to add the function of swapping two numbers.
fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val temp = this[index1]     // 'this' represents the current list on which this operation is executed.
    this[index1] = this[index2]
    this[index2] = temp
}


fun main() {

    val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("List before swapping 2 and 9 is: $list")
    list.swap(1, 8)
    println("List after swapping 2 and 9 is: $list")

}
