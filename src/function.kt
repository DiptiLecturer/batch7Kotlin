fun main() {
    val sum = calculate(5,4){x, y -> x + y}
    val multiply = calculate(5,5){x, y -> x * y}
    //println(sum)
    //println(multiply)
    //println(name(5,6))
    //dummyName()
    /* val sum =calculateNew(10,5,::add)
    println(sum)*/
}
val name = {x:Int,y:Int -> x*y }
//HigherOrder function
fun calculate(a:Int,b:Int, operation:(Int,Int)->Int ):Int{
    return operation(a, b)
}
/*
fun add(a: Int, b: Int): Int {
    return a + b
}
fun sub(a: Int, b: Int): Int {
    return a - b
}

fun calculateNew(x: Int, y: Int,operationNew:(Int,Int)->Int): Int {
    return operationNew(x,y)
}*/
