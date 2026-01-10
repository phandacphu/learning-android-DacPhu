data class Student (
    val id: Int,
    val name: String,
    var score: Int = 0
)

fun main(){
    val student = Student(1,"Hieu").apply{
        score = 10
    }

    println("Student: "  + "id." + student.id + " name." + student.name + " score." + student.score)
}