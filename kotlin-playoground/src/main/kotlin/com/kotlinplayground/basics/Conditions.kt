package com.kotlinplayground.basics

fun main() {
    //if-else
    //when

    var name = "seongho"
    name = "nareun"
    val result = if (name.length == 6) {
        println("Name is 6 Chars")
        name.length
    } else {
        println("Name is not 6 Chars")
        name// name을 리턴
    }

    //Kotlin.unit은 no value라는 의미
    println("result : $result")

    var position = 1
    position = 4

//    val medal = if (position == 1) {
//        "GOLD"
//    } else if (position == 2) {
//        "SILVER"
//    } else if (position == 3) {
//        "BRONZE"
//    } else {
//        "NO MEDAL"
//    }
    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }



    println(medal)
}