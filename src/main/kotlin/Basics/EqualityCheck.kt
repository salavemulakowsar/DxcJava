package Basics

class EqualityCheck {
}
fun main()
{
    val listAuthors = setOf<String>("author1","author2")
    val listWriters = setOf<String>("author1","author2")
    println(listAuthors == listWriters)
    print(listAuthors===listWriters)
    }
