//Inheritance->
//single Inheritance
open class Tithi() {
    fun bag() {
        println("this is Tithi's bag")
    }
}

class Faria() : Tithi() {
    fun fariasBag() {
        println("this is Faria's Bag")
    }
}

///multiLevel Inheritance->

open class Mazad() {
    fun mazad() {
        println("this is Mazad's function")
    }
}

open class Hasib() : Mazad() {
    fun hasib() {
        println("this is Hasib's function")
    }
}

class Sakib() : Hasib() {
    fun sakib() {
        println("this is Sakib's function")
    }
}

interface Camera {
    fun camera()
}

interface MusicPlayer {
    fun musicPlayer()
}
class SmartPhone():Camera,MusicPlayer{
    override fun musicPlayer(){
        println("this is the music player")
    }

    override fun camera(){
        println("this is the camera")
    }

}

fun main() {

    val smartPhone =SmartPhone()
    smartPhone.musicPlayer()

}