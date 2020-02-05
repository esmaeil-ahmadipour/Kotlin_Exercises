package main.kotlin

fun main(args: Array<String>) {
    val numberOne=5
    val numberTwo=10
    println(sumAction(numberOne, numberTwo))
    println(multiplyAction(numberOne, numberTwo))
    println(minNumber(numberOne, numberTwo))
    println(maxNumber(numberOne, numberTwo))
    val counters = 5 downTo 0
    println(counters.first)

}

private fun maxNumber(numberOne: Int, numberTwo: Int): String {
    if (numberOne<numberTwo)
        return "maxNumber is $numberTwo" else
        return "maxNumber is $numberOne"
}

private fun minNumber(numberOne: Int, numberTwo: Int): String {
    if (numberOne>numberTwo)
        return "minNumber is $numberTwo" else
        return "minNumber is $numberOne"
}

private fun sumAction(numberOne: Int, numberTwo: Int): Int {
return numberOne+numberTwo
}

private fun multiplyAction(numberOne: Int, numberTwo: Int) :Any {
return  numberOne*numberTwo
}



