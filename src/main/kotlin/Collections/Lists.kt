package Collections

class Lists {
}
    fun addSysUser(newUser: Int,list:MutableList<Int>) {
list.add(newUser)
    }

    fun main() {
        val sysUsers:MutableList<Int> = mutableListOf(1,2,3)
        addSysUser(5,sysUsers)
        val othersList: List<Int> = sysUsers
      println(sysUsers)
    }
