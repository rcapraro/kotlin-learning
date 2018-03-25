package com.sada.learning.workshop6

class DirectoryExplorer(val user: String) {

//    class PermissionCheck {
//        fun validatePermission() {
//
//        }
//    }

    inner class PermissionCheck {
        fun validatePermission() {
            if (user == "Richard") {
            }
        }

        fun listFolder(folder: String, user: String) {
            val permissionCheck = PermissionCheck()
            permissionCheck.validatePermission()
        }
    }
}

fun main(args: Array<String>) {
    //val de = DirectoryExploreR()
    val de = DirectoryExplorer("Richard")
    //val pc = DirectoryExplorer.PermissionCheck()
    val pc = DirectoryExplorer("Richard").PermissionCheck()
}
