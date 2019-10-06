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

    //why without inline it takes more cost,it creates object every time
    myWith(fish.name, object : Function1<String, Unit> {
        override fun invoke(name: String) {
            name.capitalize()
        }
    })
    //with inline no object is created,and lambda body is inline here
    fish.name.capitalize()

    println(fish)

//    with()

    //return name or the result of the run block
    println(fish.run { name })

    //return the fish Object after the lambda
    println(fish.apply { })

    //let return a copy of the object
    println(fish.let { it.name.capitalize() }
        .let { "$it Fish" }
        .let { it.length }
        .let { it + 3 })
}

inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}
