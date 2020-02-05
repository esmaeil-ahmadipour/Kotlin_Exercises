package main.kotlin

fun main(args: Array<String>) {
     val Love = true && true

     val bigString = """
|The Life Is Simple
|Like This 3 Lines ,
|The Love is ${Love}
""".trimMargin()

    println("${bigString}")

}