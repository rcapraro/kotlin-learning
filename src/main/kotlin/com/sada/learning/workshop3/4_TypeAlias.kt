package com.sada.learning.workshop3

typealias Name = String
typealias EmailData = String

data class Employee(val name: Name, val email: EmailData) {
    fun printName(string: String){

    }
}

fun main(args: Array<String>) {

    val employee = Employee("Richard", "richard@domain.com")
    employee.printName("A String")

}