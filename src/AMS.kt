import java.util.*

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//    println("Hello ${args[0]}!")
//    dayOfWeek()
//
//    val temp = 10
//    val isHot = if (temp>50) true else false
//    println(isHot)
//
//    val message = "You are ${ if (temp>50) "fired" else "safe"} "
//    println(message)
    feedFish()
}

fun dayOfWeek() {
    val get = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(
        when (get) {
            1 -> "Sun"
            2 -> "Mon"
            3 -> "Tue"
            4 -> "Wed"
            else -> "Random"
        }
    )
}


fun feedFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    swim("Slow")

    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)

    repeat(3) {
        println("Repeat ${it}")
    }

    if (shouldChangeWater(day)) {
        println("Change the water today")
    }

    eagerExample()
}

fun eagerExample() {
    val decorations = listOf<String>("rock", "pagoda", "plastic", "aligo")
    val eager = decorations.filter { it[0] == 'p' }
    println(eager)

    val filter = decorations.asSequence().filter { it[0] == 'p' }
    println(filter)
    println(filter.toList())

    val layzyMap = decorations.asSequence().map {
        println("map:$it")
        it
    }

    println(layzyMap)
    println("First:${layzyMap.first()}")
    println("All:${layzyMap.toList()}")

    waterFilter(500)
}

fun shouldChangeWater(day: String, temp: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temp > 30 -> true
        dirty > 30 -> true
        day == "Sun" -> true
        else -> false
    }
}

fun isTooHot(temp: Int): Boolean = temp > 30

fun swim(speed: String = "fast") {
    println("swim $speed")
}

fun randomDay(): String {
    val week = listOf<String>("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    var food = "Fasting"
    return when (day) {
        "Mon", "Tue" -> "Flakes"
        else -> "Other"
    }
}

var dirty = 20
val waterFilter: (Int) -> Int = { dirty: Int -> dirty / 2 }

fun updateDirty(dirty: Int,operation:(Int) ->Int):Int{
    return operation(dirty)
}