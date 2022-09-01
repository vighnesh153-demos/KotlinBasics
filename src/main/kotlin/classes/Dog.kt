package classes

abstract class Animal {
  abstract fun haveFun()
}

open class Dog(private var name: String): Animal() {
  var size = 0
    get() = field * 10
    set(newValue) {
      print("")
      field = newValue
    }

  // static stuff
  companion object {
    var species = "Dog"

    fun getClassName():String {
      return Dog::class.simpleName ?: ""
    }
  }

  init {
    println("init is running")
  }

  fun rename(newName: String) {
    this.name = newName
  }

  open fun bark() {
    println("$name is barking")
  }

  fun play() {
    println("$name is playing")
  }

  override fun haveFun() {
  }
}

class Labrador(private var name: String) : Dog(name) {
  override fun bark() {
    super.bark()
    println("Labrador is barking")
  }
}