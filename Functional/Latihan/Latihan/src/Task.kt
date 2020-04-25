const val FIRST = "first"
const val LAST = "last"

fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text[FIRST]
    val lastChar = text[LAST]


    println("First letter is $firstChar and $lastChar for second letter")

}

fun String.getFirstAndLast(): Map<String, Char>{
    return mapOf(
            FIRST to this.first(),
            LAST to this.last()
    )
}