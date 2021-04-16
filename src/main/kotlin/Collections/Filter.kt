package Collections

class Filter {
}
val nos = listOf<Int>(1,2,3,-5,-7,-9)
val words = listOf<String>("first","element","of","the","list","last")
val evenOdd = nos.partition { it%2==0 }
val fruits =listOf<String>("apple","banana")
val clothes = listOf<String>("kurthi","genes")
val cart =listOf(fruits,clothes)
val mapBag = cart.map{it}
val flatMapBag= cart.flatMap{it}
fun main() {
    println(mapBag)
    println(flatMapBag)
    val first = words.find{it.startsWith("e")}
    println(first)
    val last = words.findLast{it.startsWith("l")}
    println(last)
  println(nos.first())
    println(nos.last())
    val positives = nos.filter{it > 0}
    val negatives = nos.filter{it<0}
    println(positives)
    println(negatives)
    val doubles = nos.map{x ->x*2}
    print("doubles = $doubles")
    val any = nos.any{it>2}
    println("if any of the number is > than 2"+"$any")
    println(nos.all{it<5})
    println(nos.none{it>5})
    println("even nos are ${evenOdd.first}")
    println("odd nos are ${evenOdd.second}")
}