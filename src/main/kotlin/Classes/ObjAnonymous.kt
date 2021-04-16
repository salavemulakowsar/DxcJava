package Classes

class ObjAnonymous {
}
fun rentPrice(normalDay : Int, festivalDay : Int)
{
    val dayRates = object{
        var standard: Int =30;
        var festive: Int =50;
    }
    val total = dayRates.standard + dayRates.festive
    println("Total price = $total")
}
fun main()
{
    rentPrice(10,2)
}