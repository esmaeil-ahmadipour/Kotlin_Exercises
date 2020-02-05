package main.kotlin

fun main(args: Array<String>) {
    //Range 0~5
    var a= 0 .. 5
    println("0 .. 5  ->  ${a}")
    for (i in a ){
        println("Counter  ->  ${i}")
    }

    //Range 0~4
    var b= 0 until 5
    println("0 until 5  ->  ${b}")
    for (i in b ){
        println("Counter  ->  ${i}")
    }

    //Range 5~0
    var c= 5 downTo 0 step 1
    println("5 downTo 0 step 1  ->  ${c}")
    for (i in c ){
        println("Counter  ->  ${i}")
    }

}