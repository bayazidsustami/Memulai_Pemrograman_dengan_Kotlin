interface IFly {
    fun fly()
    val numberOfWings: Int
}

class Bird(override val numberOfWings: Int) : IFly {
    override fun fly() {
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }
}

class Eagle(override val numberOfWings: Int): IFly{
    override fun fly() {
        println("Eagle wings $numberOfWings")
    }
}


fun main() {
    val bird = Bird(2)
    val eagle = Eagle(12)
    eagle.fly()
    bird.fly()
}