package extensions

import kotlin.random.Random

// Extend method
fun String.vighneshify() = "vighnesh-${this.replace(" ", "-")}"

// Extend property
val String.randomLength: Int
  get() = Random.nextInt(1, 100)

fun usage() {
  println("Random string".vighneshify())
  println("Random string".randomLength)
  println("Random string".randomLength)

  Book.printMe()
}

class Book {
  companion object {}
}

fun Book.Companion.printMe() {
  println("inside Book::printMe")
}
