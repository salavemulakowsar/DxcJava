package Classes



enum class Color(val rgb : Int)
{
    RED(0xff0000),
    GREEN(0x00ff00),
    BLUE(0X0000FF),
    YELLOW(0XFFFF00);
    fun containsRed() = (this.rgb and 0xff0000 !=0)
}
fun main()
{
    val red = Color.RED
    println(red)
    println(Color.RED.ordinal)
    println(red.containsRed())
}
