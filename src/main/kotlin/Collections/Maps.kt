package Collections

class Maps {
}
val passedStudents: MutableMap<Int,String> = mutableMapOf();
fun main()
{
    passedStudents.put(1,"kowsar")
    passedStudents.put(2,"pinky")
    println(passedStudents)
    println(passedStudents.get(1))
   // val name = passedStudents.filter{it("k")}
   // println(name)
}
