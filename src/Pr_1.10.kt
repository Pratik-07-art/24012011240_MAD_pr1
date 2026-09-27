class Car(
    var type: String,
    var model: Int,
    var price: Double,
    var owner: String,
    var milesDrive: Int
) {
    init {
        println("Object of class is created and Init is called.")
    }
    fun getCarInformation() {
        println("Car Information: $type, $model")
    }
    fun getOriginalCarPrice() {
        println("Original Car Price: $price")
    }
    fun getCurrentCarPrice() {
        val currentPrice = price - (milesDrive * 10)
        println("Current Car Price: $currentPrice")
    }
    fun displayInformation() {
        getCarInformation()
        println("Car Owner: $owner")
        println("Miles Drive: $milesDrive")
        getOriginalCarPrice()
        getCurrentCarPrice()
        println("-----------")
    }
}
fun main() {
    val car1 = Car("BMW", 2018, 100000.0, "Pratik", 105)
    car1.displayInformation()
    println()
    println("Creating Car Class Object car2 in next line")
    val car2 = Car("BMW", 2026, 400000.0, "Omkar", 20)
    println("-----------")
    car2.displayInformation()
    println("\n******** ArrayList Of Car *************")
    val carList = ArrayList<Car>()
    carList.add(Car("Toyota", 2017, 1080000.0, "HGV", 100))
    carList.add(Car("Maruti", 2020, 600000.0, "MVP", 50))
    println("-----------")
    for (car in carList) {
        car.displayInformation()
    }
}