package Aquarium5

data class Fish(var name: String)

fun main(args: Array<String>) {
    fishExe()
}

fun fishExe() {
    val fish = Fish("splashy")

    //without inline an object is created every call to myWith
    myWith(fish.name) {
        println(this.capitalize())
    }
    //with inline no object is created,and lambda body is inline here
    fish.name.capitalize()

    println(fish)

//    with()

    println(fish.run { name })

    println(fish.apply { })

    println(fish.let { it.name.capitalize() }
        .let { "$it Fish" }
        .let { it.length }
        .let { it + 3 })
}

inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}
