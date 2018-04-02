package com.sada.learning.workshop3

//hide constructor: we want to use the factory exclusively
class Log private constructor() {

    /*object Factory {
        fun createLogFile(fileName: String): Log = Log(fileName)
    }*/

    companion object Factory {
        fun createLogFile(fileName: String): Log = Log(fileName)
    }

    constructor(fileName: String) : this()

/*    fun usingFactoryFunction() {
        Factory.createLogFile("log.log")
    }*/
}

fun main(args: Array<String>) {
    //val log = Log()
    //val log = Log.Factory.createLogFile("log.log")
    val log = Log.createLogFile("log.log")
}