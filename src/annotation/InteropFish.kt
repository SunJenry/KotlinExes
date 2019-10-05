@file:JvmName("InteropFish1")

package annotation

import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.findAnnotation

class InteropFish {
    companion object {
        @JvmStatic
        fun interop() {

        }
    }
}

fun main(args: Array<String>) {
    reflections()
}

@ImAPlant
class Plant {
    fun trim() {}
    fun fertilize() {}

    @get:OnGet
    val isGlowing: Boolean = true

    @set:OnSet
    var needFoods: Boolean = true
}

annotation class ImAPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

fun reflections() {
    val kClass = Plant::class
    for (method in kClass.declaredMemberFunctions) {
        println(method.name)
    }

    for (annotation in kClass.annotations) {
        println(annotation.annotationClass)
    }

    val findAnnotation = kClass.findAnnotation<ImAPlant>()
    findAnnotation?.apply {
        println("Found a plant annotation")
    }
}