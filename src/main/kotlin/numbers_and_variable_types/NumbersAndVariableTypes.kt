package numbers_and_variable_types

fun numbers() {
  val a = 13
  val b = 13123212232;
  val c = 12.4f;
  val d = 12.432342;

  println("a = $a and its type is \"${a::class.java}\"")
  println("b = $b and its type is \"${b::class.java}\"")
  println("c = $c and its type is \"${c::class.java}\"")
  println("d = $d and its type is \"${d::class.java}\"")

  val explicitLong1 = 12L
  val explicitLong2: Long = 12

  val explicitFloat = 12F
}

fun typeConversions() {
  val a = 12.34
  println(a.toInt())
}