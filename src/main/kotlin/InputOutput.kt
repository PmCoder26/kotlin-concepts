

fun main() {

    println("Employee Diary!!!")

    val firstName: String
    val lastName: String
    val salary: Int
    val department: String

    print("Enter your first name: ")
    firstName = readln()

    print("Enter your last name: ")
    lastName = readln()

    print("Enter your salary: ")
    salary = readln().toInt()

    print("Enter your work department: ")
    department = readln()

    println("*********************Your employee details*********************")
    println("First Name: $firstName")
    println("Last Name: $lastName")
    println("Salary: $salary")
    println("Department: $department")




}