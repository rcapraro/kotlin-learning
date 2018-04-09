package com.sada.learning.workshop6

import java.io.Serializable

// without constraint, T is Any?
/*
class EntityRepository<T> {
    fun save(entity: T) {
        if (entity.id != 0) {
            // do something
        }
    }
}*/


//constraint T: upper bound constraint
open class Entity(val id: Int)

class EntityRepository<in T : Entity> {
    fun save(entity: T) {
        if (entity.id != 0) {
            // do something
        }
    }
}

//constrain also on functions
fun <T : Serializable> streamObject(obj: T) {}

class CustomerEntity : Entity(id = 0) {}

open class Person() {}

class Employee : Person() {}

fun operate(person: Person) {}

fun operateArray(person: Array<Person>) {}

fun main(args: Array<String>) {

    var repo = EntityRepository<CustomerEntity>()

    //i can do both because Employee is a subtype of Person
    operate(Person())
    operate(Employee())

    //i can do
    operateArray(Array<Person>(1) {Person()})
    //but not this because Array<Employee> is not a subtype of Array<Person>
    // operateArray(Array<Employee>(1) {Employee()})


}

