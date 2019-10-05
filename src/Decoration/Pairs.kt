package Decoration

fun main(args: Array<String>) {
    val testList = listOf<Int>(11, 12, 13, 14, 15, 16, 17)

    println(reverseList(testList))
    println(testList.reversed())

    val sum = listOf<Int>(1, 3, 5).sum()

    println(listOf<String>("a", "b", "c").sumBy { it.length })
}

fun reverseList(list: List<Int>): List<Int> {
    val mutableListOf = mutableListOf<Int>()
    for (i in list.indices) {
        mutableListOf.add(list[list.size - 1 - i])
    }

    for (i in list.size - 1 downTo 0) {
        mutableListOf.add(list[i])
    }

    return mutableListOf
}