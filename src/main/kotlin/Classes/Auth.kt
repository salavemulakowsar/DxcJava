package Classes

import com.sun.jdi.connect.Connector

object Auth {
    fun takeCredentials(name: String, password:String)
    {
        println("logging in with $name and $password")
    }
    @JvmStatic
    fun main(args:Array<String>) {
        Auth.takeCredentials("kowsar","cse")
    }
}