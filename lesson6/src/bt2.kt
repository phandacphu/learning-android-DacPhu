fun check(userName: String?):String{

    return userName?.let{
        return userName.length.toString()
    }?: "USERNAME_EMPTY"
}

fun main(){
    print("Nhap userName: ")
    val userName = readLine()?.trim()

    val check = check(userName)
    print("Ket qua ${check} ")
}