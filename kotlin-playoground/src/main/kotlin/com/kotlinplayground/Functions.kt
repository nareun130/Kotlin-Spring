package com.kotlinplayground

fun addtion(x: Int, y: Int): Int {

    return x + y
}

//타입 추론
fun addtion_approch1(x: Int, y: Int) = x + y

fun printName(name: String) : Unit{ // Unit은 아무것도 리턴 x
    println("Name is :$name")
}

fun main() {

    val unit = printName("Nareun")
    println("unit is $unit")
    printName("Nareun")
    val result = addtion(1, 2)
    println("Result is $result")

    val result1 = addtion_approch1(1, 2)
    println("Result is $result1")
}