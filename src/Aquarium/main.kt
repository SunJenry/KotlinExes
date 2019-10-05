package Aquarium

fun main(args: Array<String>) {
    buildAquarium()

    makeFish()
}

fun buildAquarium() {
    val aquarium = Aquarium()
    println(
        "Length:${aquarium.length} " +
                "Width:${aquarium.width} " +
                "Height:${aquarium.height} "
    )

    aquarium.height = 80

    println(
        "Length:${aquarium.length} " +
                "Width:${aquarium.width} " +
                "Height:${aquarium.height} "
    )

    aquarium.buildAquarium()

    println("Volume:${aquarium.volume}")

    val aquarium1 = Aquarium(100, 20, 40)



}

fun makeFish() {
    val shark = Shark()
    val plecostomus = Plecostomus()

    println("Shark:${shark.color} Plec:${plecostomus.color}")
}
