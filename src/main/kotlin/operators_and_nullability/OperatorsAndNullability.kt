package operators_and_nullability

import kotlin.random.Random

fun nullability() {
  var a: Int? = 123
  a = if(Random.nextFloat() > 0.5) null else a

  // Null safety
  var b = a?.toLong()

  // Non-Null assertion
  var c = a!!

  // Elvis operator (default value if null)
  val d = a ?: 456
}
