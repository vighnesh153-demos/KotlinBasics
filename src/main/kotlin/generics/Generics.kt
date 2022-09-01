package generics

open class Human {}

class Male: Human() {}
class Female: Human() {}

class Stack<T: Human> {
  private val items: List<T> = mutableListOf()
}

fun usage() {
  val men = Stack<Male>();
}
