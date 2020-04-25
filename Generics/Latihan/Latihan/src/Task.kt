// Coming Soon
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    println(stringResult)
    println(intResult)
}

fun <T> getResult(args: T): Int {
    return when(args){
        is Int -> args * 5
        is String -> args.length
        else -> 0
    }
}