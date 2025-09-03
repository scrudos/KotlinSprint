package lesson2_task1

fun main() {
    val mark1 = 3.0
    val mark2 = 4.0
    val mark3 = 3.0
    val mark4 = 5.0

    val studentCount = 4

    val avg = average(mark1, mark2, mark3, mark4, studentCount)

    println(String.format("%.2f", avg))
}

fun average(m1: Double, m2: Double, m3: Double, m4: Double, count: Int): Double {
    return (m1 + m2 + m3 + m4) / count
}
