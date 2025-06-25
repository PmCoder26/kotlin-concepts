package data_science

import org.jetbrains.kotlinx.dataframe.DataFrame
import org.jetbrains.kotlinx.dataframe.api.columnOf
import org.jetbrains.kotlinx.dataframe.api.dataFrameOf
import org.jetbrains.kotlinx.dataframe.io.readCsv
import java.io.File


fun main() {

    // reading the csv file.
//    val df = DataFrame.readCsv(File("src/main/kotlin/data_science/data.csv"))
//    println("The dataframe is as below!")
//    println(df)

    // creating our own dataframe.
                // method-1
//    val name by columnOf("Parimal", "Karunya", "Rohit", "Shashank", "Hemant")
//    val gender by columnOf("MALE", "MALE", "MALE", "MALE", "MALE")
//    val marks by columnOf(98, 89, 87, 78, 99)
//
//    val df = dataFrameOf(
//        name, gender, marks
//    )
//    println(df)
                // method-2
//    val df = dataFrameOf(
//        "name" to listOf("Parimal", "Karunya", "Rohit", "Shashank", "Hemant"),
//        "gender" to listOf("MALE", "MALE", "MALE", "MALE", "MALE"),
//        "marks" to listOf(98, 89, 87, 78, 99)
//    )
//    println(df)
                // method-3
//    val df = dataFrameOf("name", "gender", "marks")(
//        "Parimal", "MALE", 98,
//        "Karunya", "MALE", 89,
//        "Rohit", "MALE", 87,
//        "Shashank", "MALE", 78,
//        "Hemant", "MALE", 99
//    )
//    println("Dataframe is")
//    println(df)

                // examples and exercises.
    // creating dataframe of tables from 1 to 10.
//    val dfTable = dataFrameOf(1 .. 10) { x -> (1 .. 10).map { x * it }}
//    println("Dataframe of tables from 1 to 10 is as follows.")
//    println(dfTable)

    // creating dataframe of even numbers from 1 to 100.
//    val dfEven = dataFrameOf(0 .. 9) { x ->
//        (x * 10 + 1 .. (x + 1) * 10).filter{ it % 2 == 0 }
//    }
//    println("Dataframe of even numbers from 1 to 100 is as follows.")
//    println(dfEven)

}
