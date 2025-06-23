import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

/*
                                        Theory about Serialization.
    Serialization is the process of converting data used by an application to a format that can be transferred over
    a network or stored in a database or a file. In turn, deserialization is the opposite process of reading data from
    an external source and converting it into a runtime object.
 */

fun main() {

    // Encoding into the JSON element.
    val json = Json.encodeToJsonElement(
        Student(
            id = 1,
            name = "Parimal Matte",
            age = 21,
            gender = "Male"
        )
    )


    // printing the JSON element.
//    println("JSON: $json")

    // getting the JSON object.
    val jsonObject = json.jsonObject
    // getting all the entries.
//    println("Entries in key/value pairs: ${jsonObject.entries}")
    // getting all the keys.
//    println("Keys: ${jsonObject.keys}")
    // getting all the values.
//    println("Values: ${jsonObject.values}")
    // for-loop over the json object.
//    jsonObject.forEach { key, value ->
//        println("Key: $key -> value: $value")
//    }
                // OR.
//    jsonObject.forEach { it ->
//        println("(Key: ${it.key}, value: ${it.value})")
//    }
    // checking whether the key exists or not.
//    println("The given key exists: ${jsonObject.containsKey("id")}")

    // Decoding the JSON string into kotlin data class.
//    val jsonStr = """
//        {
//            "id" : 1,
//            "name" : "Rohit Gandhal",
//            "age": 19,
//            "gender": "Male"
//        }
//    """.trimIndent()
//    val decodedStudent = Json.decodeFromString<Student>(jsonStr)
//    println(decodedStudent)


}