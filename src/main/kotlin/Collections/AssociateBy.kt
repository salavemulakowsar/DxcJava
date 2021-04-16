package Collections

class AssociateBy {
}
data class Person(val name:String,val city:String,val phone:Int)
var people = listOf<Person>(
    Person("kowsar","bangalore",4688),
    Person("pinky","bangalore",48959))
fun main() {
    val phoneBook = people.associateBy { it.city }
    println(phoneBook)
}