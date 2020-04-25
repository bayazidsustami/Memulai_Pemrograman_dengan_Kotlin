data class DataUser(val name : String, val age : Int)

fun main() {
    val dataUser = DataUser("aba", 23)
    println("My Name is ${dataUser.name}, age ${dataUser.age}")
}