package com.sada.learning.workshop6

data class Customer(val name: String)

interface Repository {
    fun getAll(): List<Customer>
}

class CustomerService {

    //var repository:Repository? = null

    lateinit var repository: Repository

    fun index(): String {
        // return repository?.getAll().toString()
        return repository.getAll().toString()
    }

}

fun main(args: Array<String>) {
    val customerService = CustomerService()
    customerService.index() // throws kotlin.UninitializedPropertyAccessException

}
