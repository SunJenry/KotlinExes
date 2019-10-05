package Aquarium

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Pleco()
    println("Fish has Color ${pleco.color}")
    pleco.eat()
}

interface FishAction1 {
    fun eat()
}

interface FishColor1 {
    val color: String
}

class Pleco(fishColor: FishColor1 = GoldColor) :
    FishAction1 by PrintingFishAction("Seed"),
    FishColor1 by fishColor

object GoldColor : FishColor1 {
    override val color: String
        get() = "Gold"
}

object RedColor : FishColor1 {
    override val color: String
        get() = "Red"

}

class PrintingFishAction(val food: String) : FishAction1 {
    override fun eat() {
        println(food)
    }

}