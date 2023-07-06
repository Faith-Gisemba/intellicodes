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





