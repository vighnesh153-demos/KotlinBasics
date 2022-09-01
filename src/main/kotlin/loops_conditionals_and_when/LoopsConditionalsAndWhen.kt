package loops_conditionals_and_when

import kotlin.random.Random

fun conditionals() {
  val age = Random.nextInt(1, 30)
  val isAdult = if (age >= 18) true else false
  println("Age of the person: $age")

  if (isAdult) {
    println("Person is adult")
  } else if (age >= 16) {
    println("Person is semi-adult")
  } else {
    println("Person is a minor")
  }
}

fun expressions() {
  val myNum = Random.nextInt(1, 100)
  val isOdd = myNum % 2 == 1

  val numbers = setOf(1, 2, 3, 4, 5)
  val has7 = 7 in numbers
  val notHas8 = 8 !in numbers
  val isSingleDigitNumber = myNum in 0..9
}

fun whenCondition() {
  val age = Random.nextInt(1, 100)
  val isAdult = when (age) {
    in 1..9 -> false
    in 18..1000 -> true
    10, 11 -> false
    else -> false
  }

  val ageAdders = when (val futureAge = age + Random.nextInt(1, 10)) {
    in 1..9 -> futureAge + 100
    in 18..1000 -> futureAge + 200
    else -> futureAge * 300
  }
}

fun forLoops() {
  val animals = listOf("cat", "dog", "hamster")
  for (animal in animals) {
    println(animal)
  }

  println("*".repeat(20))

  for (i in 18..20) {
    println(i)
  }
}

fun whileLoops() {
  var i = 0
  while (i < 10) {
    i++
  }
}

fun doWhileLoops() {
  var i = 0
  do {
    i++
  } while (i < 10)
}

fun labelsExample() {
  myOuterLoop@ for (i in 1..10) {
    for (j in 1..10) {
      if (i * j > 50) break@myOuterLoop
      if (i * j > 30) continue@myOuterLoop
      println(i * j)
    }
  }
}
