package Classes

class Company {
   var news: String ="company is lauching a new product"
    companion object Media{
    fun broadcastNews()
    {
        println("company news")
    }

}
}

fun main() {
    Company.broadcastNews()
}