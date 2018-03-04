package com.capraro.learning

interface Human {
    fun dosomething(): String
}

open class Person(var age: Int, var name: String) : Human {

    override fun dosomething(): String {
        return "something"
    }
}

//delegate
class Resume(p: Person) : Human by p

data class Animal(var type: String, var name: String) {

}

fun main(args: Array<String>) {

    var person = Person(40, "Toto")

    println(Resume(person).dosomething())

    val (name, type) = Animal("Fish", "Salmon")

    val list = listOf(Pair("Spain", "Madrid"), "Paris" to "France")

    for ((country, _) in list) {
        println(country)
    }

}