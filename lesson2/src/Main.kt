//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun bai1(){
    val numbers: List<Int> = listOf( 3,6,4,7,3,2,2,0 )
    val result = numbers
        .filter{ it % 2 == 0 }
        .map{it * 2}
    println(result)
}

fun bai2(){
    val names: List<String?> = listOf( "an" , "trung","",null)
    val result = names
        .filter{ it != null && it.length > 0}
        .map{it?.uppercase()}
    println(result)
}



fun main() {
    bai1()
    bai2()
}