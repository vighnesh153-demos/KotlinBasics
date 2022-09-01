package collections

fun listAndArrayList() {
  val colors = listOf("blue", "red", "yellow", "red")
  println(colors.size)
  println(colors.contains("red"))
  println(colors.indexOf("blue"))
  println(colors.lastIndexOf("red"))

  val colors2 = mutableListOf("blue", "red", "yellow")
  colors2.add("purple")
  colors2.remove("red")

  val colors3 = mutableListOf("red", "red", "green")
  println(colors3)
  colors3.remove("red")
  println(colors3)
  println(colors3.subList(1, 2))
  colors3.clear()
  colors.isEmpty()
}

fun setsAndHashSets() {
  val numbers = setOf(2, 4, 6, 8)

  val numbers2 = mutableSetOf(2, 3, 4, 5, null)

  println(numbers2)
  println(numbers2.size)
  println(numbers2.contains(4))
  println(numbers2.contains(10))
  println(numbers2.isEmpty())
}

fun mapsAndHashMaps() {
  val squares = mapOf(Pair(1, 1), Pair(2, 4), Pair(3, 9))
  println(squares)

  val squares2 = mutableMapOf(Pair(1, 1), Pair(2, 4), Pair(3, 9))
  squares2[4] = 16
  println(squares2)
  println(squares2.size)
  println(squares2.isEmpty())
  println(squares2.isNotEmpty())
  println(squares2.contains(4))
  println(squares2.contains(5))
}
