package com.bank.lesson1_task3

fun main() {
    // год не меняем
    val year = 1961

    // час и минуты, взлёт
    var hour = 9
    var minute = 7

    // вывод года и времени взлёта
    println(year)
    println(hour)
    println(minute)

    // меняем значения на время посадки
    hour = 10
    minute = 55

    // выводим время посадки в формате часы:минуты
    print(hour)
    print(":")
    println(minute)
}

