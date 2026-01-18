fun main(args: Array<String>) {
    print("enter banknotes: ")
    val notes = readLine()!!.toInt()

    var fiveHundred = notes %  5
    println("$fiveHundred of 500")

    var oneHundred = fiveHundred %  1
    println("$oneHundred of 500")
}