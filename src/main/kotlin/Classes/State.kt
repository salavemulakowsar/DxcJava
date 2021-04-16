package Classes

enum class State {IDLE, CALLING }
fun main() {
    val state = State.CALLING
    val msg =
        when(state) {
            State.IDLE -> "idle state"
            State.CALLING ->"Calling"
        }
    println(state)
}