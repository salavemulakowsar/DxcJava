package Functions

data class Order(val quantity : Int)
fun Order.isStockAvailable():Boolean{
    return false
}
public fun String.isFemale(name : String):Boolean
{
    if(name.startsWith("k"))
    {
        return true
    }
    else{
        return false
    }
}
fun main() {
println(String().isFemale("kowsar"))

}