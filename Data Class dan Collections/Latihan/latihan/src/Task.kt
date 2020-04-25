const val TYPE = "type"
const val MAX_SPEED = "maxSpeed"
const val MAX_TANK = "maxTank"

fun main() {

    val vehicle = mapOf<String, String>(
            TYPE to "Motorcycle",
            MAX_SPEED to "230Km/s",
            MAX_TANK to "10Ltr"
    )

    val type = vehicle.getValue(TYPE)
    val maxSpeed = vehicle.getValue(MAX_SPEED)
    val maxTank = vehicle.getValue(MAX_TANK)

    println("Vehicle")
    println("Type: $type")
    println("Maximal Speed: $maxSpeed")
    println("Maximal Tank: $maxTank")

}