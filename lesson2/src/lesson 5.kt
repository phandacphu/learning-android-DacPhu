/*enum class StatusLogin (val message: String) {
    LOGIN_EMPTY("chua co thong tin"),
    LOGIN_ERROR("dang nhap that bai!"),
    LOGIN_SUCCESS("dang nhap thanh cong")
}

fun check(name:String?, pass:String?):StatusLogin{
    val username = "phandacphu"
    val password = "123456"
    if (name.isNullOrBlank() || pass.isNullOrBlank()){
        return StatusLogin.LOGIN_EMPTY
    }
    if (username != name || password != pass){
        return StatusLogin.LOGIN_ERROR
    }
    return StatusLogin.LOGIN_SUCCESS
}

fun main(){
    print("UserName: ")
    val name = readLine()?.trim()
    print("Passwork: ")
    val passwork = readLine()?.trim()

    val message = when (check(name, passwork)) {
        StatusLogin.LOGIN_EMPTY -> StatusLogin.LOGIN_EMPTY.message
        StatusLogin.LOGIN_ERROR -> StatusLogin.LOGIN_ERROR.message
        StatusLogin.LOGIN_SUCCESS -> StatusLogin.LOGIN_SUCCESS.message
    }
    println(message)
}

enum class StatusRegister(val messager: String){
    REGISTER_SUCCESS("dang ki thanh cong"),
    REGISTER_ERROR("dang ki that bai")
}

fun checkk(email: String?, pass: String?, confirm: String?): StatusRegister{
    val emaill = "phandacphu@gmail.com"
    val passwordd = "123456"
    val confirmm = "123456"

    if(email.isNullOrBlank() || pass.isNullOrBlank() || confirm.isNullOrBlank() || pass != confirm || emaill == email ){
        return StatusRegister.REGISTER_ERROR
    }else
        return StatusRegister.REGISTER_SUCCESS
}

fun main(){
    print("email: ")
    val email = readLine()?.trim()
    print("password: ")
    val pass = readLine()?.trim()
    print("confirmPassword: ")
    val confirm = readLine()?.trim()

    val message = when (checkk(email,pass,confirm)) {
        StatusRegister.REGISTER_SUCCESS -> StatusRegister.REGISTER_SUCCESS.messager
        StatusRegister.REGISTER_ERROR -> StatusRegister.REGISTER_ERROR.messager
    }
    println(message)

}*/

/*
data class StudentA(val id: Int, val name: String)

fun checkList(list: List<StudentA> ): StatusList {
    if (list.size == 0) return StatusList.EMPTY
    return StatusList.HAS_DATA
}

fun main(){
    val ds: List<StudentA> = listOf(StudentA(1,"phu"))

    val messager: String = when ( checkList(ds)) {
        StatusList.EMPTY -> StatusList.EMPTY.messager
        StatusList.HAS_DATA -> StatusList.HAS_DATA.messager
    }
    print(messager)
}*/

/*enum class StatusDeatail(val messsage: String) {
    DEATAIL_FOUND("tim thay sinh vien trong danh sach"),
    DEATAIL_NOT_FOUND("ko tim thay sinh vien")
}
data class Studen(val id: Int, val name : String)

fun checkList(list: List<Studen> , namee: String?): StatusDeatail {
    for (item in list) {
        if(item.name == namee){
            return StatusDeatail.DEATAIL_FOUND
        }
    }
    return StatusDeatail.DEATAIL_NOT_FOUND

}


fun main(){
    print("nhap ten: ")
    val namee= readLine()?.trim()

    val ds: List<Studen> = listOf(Studen(1,"phu"),
                                  Studen(2,"huy"),
                                  Studen(3,"quan"),
                                 )

    val message: String = when (checkList(ds,namee)){
        StatusDeatail.DEATAIL_FOUND -> StatusDeatail.DEATAIL_FOUND.messsage
        StatusDeatail.DEATAIL_NOT_FOUND -> StatusDeatail.DEATAIL_NOT_FOUND.messsage
    }
    println(message)
}*/

enum class StatusResult(val message: String?) {
    RESULT_FASS("qua mon"),
    RESULT_FAIL("rot"),
    RESULT_INVALID("ko hop le")
}
fun check(score: Int): StatusResult {
    if ( score > 0 && score < 5 ) {
        return StatusResult.RESULT_FAIL
    }else if (score >= 5 && score < 10 ) {
        return StatusResult.RESULT_FASS
    }else{
        return StatusResult.RESULT_INVALID
    }
}

fun main(){
    print("nhap diem: ")
    val scores= readLine()!!.trim().toInt()

    val messager = when (check(scores)){
        StatusResult.RESULT_FAIL -> StatusResult.RESULT_FAIL.message
        StatusResult.RESULT_FASS -> StatusResult.RESULT_FASS.message
        StatusResult.RESULT_INVALID -> StatusResult.RESULT_INVALID.message
    }
}

