package com.kotlinplayground.basics

fun main(){
//    val은 불변, var은 가변
    val name : String = "nareun"
    println(name)

    var age :Int = 26
    println(age)
    age = 27
    println(age)

// Kotlin은 원시타입과 래퍼타입의 구분이 없다.
    val salary = 30000L// val salary : Long = 30000L -> 코틀린은 타입추론을 한다.
    println(salary)

    val course = "Kotlin Spring"
    //String template Syntax and String interpolation(보간법)
    println("course : $course and the course length is ${course.length}")

    val multiLine = "ABC \n DEF"
    println(multiLine)

    val multiLine1 = """
             ABC
            DEF
    """.trimIndent()

    println(multiLine1)
}