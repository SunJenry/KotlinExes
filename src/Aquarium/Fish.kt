package Aquarium

class Fish(val friendly: Boolean = true, volumeNeed: Int = 2000) {
    val size: Int

    init {
        println("first init block")
    }

    init {
        if (friendly) {
            size = volumeNeed
        } else {
            size = volumeNeed * 2
        }
    }


    constructor() : this(true, 100) {
        println("Run")
    }
}

fun makeDefaultFish() = Fish(true, 50)

fun fishExample() {
    val fish = Fish(true, 20)
    println(fish.toString())
}