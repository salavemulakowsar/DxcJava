package Functions

class HigherOrder {
}
fun mul(a:Int,b:Int):Int
{
    return a*b
}
fun sum(x:Int,y:Int)=x+y
fun funReturnsAnotherFun():(Int)->Int{
    return  ::square
}
fun square(x:Int)=x*x
fun calculate(x:Int,y:Int,operation:(Int,Int)->Int):Int{
    return operation(x,y)
}
fun main() {
    val resultSum = calculate(10,20,::sum)
    val resultMul = calculate(20,30,::mul)
    val func = funReturnsAnotherFun()
    println(func(5))
     println(resultSum)
    println(resultMul)
}