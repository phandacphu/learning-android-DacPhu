//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun baib1(){
    val age: Int = 19
    println(if (age >= 18) "da du tuoi" else "chua du tuoi")
}

<<<<<<< HEAD
fun baib2(){
    val name: String? = "an"
    val length = name?.length
    println(length)
}

fun baib3(){
    val email: String? = null
    val length = email?.length ?: 0
    println(length)
}

fun baib4(){
    val score: Int = 2
    val result = if ( score>= 5) "dau" else "rot"
    println(result)
}

fun baib5(){
    val phone: String? = "0123456789"
    val length = phone?.length ?: 0
    println(if (length >= 10) "so hop le" else "so ko hop le")
}

fun baic1(){
    val age: Int = 19
    println(if(age<12) "tre em" else if(age<=12 && age>=17) "thieu nien" else "nguoi lon")
}

fun baic2(){
    val username: String? = null
    if (username != null) {
        print(username)
    } else{
        print("khach")
=======
    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
>>>>>>> f635d7c87ad931284d08f90b86cb90bbd99e5025
    }
}

fun printLength(text: String?) {
    val length = text?.length ?: 0
    print(length)
}

fun main() {
    baib1()
    baib2()
    baib3()
    baib4()
    baib5()
    baic1()
    baic2()
    printLength("null")
}