package user_input

import kotlin.random.Random

fun gettingUserInput() {
  println("Enter something:")
  val userInput = readLine() ?: ""
  println("You entered: $userInput")
}

fun inputANumber() {
  println("Enter a number:")
  val userInput = readLine() ?: ""
  println("You entered: ${userInput.toInt()}")
  println("2 times of it is: ${userInput.toInt() * 2}")
}

fun generateARandomNumber() {
  println(Random.nextInt())
  println(Random.nextInt(10))
  println(Random.nextInt(1, 100))

  println(Random.nextDouble(1000.0))
}
