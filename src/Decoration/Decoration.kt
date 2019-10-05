package Decoration

fun main(args: Array<String>) {
    makeDecoration()
}

fun makeDecoration() {
    val decoraion = Decoraion("granite")
    println(decoraion)

    val slate = Decoraion("slate")

    val slate1 = Decoraion("slate")

    println(decoraion == slate)

    println(slate == slate1)

    val slateCopy = slate1.copy()

    val (rocks: String) = slateCopy

    println(rocks)
}

data class Decoraion(val rocks: String) {

}