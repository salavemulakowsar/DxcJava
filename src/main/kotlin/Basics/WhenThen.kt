package Basics

class WhenThen {
}
fun main() {
    val students = listOf("kowsar", "pinky", "sweety")
    when
    {
        "kowsar" in students -> println("She is from AP")
        "pinky"  in students -> println("She is from karnataka")
    }
}