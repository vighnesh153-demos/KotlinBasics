package other_classes

enum class Gender {
  MALE,
  FEMALE
}

enum class Color(val heartCount: Int) {
  RED(10),
  BLUE(5),
  WHITE(0)
}

data class User(
  val name: String,
  val email: String,
  val password: String,
  val gender: Gender,
  val favouriteColor: Color,
)

fun usage() {
  val user =
    User(name = "Vighnesh Raut",
         email = "me@vighnesh153.com",
         password = "123456",
         gender = Gender.MALE,
         favouriteColor = Color.RED)
  println(user)
  println(user.favouriteColor.name)
  println(user.favouriteColor.ordinal)
  println(user.favouriteColor.heartCount)
}

class Car {
  private val engine = Engine()
  var speed = 100

  fun drive() {
    engine.run()
    println("Driving at $speed")
  }

  private inner class Engine {
    val rpm = 300
    fun run() {
      this@Car.speed = 150
      this@Car.drive()
      println("Engine running")
    }
  }
}
