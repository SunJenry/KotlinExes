package Decoration

fun String.hasSpaces() = find { it == ' ' } != null

fun extensionsExample() {
    val hasSpaces = "Do you like it?".hasSpaces()
    println(hasSpaces)
}

class AquariumPlant(val color: String, private val size: Int)

fun AquariumPlant.isRed() = color == "Red"

val AquariumPlant.isGreen: Boolean get() = color == "Green"

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

fun nullableExample() {
    val plant: AquariumPlant? = null
    plant.pull()
}

