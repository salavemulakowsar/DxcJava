package Functions

class Lambda {
}

fun main() {
    val name : String
    val upperCase1 : (String)->String={str:String->str.toUpperCase()}
    val upperCase2 : (String)->String={str ->str.toUpperCase()}
    val upperCase3 ={str:String -> str.toUpperCase()}
    val upperCase4 : (String)->String={it.toUpperCase()}
    val upperCase5:(String)-> String=String::toUpperCase
    println(upperCase1("kowsar"))
    println(upperCase2("strawberry velvet"))
    println(upperCase3("saffron"))
}