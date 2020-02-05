package main.kotlin

fun main(args: Array<String>) {
    //sample_1()
    //sample_2()
    sample_3()
}

private fun sample_3() {
    for (i in 1..10) println("${(i.toFloat() / 10.0f)}")


}
private fun sample_2() {
    println("sample_2() :")
    val y = 10 downTo 0 step 1

    for (x in y) {
        when (x) {
            1, 9 -> println("${x} in")
            in 3..7 -> println("${x} in")
            else -> {
                println("${x} out")
            }
        }
    }
}

private fun sample_1() {
    println("sample_1() :")

    val y = 10 downTo 0 step 1

    for (x in y) {
        when (x) {
            0 -> println("${x} in")
            in 2..8 -> println("${x} in")
            10 -> println("${x} in")
            else -> {
                println("${x} out")
            }
        }
    }
}