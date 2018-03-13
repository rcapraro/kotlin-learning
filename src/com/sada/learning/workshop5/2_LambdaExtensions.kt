package com.sada.learning.workshop5

class Request(val method: String, val query: String, val contentType: String) {
    fun validate() {

    }
}

//class Response(var contents: String, var status: Int)
//class Response(var contents: String, var status: Status)

class Response(var contents: String, var status: Status) {
    fun content(content: String.() -> Unit) {

    }

    fun status(status: Status.() -> Unit) {

    }
}

class Status(var code: Int, var description: String)

class RouteHandler(val request: Request, val response: Response)

//higher order function which takes an extension function
fun routeHandler(path: String, f: RouteHandler.() -> Unit) {}

fun response(response: Response.() -> Unit) {}

fun main(args: Array<String>) {
    routeHandler("/index.html") {
        //get access to request because extension functions have access to properties of the class they are extending
        if (request.query != "") {
            //request.query
            request.validate()
        }
        /*response.status = 404
        response.contents = "Not found"*/
        // response.status.code = 404
        response {
            content {
                "this is a content"
            }
            //get access to response properties
            status {
                code = 404
                description = "Not found"
            }
        }

    }
}