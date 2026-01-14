fun main(args: Array<String>) {
println( add(10,5,5))
}
fun add(first:Int,second:Int,third:Int):Int{
    val a = if(first>second && first>third){
        first
    }else if(second>third){
        second
    }else{
        third
    }
return a

}
