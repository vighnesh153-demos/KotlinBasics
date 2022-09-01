package standard_functions

import kotlin.random.Random

fun isEven(n: Int) = n % 2 == 0

fun usage() {
  val animals = listOf("cat", "dog", "mouse", "lion")

  // let
  animals.map { it.length }
    .filter { it > 3 }
    // .let {
    //   println(it)
    //   println("Size of list is ${it.size}")
    // }
    .let(::println)

  // with
  with(animals) {
    println("We have ${this.size} animals")
  }

  // run (similar to IIFE from Javascript)
  run {
    val a = 1
    val b = 2
    println(a + b)
  }

  // apply
  val animalsCopy = animals.apply {
    println(this)
  }

  // also
  animals.apply {
    println(this)
  }
    .also {
      println("Log to the log files")
    }

  // take if
  val evenOrNull = Random.nextInt().takeIf(::isEven)
  val oddOrNull = Random.nextInt().takeUnless(::isEven)
}
