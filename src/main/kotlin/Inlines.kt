import java.awt.event.MouseAdapter

/*
                                        Theory: Inline Class
            Inline classes in Kotlin are a way to wrap a value without the overhead of object allocation,
            improving performance. They are declared using the @JvmInline annotation and are used primarily
            for type safety.
 */

@JvmInline
value class Password(private val s: String)

@JvmInline
value class Man(private val fullName: String) {

    init {
        require(fullName.isNotBlank()) {    // if the fullName is blank or null or empty, the below message will be displayed.
            "Full name shouldn't be empty or blank, from init{}"
        }
    }

    constructor(firstName: String, lastName: String) : this("$firstName $lastName") {
        require(fullName.isNotBlank()) {
            "Full name shouldn't be empty or blank, from constructor(){}"
        }
    }

}

fun main() {

    // Inline class.
//    val password = Password("password")
//    println(password)

    // Inline class with its members.
    val man = Man("Parimal", "Matte")
    println(man)

}




