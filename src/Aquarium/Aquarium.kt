package Aquarium

open class Aquarium(var length: Int = 100, var width: Int = 200, var height: Int = 100) : Any() {

//    var width: Int = 20
//    var height: Int = 20
//    var length: Int = 20

    constructor(numberOfFish: Int) : this() {
        val water = numberOfFish * 2000
        val tank = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }

    internal fun buildAquarium(): Aquarium = Aquarium()

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * height)
        }

    fun volume(): Int = width * height * length / 1000

    open var water = volume * 0.9


}

class TowerTank() : Aquarium() {
    override var water = volume * 0.8

    override var volume: Int
        get() = (width * height * length / (1000 * Math.PI)).toInt()
        set(value) {
            height = value * 1000 / (width * length)
        }
}