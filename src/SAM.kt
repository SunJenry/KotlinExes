//SAM single abstract method
interface Runnable {
    fun run()
}

interface Callable<T> {
    fun call(): T
}

fun example() {
    val runnable = object : Runnable {
        override fun run() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            println("Run")
        }
    }

    JavaRun.runNow(runnable)
}