package lazy

fun usage() {
  val someExpensiveComputation: String by lazy {
    println("Computing now")
    "Vighnesh"
  }

  println("This will be printed first")
  println(someExpensiveComputation)
}
