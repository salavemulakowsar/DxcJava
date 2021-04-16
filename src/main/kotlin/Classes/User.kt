package Classes

data class User(val name : String,val id : Int)
fun main()
{
    val user = User("kowsar",1)
    val user1 = User("kowsar",1)
    println(user.id)
    println(user.name)
    //user.name = "salavemula"
   // println(user.name)
    println(user.equals(user1))
    println(user==user1)
    println(user.hashCode())
    println(user1.hashCode())

}