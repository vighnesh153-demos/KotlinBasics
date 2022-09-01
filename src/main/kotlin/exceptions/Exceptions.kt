package exceptions


fun exceptionsPlayground() {
  val s = "test"

  try {
    val sInt = s.toInt()
  } catch (e: NumberFormatException) {
    e.printStackTrace()
    throw IllegalStateException("I don't like this input")
  } finally {
    println("This is from the finally block")
  }
}
