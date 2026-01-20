/*class Car(var brand: String, var model: String) {
    fun showDetails() {
        println("Car Brand: $brand, Model: $model")
    }
}*/

/*fun main() {

*//*    val car1 = Car("Toyota", "Corolla")
    car1.showDetails()

    val car2 = Car("Honda", "Civic")
    car2.showDetails()


    val bike1 = Bike("Yamaha", 120)
    bike1.showDetails()

    val bike2 = Bike("Suzuki", 100)
    bike2.showDetails()

    bike1.speed = 150
    bike1.brand = "Suzuki"

    bike1.showDetails()*//*
}*/

//primaryConstructor
class Car(val brand: String, val model: String){

    fun showDetails(){
        println("brand : $brand,model : $model")
    }
}
class Bike {
    var brand: String
    var cc: Int


    constructor(brand: String, cc: Int) {
        this.brand = brand
        this.cc = cc
    }

    fun showDetails() {
        println("Bike Brand: $brand, cc: $cc km/h")
    }
}
fun main(args: Array<String>) {

    val car1 = Car("Toyota","carina")
    car1.showDetails()
    val car2 = Car("Toyota","corolla")
    car2.showDetails()

    val bike1 =Bike("Yamaha", 150)
    bike1.showDetails()
    bike1.cc=250
    bike1.showDetails()

}





