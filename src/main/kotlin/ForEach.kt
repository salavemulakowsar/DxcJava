
fun main()
{
    val items = listOf("kowsar","sweety","pinky")
     var index = 0
    while(index < items.size) {
        println("${items[index]} is at $index")
        index++
    }
/*for( item in items)
    {
        println(item)
    }
    for(index in items.indices){
        println("item at index $index is ${items[index]}")
    }*/
}