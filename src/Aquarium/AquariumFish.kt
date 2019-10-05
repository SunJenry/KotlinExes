package Aquarium

abstract class AquariumFish {
    abstract val color: String
}


class Shark : AquariumFish(),FishAction {
    override fun eat() {
        println("Fish")
    }

    override val color: String = "grey"

}

class Plecostomus : AquariumFish(),FishAction {
    override fun eat() {
        println("Seed")
    }

    override val color: String = "gold"
}

interface FishAction{
    fun eat()
}