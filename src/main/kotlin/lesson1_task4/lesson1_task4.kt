package com.bank.lesson1_task4

fun main() {
    val secondsTotal = 6480

    val hours = secondsTotal / 3600
    val minutes = (secondsTotal % 3600) / 60
    val seconds = secondsTotal % 60

    val timeFormatted = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println(timeFormatted)
}
