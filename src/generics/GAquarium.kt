package generics

open class WaterSupply(var needProcess: Boolean) {

}

class TapWater : WaterSupply(true) {
    fun addChemicalCleans() {
        needProcess = false
    }
}

class FishStoreWater : WaterSupply(false) {

}

class LakeWater : WaterSupply(true) {
    fun filter() {
        needProcess = false
    }
}

class Aquarium<out T : WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needProcess) {
            cleaner.clean(waterSupply)
        }

        println("adding water from $waterSupply")
    }
}

inline fun <reified R : WaterSupply> Aquarium<*>.hasWaterSupplyOfType(): Boolean {
    return waterSupply is R
}

interface Cleaner<in T : WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleans()
    }
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

fun genericExample() {

    val tapWaterCleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleans()
    aquarium.addWater(tapWaterCleaner)
    addItemTo(aquarium)

    val aquarium1 = Aquarium(LakeWater())
    aquarium1.waterSupply.filter()

}

fun isWaterClean(aquarium: Aquarium<WaterSupply>) {
    println("${aquarium.waterSupply.needProcess}")
}

fun <T : WaterSupply> isWaterClean2(aquarium: Aquarium<T>) {

}