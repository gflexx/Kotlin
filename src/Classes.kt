fun main() {
    val car1 = CarClass("Toyota", "Supra")
    println("Car 1 \n" +
            "make: ${car1.make} \n" +
            "model: ${car1.model} \n" +
            car1.startEngine()
    )

    val car2 = CarClass(make = "Nissan", model = "GTR")
    println("Car 2\n" +
            "make: ${car2.make} \n" +
            "model: ${car2.model} \n" +
            "off road: ${car2.checkOffRoad()}"
    )
}