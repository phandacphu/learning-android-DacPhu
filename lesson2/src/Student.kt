data class Student(
    var id: Int,
    val name: String,
    val score: Int
)

fun cau1a(students: List<Student>){
    students.forEach { student ->
        println(student)
    }
}

fun cau1b(students: List<Student>){
    students.forEach { student ->
        println(student.name)
    }
}

fun cau1c(students: List<Student>){
    val result = students
        .filter { it.score >=5 }
        .map { it.name }
    println(result)
}

fun cau2(students: List<Student>){
    println(
        if (students.any { it.score < 5 })
            "co"
        else
            "ko"
    )
}

fun cau3(students: List<Student>){
    println(
        if (students.all { it.score > 5 })
            "deu dau"
        else
            "co sinh vien rot"
    )
}

fun cau4(students: List<Student>){
    val result = students.find { it.id == 2 }
    println(result?.name ?: "no student")
}

fun cau5(newstudents: Map<Int, Student>){
    println(newstudents[3] ?: "no student")
}

fun main(){
    val students: List<Student> = listOf(Student(1,"an", 8),
                                         Student(2,"binh", 4),
                                         Student(3,"chi", 6)
                                        )

    val newstudent: Map<Int, Student> = mapOf(1 to Student(1,"an", 8),
                                              2 to Student(2,"binh", 4),
                                              3 to Student(3,"chi", 6)
                                        )



//    cau1a(students)
//    cau1b(students)
//    cau1c(students)
//    cau2(students)
//    cau3(students)
//    cau4(students)
    cau5(newstudent)

}