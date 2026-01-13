//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

//  var a:Int = 10//changeable//mutable//can be-reassign
//   println(a)
//    a=14;
//    println(a)
//   val b:Int = 12//unchangeable//immutable//can not be-reassign
//    println(b)

//    val myNum:Int = 5             // Int
//    println(myNum)
//    val myDoubleNum = 5.99    // Double
//    println(myDoubleNum)
//    val myFloatNum = 5.9f   // Float
//    val myLetter = 'D'        // Char
//    val myBoolean = true      // Boolean
//    val myText = "Hello"      // String
//    val a = 20
//    println("this is Integer a = $a")
//    val b = a.toDouble()
//    println("this is Double b = $b")

    //Arithmetic
//    val a = 1
//    val b = 6
//    val add = a + b //Add operation
//    val sub = a - b //subtraction operation
//    val mul = a * b //Multiplication operation
//    val div = a / b //division operation
//    val mod = a % b //modulas operation
//    println("addition of a = $a and b = $b is c = $add")
//    println("subtraction of a = $a and b = $b is c = $sub")
//    println("mod of a = $a and b = $b is c = $mod")

    //Assignment
    // 1. Simple Assignment (=)
 //   var result = 10
//    println("Initial value: $result")
//    // 2. Addition Assignment (+=) Equivalent to: result = result + 5
//    result +=  5 //result = result+5
//   println("After += 5: $result")
//    // 3. Subtraction Assignment (-=) Equivalent to: result = result - 3
//    result -=  3
//    println("After -= 3: $result")
//    // 4. Multiplication Assignment (*=) Equivalent to: result = result * 2
//    result *= 2
//    println("After *= 2: $result")
//    // 5. Division Assignment (/=) Equivalent to: result = result / 4
//    result /= 4
//    println("After /= 4: $result")
//    // 6. Modulo (Remainder) Assignment (%=) Equivalent to: result = result % 5
//    result %= 5
//    println("After %= 5: $result")
//


//    val a:Int = 15
//    val b:Int = 14
//    // 1. Equal to (==)
//    val isEqual = (a == b)
//    println("$a == $b is $isEqual")
//
//    // 2. Not equal to (!=)
//    val isNotEqual = (a != b)
//    println("$a != $b is $isNotEqual")
//
//    // 3. Greater than (>)
//    val isGreater = (a > b)
//    println("$a > $b is $isGreater")
//
//    // 4. Less than (<)
//    //15<14 //true
//    val isLess = (a < b)
//    println("$a < $b is $isLess")
//
//    // 5. Greater than or equal to (>=)
//
//    //15>=14
//    val isGreaterOrEqual = (a >= b)
//   println("$a >= $b is $isGreaterOrEqual")
//
//   //15<=14
//    val isLessOrEqual = (a <= b)
//    //println("$a <= $b is $isLessOrEqual")
//
////
////
////        val x = true
////        val y = false
////
////        // 1. Logical AND (&&)
////        // Returns true only if BOTH are true
////        val andResult = x && y
////       // println("$x && $y is $andResult")
////
////        // 2. Logical OR (||)
////        // Returns true if AT LEAST ONE is true
////        val orResult = x || y
////        //println("$x || $y is $orResult")
////
////        // 3. Logical NOT (!)
////        // Reverses the value (true becomes false, and vice-versa)
////        val notX = !x
////        val notY = !y
////        //println("!$x is $notX")
////       // println("!$y is $notY")
////
////        // Example of combining them
////        val complex = (10 > 5) && (2 < 4)
////        //println("(10 > 5) && (2 < 4) is $complex")

   // val x = 10
   // val y = 10
   // println(x >= y)

//
//    print("Enter your grade: ")
//    val grade: Int = readLine()!!.trim().toInt()

//    if(grade >= 80 && grade <= 100){
//        println("Your grade is A+")
//    }else if(grade >= 70 && grade <= 79){
//        println("Your grade is A")
//    }else{
//        println("Your grade is F")
//    }

//    print("enter first number ") ;val a = readLine()!!.toDouble();
//    print("enter second number ") ;val b = readLine()!!.toDouble()
//    print("enter operator +,-,*,/ ->  ") ;val operator = readLine()!!
//val result = when(operator){
//      "+"-> a+b
//      "-" -> a-b
//       "*" -> a*b
//       "/" -> if(b != 0.0){
//           a/b
//           return
//       }else{
//          println("can not divide by zero")
//           return
//       }
//    else -> {
//        println("invalid operator")
//        return
//    }
//}
//    println(result)

    //while Loop
//1.Start
//2.condition
//3.inc/Dec

//    var i=0//iitialization
//
//    while(i<5){//condition/where to stop
//
//        ++i//inc
//        if (i==2){
//            continue
//        }
//        println(i)
//
//    }


/*    var i = 1  // initialize first
    while (i <= 10) {
        if(i%2==0){
            println("$i is even ")
        }else{
            println("$i is odd ")
        }
    }*/
 /*   println("for loop")

    for(j in 1 until 11 ) {
        print("$j ")

    }*/



/*    for (j in 1..10) {  // loop from 1 to 10
        if (j % 2 == 0) {
            println("$j is even")
        } else {
            println("$j is odd")
        }
    }*/

  /*      val startProgram = true
        if (startProgram) {
            println("Program Started\n")
            for (i in 1..20) {
                println("For loop iteration: $i")
                var j = 1
                print("While loop counting: ")


                while (j <= i) {
                    print("$j ")
                    j++
                }


                println("\n------------------")
            }
        } else {
            println("Program not started")
        }

  */

 /*   val examActive = true
    if (examActive) {
        println("Exam Processing Started\n")
        for (student in 1..3) {
            val marks = student * 25
            println("Student $student Marks: $marks")
            if (marks >= 40) {
                println("Status: Pass")
            } else {
                println("Status: Fail")
            }//end if
            var count = 10
            print("Marks counting: ")
            while (count <= marks) {
                print("$count ")
                count += 10
            }
            println("\n---------------------")
        }
    } else {
        println("Exam not active")
    }*/



   /*     val connectionActive = true

        if (connectionActive) {
            println("Electricity Billing Started\n")

            // FOR LOOP: customers
            for (customer in 1..2) {
                val units = customer * 120
                var bill = 0
                var u = 1

                println("Customer $customer Units: $units")

                // WHILE LOOP: unit calculation
                while (u <= units) {
                    bill += if (u <= 100) {
                        5
                    } else {
                        10
                    }
                    u++
                }

                println("Total Bill: $bill Taka")
                println("-----------------------")
            }

        } else {
            println("No active connection")
        }*/



/*
        println("=== 0️⃣ Array ===")
        val numbersArray = arrayOf(10, 20, 30, 40,50)
        println("Array: ${numbersArray.joinToString()}")
        println("First element: ${numbersArray[0]}")
        println("Last element: ${numbersArray[numbersArray.size - 1]}")

        // Updating array element
        numbersArray[1] = 25
        println("After updating 2nd element: ${numbersArray.joinToString()}")*/

       // val numbers = arrayOf(10, 25, 30, 40)

        /*println("Access array using for-in loop:")
        for (num in numbers) {
                print("$num")
        }*/

//        println("\nAccess array using index:")
//        for (i in numbers.indices) {
//                println("Index $i -> ${numbers[i]}")
//        }


      /*  println("\nAccess array using while loop:")
        var i = 0
        while (i < numbers.size) {
                println("Index $i -> ${numbers[i]}")
                i++


        }*/


        /*        println("\n=== 1️⃣ Immutable List ===")
                val fruits = listOf("Apple", "Banana", "Mango", "Apple")
                println("Fruits List: $fruits")
                println("First fruit: ${fruits.first()}")
                println("Last fruit: ${fruits.last()}")
                println("Is 'Banana' in list? ${fruits.contains("Banana")}")
                println("Sorted fruits: ${fruits.sorted()}")

                println("\n=== 2️⃣ Mutable List ===")
                val mutableFruits = mutableListOf("Orange", "Pineapple")
                println("Before: $mutableFruits")
                mutableFruits.add("Grapes")
                mutableFruits.remove("Orange")
                println("After add/remove: $mutableFruits")

                println("\n=== 3️⃣ Immutable Set ===")
                val numbersSet = setOf(1, 2, 3, 3, 4)
                println("Numbers Set (duplicates removed): $numbersSet")

                println("\n=== 4️⃣ Mutable Set ===")
                val mutableNumbers = mutableSetOf(5, 6, 7)
                println("Before: $mutableNumbers")
                mutableNumbers.add(6) // ignored
                mutableNumbers.add(8)
                println("After add: $mutableNumbers")

                println("\n=== 5️⃣ Immutable Map ===")
                val student = mapOf(
                    "Name" to "Aminul",
                    "Age" to 22,
                    "Grade" to "A"
                )
                println("Student Info: $student")
                println("Name: ${student["Name"]}")

                println("\n=== 6️⃣ Mutable Map ===")
                val subjects = mutableMapOf<String, Int>()
                subjects["Math"] = 90
                subjects["English"] = 85
                subjects["Science"] = 95
                println("Subjects & Marks: $subjects")
                subjects["Math"] = 92 // update
                println("After updating Math: $subjects")

                println("\n=== 7️⃣ Looping Through Collections ===")

                println("-- Loop through Array --")
                for (num in numbersArray) {
                    println(num)
                }

                println("-- Loop through List --")
                for (fruit in mutableFruits) {
                    println(fruit)
                }

                println("-- Loop through Set --")
                for (num in mutableNumbers) {
                    println(num)
                }

                println("-- Loop through Map --")
                for ((subject, mark) in subjects) {
                    println("$subject = $mark")
                }

                println("\n=== 8️⃣ Collection Functions Example ===")
                val marks = listOf(60, 70, 80, 90, 100)
                println("Marks: $marks")
                println("Size: ${marks.size}")
                println("Max mark: ${marks.maxOrNull()}")
                println("Min mark: ${marks.minOrNull()}")
                println("Sum of marks: ${marks.sum()}")
                println("Average mark: ${marks.average()}")
            */




}




