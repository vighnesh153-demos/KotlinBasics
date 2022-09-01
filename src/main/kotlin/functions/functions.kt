package functions

fun test() {
  sayHello("Tony Stark", "Thor Odinson")
  lambdaFunctions()
}

fun add(n1: Int, n2: Int): Int = n1 + n2
fun add(n1: Int, n2: Int, n3: Int): Int = n1 + n2 + n3
fun add(n1: Int, n2: Int, n3: Int, n4: Int): Int = n1 + n2 + n3 + n4

fun sayHello(vararg names: String) {
  for (name in names) {
    println(name)
  }
}

fun localFunctionTest() {
  val name = "Tony Stark"

  fun myFunction() {
    println(name)
  }
}

fun lambdaFunctions() {
  val adder = { num1: Int, num2: Int -> num1 + num2 }
  val subtractor = { num1: Int, num2: Int ->
    run {
      num1 - num2
    }
  }

  println("1 + 2 = " + adder(1, 2))
  println("20 - 5 = " + subtractor(20, 5))
}