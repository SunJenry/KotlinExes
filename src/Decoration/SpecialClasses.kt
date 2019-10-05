package Decoration

import kotlin.test.todo

object MobyDickWhale {
    val author: String = "Herman Melville"

    fun jump() {

    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

sealed class Seal

class SeaLion : Seal()

class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when (seal) {
        is SeaLion -> "SeaLion"
        is Walrus -> "Walrus"
    }
}