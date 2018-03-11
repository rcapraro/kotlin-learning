package com.sada.learning.workshop3

import java.util.*

interface Human {
    fun dosomething(): String
}

open class Person(var name: String, var birthYear: Int) : Human {

    override fun dosomething(): String {
        return "something"
    }

    fun printPerson() {
        println ("Person: $name")
    }

    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - birthYear

    var ssn: String = ""
        set(value) {
            if (!value.startsWith("1")) {
                throw IllegalArgumentException("ssn not valid")
            }
            field = value
        }
}

//delegate
class Resume(p: Person) : Human by p

data class Animal(var type: String, var name: String)

object Constants {
    val PI = 3.14
}


fun main(args: Array<String>) {

    var person = Person("Toto", 1974)

    println(person.age)

    person.ssn = "123"

    println(person.ssn)

    println(Resume(person).dosomething())

    val (name, type) = Animal("Fish", "Salmon")

    val list = listOf(Pair("Spain", "Madrid"), "Paris" to "France")

    for ((country, _) in list) {
        println(country)
    }

}