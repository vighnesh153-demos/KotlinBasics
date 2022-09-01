package classes

class Car(model: String) {
  var model: String? = model
  var topSpeed = 100;

  constructor(model: String, topSpeed: Int) : this(model) {
    this.topSpeed = topSpeed
  }

  fun start() {
    println("Starting the car: $model")
  }

  fun drive(speed: Int) {
    println("Driving at a speed of $speed")
  }
}