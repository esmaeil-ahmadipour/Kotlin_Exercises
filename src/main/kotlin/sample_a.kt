package main.kotlin

fun main(args: Array<String>) {
    samplePair()
    sampleTriple()

}

private fun samplePair() {
    val myVariablePair: Pair<Int, Int> = Pair("5".toInt(), "7".toInt())

    println("myVariablePair = ${myVariablePair}")

    println(myVariablePair.first + myVariablePair.second)

    val (_, c) = myVariablePair

    println(c)

}

private fun sampleTriple() {
    val myVariableTriple: Triple<Int, Int, Int> = Triple("5".toInt(), "7".toInt(), "9".toInt())

    println("myVariableTriple = ${myVariableTriple}")

    println(myVariableTriple.first + myVariableTriple.second + myVariableTriple.third)

    val (a, _, c) = myVariableTriple

    println(a + c)
}