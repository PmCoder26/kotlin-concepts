package data_science

import org.jetbrains.kotlinx.dataframe.DataFrame
import org.jetbrains.kotlinx.dataframe.api.*
import org.jetbrains.kotlinx.dataframe.annotations.DataSchema
import org.jetbrains.kotlinx.dataframe.api.columnOf
import org.jetbrains.kotlinx.dataframe.api.dataFrameOf
import org.jetbrains.kotlinx.dataframe.api.next
import org.jetbrains.kotlinx.dataframe.api.prev
import org.jetbrains.kotlinx.dataframe.get
import org.jetbrains.kotlinx.dataframe.io.readCsv
import org.jetbrains.kotlinx.dataframe.io.toHtml
import java.io.File
import java.lang.Class


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

//    var df = DataFrame.readCsv("src/main/kotlin/data_science/data.csv")
    // getting the column names.
//    println("Column names: ${df.columnNames()}")
//    // getting the dimensions of df.
//    println("Dimensions(row x column) are: (${df.rowsCount()} x ${df.columnsCount()})")
//    // getting the data-types of columns.
//    val columnTypes = df.columnNames().map { colName ->
//        Pair(colName, df[colName].type())
//    }
//    println("Column data-types: $columnTypes")
    // getting the previous and next row of the current row.
//    val currRow = df[3]
//    println("Previous row of currRow: ${currRow.prev()}")
//    println("Next row of currRow: ${currRow.next()}")


            // Other basic Dataframe operations
//    var df = DataFrame.readCsv("src/main/kotlin/data_science/data.csv")
    // head operation (accessing first n rows)
//    println(df.head(7))     // default: 5

    // tail operation (accessing last n rows)
//    println(df.tail(7))     // default: 5

    // describe operation for summary statistics.
//    println(df.describe())    // for all columns.
//    println(df.describe("Age", "BMI", "Glucose"))     // for specific columns.

    // iterating over all rows of df.
//    for(row in df) {
//        println(row["Age"])
//    }

    // filtering operation.
//    val result = df.filter { "Age"<Int>() % 2 == 0 }
//    println("DF with ages of odd numbers is as follows")
//    println(result)
//    val result = df.filter { ("Glucose"<Int>() > 80).and("Insulin"<Int>() > 2.0) }
//    println("DF with glucose > 80 and Insulin > 2.0 is as follows")
//    println(result)

    // selecting the columns from the dataframe.
//    println(df["Age", "Glucose"])

//    var df = dataFrameOf("Name", "Age", "City", "Gender")(
//        "Alice", 25, "New York", "F",
//        "Bob", 30, "Delhi", "M",
//        "Charlie", 28, "Paris", "M"
//    )
    // dropping the rows: Removes all rows that satisfy row condition (not inPlace operation)
//    val dfDropped = df.drop { it["Name"] == "Bob" }
//    println("Rows don't contain the name as Bob is")
//    println(dfDropped)

    // removing the columns:
//    val dfRemoved = df.remove("Age", "Gender")
//    println("Original df is:")
//    println(df)
//    println("Removed df is: ")
//    println(dfRemoved)

    // sorting the rows.
//    val dfSorted = df.sortBy("Age")   // Returns DataFrame with rows sorted by one or several columns.
//    val dfSorted = df.sortByDesc("Age")   // Returns DataFrame sorted by one or several columns in descending order.
//    println("Sorted df is: ")
//    println(dfSorted)

    // shuffle the rows: Returns DataFrame with randomly reordered rows.
//    val dfShuffled = df.shuffle()
//    println("Shuffled df is: ")
//    println(dfShuffled)

    // reversing the rows' order: returns DataFrame with rows in reversed order.
//    val dfReversed = df.reverse()
//    println("Reversed df is: ")
//    println(dfReversed)

    val df = dataFrameOf("firstName", "lastName", "age", "city", "weight", "isHappy")(
        "Alice", "Cooper", 15, "London", 54, true,
        "Bob", "Dylan", 45, "Dubai", 87, true,
        "Charlie", "Daniels", 20, "Moscow", null, false,
        "Charlie", "Chaplin", 40, "Milan", null, true,
        "Bob", "Marley", 30, "Tokyo", 68, true,
        "Alice", "Wolf", 20, null, 55, false,
        "Charlie", "Byrd", 30, "Moscow", 90, true
    )
    // grouping the dataframe.
    println("Grouped by firstName is: ")
    println()
    val dfGrouped = df.groupBy("firstName")
    dfGrouped.forEach { it ->
        println("***********************************************************")
        println("Group is: ${it.key["firstName"]}")
        println(it.group)
        println("***********************************************************")
    }






}
