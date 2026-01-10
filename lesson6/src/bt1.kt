enum class StatusLogin(val messager: String?){
    LOGIN_EMPTY("điền chưa đủ thông tin"),
    LOGIN_ERROR("đăng nhập ko thành công"),
    LOGIN_SUCCESS("đăng nhập thành công"),
}

fun login(username:String?, password:String?, onResult:(StatusLogin)->Unit){
    username?.let {
        password?.let {
            val status = when{
                username.isEmpty() || password.isEmpty() -> StatusLogin.LOGIN_EMPTY
                username == "admin" || password == "123" -> StatusLogin.LOGIN_SUCCESS
                else -> StatusLogin.LOGIN_ERROR
            }
            onResult(status)
            return
        }
    }
}

fun main(){
    login("admin", "123"){ status ->
        println(status.messager)
    }

}