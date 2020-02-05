package main.kotlin

fun main(args: Array<String>) {
sample_4()
}

private fun sample_4() {
    val number1 = 10
    val number2=5
    val (multiply,divide)=multiplyAndDivide(number1 , number2);
    println("$number1 * $number2 =$multiply")
    println("$number1 / $number2 =$divide")
}

private fun multiplyAndDivide(number1: Int, number2: Int): Pair<Int,Int> {
return Pair(number1*number2 , number1/number2)
}
