import kotlinx.serialization.Serializable

@Serializable
data class Student (
    val id: Int,
    val name: String,
    val age: Int,
    val gender: String
)
