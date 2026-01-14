fun oneThousandOne(){
    //1001
    val A:Int=readLine()!!.toInt()
    val B:Int=readLine()!!.toInt()
    val X:Int=A+B
    println("X = $X")

}


fun twoThousandTwo(){
    //1002
    val R:Double = readLine()!!.toDouble()
    val pi:Double = 3.14159

    val A:Double =pi*R*R

    println("A=${"%.4f".format(A)}")
}
fun main(args: Array<String>) {
    //oneThousandOne()
    //twoThousandTwo()
    addition(5.0,5.0)

}
fun addition(a:Double, b:Double):Double{
    val sum=a+b
    println(sum)
    return 0.0
}





















