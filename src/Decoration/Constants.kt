package Decoration

const val rocks = 3

object Constants {
    const val CONSTANT = "object constant"
}

val foo = Constants.CONSTANT

class MyClass {
    companion object {
        const val CONSTANT_COMPANION_OBJECT = "object constant"
    }
}