package interfaces

interface Oven {
  val temperature: Int

  fun turnOn()
  fun turnOff()
  fun cook() {
    println("Cooking...")
  }
}

class SamsungOven: Oven {
  override val temperature: Int
    get() = 100

  override fun turnOn() {
    println("Turning on")
  }

  override fun turnOff() {
    println("Turning off")
  }

}
