import kotlinx.coroutines.*

const val THREE_SECOND = 3000L
const val TWO_SECOND = 3000L

suspend fun sum(valueA: Int, valueB: Int): Int {
    delay(THREE_SECOND)
    return valueA + valueB
}

suspend fun multiple(valueA: Int, valueB: Int): Int {
    delay(TWO_SECOND)
    return valueA * valueB
}

fun main() = runBlocking {

    println("Counting...")

    val resultSum = async { sum(10, 10) }
    val resultMultiple = async { multiple(20, 20) }

    println("Result sum: ${resultSum.await()}")
    println("Result multiple: ${resultMultiple.await()}")
}