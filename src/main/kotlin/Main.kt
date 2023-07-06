import javax.swing.JToolBar.Separator
//create a function in Kotlin that takes in a list of strings and returns the first element
fun getFirstElement(firsty: List<String>): String?{
    return firsty.firstOrNull()
}

//create a function in Kotlin that takes in a list of integers and returns the sum
fun getInteger(lily: List<Int>) :Int{
    return lily.sum()
}

//create a function in Kotlin that takes in a list of strings and returns a new list with only
// the elements that contain the letter 'a'
fun arrayList(lett: List<String>): List<String>{
    return lett.filter { it.contains('a') }
}

//create a function in Kotlin that takes in a list of integers and returns a new
// list with only the even numbers
fun evenList(even: List<Int>) :List<Int>{
    return even.filter { it %2 == 0 }
}

// create a function in Kotlin that takes in a list of strings and a separator, and returns a new
// string with all the elements joined by the separator
fun sepaList(lists : List<String> , separator: String): String{
    return lists.joinToString(separator)
}
//CLASSES AND DATA CLASSES
//Write a class named Rectangle that has properties width and height.
// Implement a method named getArea() that returns the area of the rectangle.

class Rectangle(var width: Int,var height: Int){
    fun getArea():Int{
        return width * height
    }

}
//Write a class named Person that has properties name, age, and gender. Implement a method
// named sayHi() that prints a greeting message including the person's name.
class Person(var name: String,var gender: String,var age: Int){
    fun sayHi(){
        println("Good morning,I am $name and I am a $gender with $age years")
    }
}
//Write a program that prints all the numbers from 1 to 100. For multiples of 3, print "Fizz" instead of the
// number and for multiples of 5, print "Buzz". For numbers which are multiples of both 3 and 5, print "FizzBuzz".

fun fizzBuzz(){
    for(i in 1..100){
        if(i %3 == 0 && i% 5== 0){
            println("FizzBuzz")
        }
        else if(i %3 == 0){
            println("Fizz")
        }
        else if(i % 5 == 0){
            println("Buzz")
        }
        else{
            println(i)
        }
    }
}

//Write a program to find the sum of all even numbers from 1 to 100.
fun eveAdd():Int{
    var sum = 0
    for(j in 1..100){
        if(j %2 == 0){
            sum += j
        }
    }
    return sum
}
fun main(){

    println(eveAdd())

    println(fizzBuzz())

    val person = Person("Gisemba","Female",23)
    person.sayHi()

//    CLASSES AND DATA CLASSES
    val tclass =Rectangle(50,4)
    val area = tclass.getArea()
    println("The area of the triangle is $area")


    val fast = listOf("car","seats","bed")
    val fasts =getFirstElement(fast)
    println(fasts)

    val sums = listOf(2,3,4,5,6,7,8,9,10)
    val sumss = getInteger(sums)
    println(sumss)


    val lett = listOf("amara","sulky","oceans","blues" ,"BMW","BBC","NTV")
    val charB = arrayList(lett)
    println(charB)

    val evena = listOf(2,4,5,6,7,9,8,1)
    val evnumb = evenList(evena)
    println(evnumb)

    val fruits = listOf("mango","apple","banana","kiwi")
    val separator = ","
    val join = sepaList(fruits,separator)
    println(join)
    findLarNum(100,2000,300)


}
//Write a function that takes three numbers as input and prints the largest one
fun findLarNum(num1: Int,num2: Int,num3:Int){
    var largest = num1

    if(num2 > largest){
        largest = num2
    }
    if(num3 > largest){
        largest = num3
    }
    println(largest)
}



//codey
fun main(){
    val tesla = Car("Tesla","Model Y,","KCC462G",0)
    println(tesla.model)
    tesla.start()
    println(tesla.speed)
    tesla.accelerate(50)
    tesla.accelerate(40)
    println(tesla.speed)
//    println(tesla.speed)
    tesla.decelerate(30)
    println(tesla.speed)
    tesla.hoot()
    tesla.stop()
    println(tesla.speed)
    val myBook = Book("Born a crime","Trevor Noah",288,"John Murray")
    println(myBook.author)
    println(myBook.tittle)
    val ages = arrayOf(3,65,8)
//    val statistics = calculateAgeStatic(ages)
//    println(statistics)
    println(calculateAgeStatic(arrayOf(1,2,3,4,5,6,7,8,9,)))

}

class Car(var make: String, var model:String, var registration: String, var speed: Int){
    fun start(){
        println("Ssshhwaaaaaa")
    }
    fun accelerate(acceleration:Int){
        speed += acceleration
    }
    fun decelerate(decceleration:Int){
        speed -= decceleration
    }
    fun hoot(){
        println("ffffffffff")
    }
    fun stop(){
        speed = 0
    }

}
data class Book(var tittle:String,var author:String,var pages:Int,var publisher: String)
data class AgeStarts(var minAge:Int,var maxAge:Int,var avgAge:Double)
fun calculateAgeStatic(ages:Array<Int>):AgeStarts{
    val min =ages.min()
    val max = ages.max()
    val avg = ages.average()
    val starts =AgeStarts(min,max,avg)
    return starts
}


//codey
fun main(){
    var calling = Car("Model p","Ranger","Mustard",6)
    println(calling.calculateParkingFees(arrayOf(30)))
    calling.carry(6)
    calling.identity("Mustard","model B")

    var coming = Bus("model x","Supermetro","peach",40)
    println(coming.maxTripFare(500.50))
    println(coming.calculateParkingFees(90.80))
    coming.carry(62)
    coming.identity("yellow","model p")

}
//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20
open class Journey(var model: String,var make: String,var color: String,var capacity: Int){
    fun carry(people: Int){
        if(people.equals(capacity)){
            println("Carrying $people passengers")
        }
        else{
            var x = people - capacity
            println("Over capacity by $x people")
        }
    }

    fun identity(color: String,model: String){
        println("I am a $color $model")
    }
}
class Car(model: String,make: String,color: String,capacity: Int):Journey(model,make,color,capacity){
    fun calculateParkingFees(hours: Array<Int>): Int{
        var number = 20
        hours.forEach{mil -> number*=mil}
        return number

    }
}

//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus
class Bus(model: String,make: String,color: String,capacity: Int): Journey(model,make,color,capacity){
    fun maxTripFare(fare: Double) : Double{
        var t = (fare * capacity)
        return (t)
    }

    fun calculateParkingFees(fare: Double):Double{
        var pin = fare * capacity
        return pin

    }
}


//codey
fun main(){
    println(capWords("My name is rita from kenya"))
    println(areaRect(20,32,12))
    println(celToFah(5.89))
    println(findCap("one day i will be great and make my parents proud"))
    println(getChar("i am a child of god"))
    println(knoBye("i want to be the best, and i will surely be"))




}
//Revision
//Given a string implement a function which capitalizes first
// letter of every word in that string.
fun capWords(word: String): String{
    val letters = word.split(" ").joinToString(" ")
    { word -> word.replaceFirstChar { it.uppercase() } }

    return letters

}

fun findCap(wolet :String): String{
    var word = wolet.split(" ").joinToString(" ")
    {wolet -> wolet.replaceFirstChar { it.uppercase() }}

    return word

}

fun getChar(neno: String): String{
    val maneno = neno.split(" ").joinToString(" ")
    {neno -> neno.replaceFirstChar { it.uppercase() }}
    return  maneno
}

fun knoBye(wd: String):String{
    val wantCha = wd.split(" ").joinToString(" ")
    {wd -> wd.replaceFirstChar { it.uppercase() }}
    return wantCha
}

//Given a list of integers return a list that contains only odd integers
// (only integers which are not a multiple of 2).
//fun findOdd(num : List<Int>):List<Int>{
//   return num.filter { it %2 = != 1 }
//}




fun capWo(word : String):String{
    var split = word.split(" ").joinToString(" ")
    {word -> word.replaceFirstChar { it.uppercase() }}

    return split

}




//Write a program that prompts the user to enter two numbers and prints their sum, difference, product, and quotient.


//Write a program that calculates the area of a rectangle. The user should be prompted to enter the length and width of the rectangle.
fun areaRect(length: Int,height: Int,width: Int):Int{
    val area = length * height * width
    return area
}

//Write a program that converts temperature from Celsius to Fahrenheit. The user should be prompted to enter the temperature in Celsius.
fun celToFah(celsius: Double): Double {
    return (celsius * 1.8) + 32
}





//codey
fun main(){
    //Function parameters
    addition(56, 36)
    addition(78,89)
    addition(78,98)
    addition(34,98)
    greetPerson("Faith")
    greetPerson("Gisemba")
    addition(145,9765)


}
fun addition(num1: Int,num2: Int): Int{
    var sum = num1 +num2
    return sum
}
fun greetPerson(name: String){
    println("Hi $name")
}

fun sumAge(ages: Array<Int>):Int{
    var total = 0
    //do summation
    return total

}
fun calculateAvg(): Double{
    var totalAge = sumAge()
    var avg = totalAge/33.0
    return avg
}


//codeey
//fun main(){
//    ageClassifier(11)
//    ageClassifier(15)
//    ageClassifier(25)
//    ageClassifier(1)
//    ageClassifier(2)
//    ageClassifier(13)
//    ageClassifier(67)
//
//}

//fun ageClassifier(age: Int){
//    if(age in 0..1){
//        println("You are a baby")
//    }
//    else if (age in 2..3){
//        println("You are a toddler")
//    }
//    else if(age in 4..17){
//        if(age < 13){
//            println("You are a child")
//        }
//        println("You are a child")
//    }
//    else{
//        println("You are an adult")
//    }
//    when(age){
//        in 0..1 -> println("You are a baby")
//        in 2..3 -> println("You are a toddler")
//        in 4..17 -> println("You are a child")
//        else -> println("You are an adult")
//    }
//
//}

//Write a function that takes in a country name and prints out the corresponding nationality for each of the
// following countries..Rwanda,Ghana,Portogul,Wales,Any other country should default to "Not applicable"
//fun main(){
//    nationality("Ghana")
//    nationality("Rwanda")
//    nationality("wales")
//
//}
//fun nationality(country: String){
//    when(country){
//        in ("Rwanda") -> println("Rwandes")
//        in ("Wales") -> println("walian")
//        in ("Ghana") -> println("ghanian")
//        in ("portogul") -> println("portogulian")
//        else -> println("Not applicable")
//    }
//}

//fun main(){
//    var languages = arrayOf("Zulu","Kiswahili","Luganda")
//    for(lang in languages){
//        println("I can speak $lang")
//    }
//    for(x in 64..74){
//    println(x *x)
//
//    }
//    val name = "Adalab"
//    for(char in name){
//        println(char)
//    }
//fun oddOrEven(nums: Array<Int>){
//    for(num in nums){
//        if(num %2 ==0){
//            println("Even")
//        }
//        else{
//            println("Odd")
//        }
//    }
//
//}
//}
//fun ageClassifier(age: Int){
//    if(age in 0..1){
//        println("You are a baby")
//    }
//    else if (age in 2..3){
//        println("You are a toddler")
//    }

//write a function that takes in an array of random integers and checks if its odd or integer
//fun main(){
//    odd()
//    println(fiveChars(arrayOf("google","ubuntu","linux","lulu")))
//    robotServe(5)
//    robotServe(14)
//    robotServe(67)
//    fizzyBuz(arrayOf())
//}
//fun odd(){
//    for(num in 1..100){
//        if(num%2 !=0){
//            println(num)
//        }
//    }
//
//}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters

//fun fiveChars(namess: Array<String>): Int {
//    var x = 0
//    namess.forEach{y ->
//        if(y.length > 5){
//            x++
//    }
//
//    }
//    return x
//}

//write a function that takes in an array of mixed types and returns the sum of all the decimal elements






//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
//
//fun robotServe(age: Int){
//    if(age in 0..6)
//        println("milk")
//     else if(age in 7..15)
//        println("fanta orange")
//    else{
//        println("Coca cola")
//    }
//}


//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)

//fun fizzyBuz(numbers: Array<String>) {
//    for (namey in 1..100) {
//        if(namey % 3 == 0 && namey % 5 == 0)
//            println("FizzBuzz")
//        else if (namey % 5 == 0)
//            println("Buzz")
//        if(namey % 3 == 0)
//            println("Fizz")
//        else{
//            println(namey)
//        }
//
//
//    }
//}
// write a function that takes in an array of
// mixed types and returns the sum of all
// the decimal elements
//fun main(){
//    var bimbo = allNums(arrayOf("Milo",50.7,"Omo",30,20.4,"wool",10.2))
//    println(bimbo)
//}
//
//fun allNums(many: Array<Any>):Any{
//    var anyArray = 0.00
//    for(x in many){
//        if(x is Double || ){
//            anyArray+=x.toString().toDouble()
//        }
//    }
//    return anyArray
//}
//

//x.toString().toDouble

fun main(){

}
fun getFirst(sr1: String,sr2: String): Char{
    if (sr1.length >= sr2.length || sr1.length == sr2.length){
        return sr1[0]
    }
    else{
        return sr2[0]
    }
}

data class statistics(var min: Int,var max: Int,var avg: Int)

fun calculateStats(nums: )






//codey
fun main(){
    var num1 = 70
    var num2 = 30
    num1 += num2
    println(num1)

    var x = 34
    var y = 23
    x %= y
    println(x)

    var m = 23
    m++
    println(m)

    var n = 28
    var f = 45
    println(n != f)

    var q = 70
    var e = 20
    println(q == e)

}

fun square(){
    val num = 40
    val square = num * num
    println(square)
}