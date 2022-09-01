package variables_and_strings

fun strings() {
  var myString = "This is my first string"
  println(myString)
  myString = "This is my second string"
  println(myString)
  myString = "This is a string with special characters: \" and \\"
  println(myString)
}

fun chars() {
  val myChar = 'A';
  println("This is my char: $myChar")
}

fun variables() {
  var age = 100
  println("My age is: $age")
  age += 200
  println("My new age is: $age")

  val birthYear = 1998
  println("My birth year is $birthYear and it is immutable")
}

fun drawABunny() {
  println("(\\(\\")
  println("(-.-)")
  println("o_(\")(\")")
}

fun stringPropertiesAndFunctions() {
  val myString = "irOnmAn iS tHe BesT"

  println(myString.length)
  println(myString.capitalize())
  println(myString.decapitalize())
  println(myString.trim())
  println(myString.substring(11))
  println(myString.substring(11, 14))
}
