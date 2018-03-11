package com.sada.learning.workshop5

data class Time(val hours: Int, val mins: Int) {

    operator fun plus(time: Time): Time {
        val minutes = this.mins + time.mins
        val hoursInMinutes = minutes / 60
        val remainingMinutes = minutes % 60
        val hours = this.hours + time.hours + hoursInMinutes
        return Time(hours, remainingMinutes)
    }
}

operator fun StringBuilder.plus(stringBuilder: StringBuilder) {
    //add each string of the second stringBuilder to the current instance
    stringBuilder.forEach { this.append(it) }
}
fun main(args: Array<String>) {

    val newTime = Time(10, 40) + Time(1, 40)
    println(newTime)

    val sb1 = StringBuilder("Hello")
    val sb2 = StringBuilder(" World")
    sb2.append("!")
    sb1.plus(sb2)

    println(sb1)
}