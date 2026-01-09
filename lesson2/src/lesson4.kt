/*//bài 1
fun post1() {
    val name: String? = "phu"
    println(if(name != null) "xin chao $name"  else "xin chao khach" )
}

//bài 2
fun post2() {
    val app: Boolean = true
    println(if(app == true) "ban da dang nhap" else "vui long dang nhap")
}

//bài 3
fun checkLogin(name: String?, pass: String?): String {
    val userName: String? = "phandacphu"
    val passWord: String? = "2201"
    if (name == null || pass == null) {
        return "vui long nhap day du thong tin"
    }
    return if (name == userName && pass == passWord) {
        "dang nhap thanh cong"
    } else {
        "sai tai khoan hoac mat khau"
    }
}

//bài 4
fun notification(name: String?, pass: String?): String {
    val userName: String = "phandacphu"
    val passWord: String = "2201"
    return when {
        name.isNullOrEmpty() || pass.isNullOrEmpty() -> "vui long nhap day du thong tin"
        name == userName && pass == passWord -> "đang nhap thanh cong"
        else -> "đang nhap that bai"
    }

}

//bài 5
fun count(name: String, pass: String): String {
    val userName = "phandacphu"
    val passWord = "2201"
    var min = 0
    do {
        if (name == userName && pass == passWord) {
            return "Đăng nhập thành công"
        } else {
            min++
        }
    } while (min < 3)
    return "Bạn đã nhập sai quá 3 lần"
}


data class Lop(
    val name:String,
    val score:Int
)
//bài 6
fun bai6(lops: List<Lop>){
    lops.forEach { lop ->
        println(lop.name)
    }
}

//bài 7
fun bai7(lops: List<Lop>){
    val result = lops
        .filter { it.name != null && it.name.length <= 3 }
    result.forEach { lop ->
        println("dang hoat dong -> ${lop.name}")
    }
}

//bài 8
fun poin(lops: List<Lop>) {
    lops.forEach { lop ->
        val xepLoai = when (lop.score) {
            in 9..10 -> "Xuat sac"
            in 7..8 -> "Gioi"
            in 5..6 -> "Kha"
            in 3..4 -> "Trung binh"
            else -> "dot nat"
        }
        println("${lop.name}: ${lop.score} diem -> Loai $xepLoai")
    }
}

// bài 9
fun bai9(lops: List<Lop>) {
    val result = lops
        .map { it.score }
        .filter { it >= 5 }
        .map { it * 2 }
        .sum()
    println("Tổng điểm sau khi xử lý là:  $result")
    }


data class Oders(
    val ten:String,
    val valua:Int,
    val number: Int
)
//bài 10
fun bai10(oders: List<Oders>) {
    val result = oders
        .map { it.valua * it.number }
    println(result)
}

//bài 11
fun bai11(oders: List<Oders>) {
    val result = oders
        .map{it.valua * 1.1}
    println(result)
}



fun main() {

//bài 1
//    post1()

//bài 2
//    post2()

//bài 3
//    val result = checkLogin("phandacphu", "2201")
//    println(checkLogin("phandacphu","2201"))

//bài 4
//    val result = notification("phandacphu", "2201")
//    println(notification("phandacphu","2201"))

//bài 5
//    val result = count("phandacphu", "2201")
//    println(result)


    val lops: List<Lop> = listOf(
        Lop("phu"  , 9),
        Lop("quan" , 8),
        Lop("thuan", 7),
        Lop("hung" , 6),
        Lop("hieu" , 5),
        Lop("thanh", 4),
        Lop("tai"  , 3)
    )
//bài 6
//    bai6(lops)

//bài 7
//    bai7(lops)

//bài 8
//    poin(lops)

//bài 9
//   bai9(lops)
    val oders: List<Oders> = listOf(
        Oders("cf den"  , 8, 20),
        Oders("cf sua" , 6,40),
        Oders("tra sua" , 5,60)
    )

//bài 10
//    bai10(oders)

//bài 11
//    bai11(oders)


}*/