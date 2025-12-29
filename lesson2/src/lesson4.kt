fun post1() {
    val name: String? = "phu"
    println(if(name != null) "xin chao $name"  else "xin chao khach" )
}

fun post2() {
    val app: Boolean = true
    println(if(app == true) "ban da dang nhap" else "vui long dang nhap")
}

fun checkLogin(name: String?, pass: String?): String {
    val userName: String = "12"
    val passWorker: String = "22"
    if(name != null && pass != null  ) {
        return "chua co te"
    }else{
        return "oke"
    }
}

fun main(){
//    post1()
//    post2()
    checkLogin(null,null)
}