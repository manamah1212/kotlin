import kotlin.math.pow

fun main() {
    // println(functionWithParamsAndReturn(23))
    //nullability()
//MyCar("BMW").outputMyCar()
//var myNewCaar = MyPresonalCar("BMW",2015)
//var Kristaps = Human(70.7,23,1.88,"green")
//println("Hey my weight is ${Kristaps.weight},I am ${Kristaps.age}, and i have ${Kristaps.eyeColor} eyes ")

//debugging()
//functionWithParamsAndReturn(55)
    extensionFunctions()
}
    fun arrays() {
        //Array decloration
        //Array have fixed allocated memory

        var arrayA = arrayOf(1, 2, 3)
        var arrayB: Array<String> = emptyArray()


        //array list decloration

        var arrayListA = mutableListOf<Int>(1, 3, 5, 6, 7)
        var arrayListB: ArrayList<String> = arrayListOf()

        //Edit array values
        arrayA[0] = 0
        arrayA += 4
        arrayB += "Number one"

        //edit arraylist values

        arrayListA[1] = 50

        arrayA.forEach {
            println(it)
        }

        arrayListA.forEach {
            println(it)
        }


    }


fun functionWithParametrs(age: Int) {
    println("My age is $age")
}

fun functionWithReturn(): Boolean {
    return false
}

//takes @param [age]
//return birth year

fun functionWithParamsAndReturn(age: Int): Int {
    return 2020 - age
}

fun nullability() {

    //we can create null var but we have to add?
    val text: String? = "null"

    //1. safe call(?.)
    //returns the lenght if  'text' is not null else return null
    // use it if you dont mind getting null value
    //  println("The lenght of name is ${text?.length}")

    //.2 safe call with let(?.let)
    //it executes the block ONLY IF NAME is NOT null
//    text?.let {
//        println("Text is not null, its $it")
//    }

    //3. Elvis - operator
    //we have nullable reference 'text' we can say īs name is not null'' use it
    //otherwise use some non-null value

//    val variable = if (text!= null){
//        text.length
//    }else {
//        -1
//    }

//    val variable2  = text?.length?: -1
//    println (variable2)

    //4. non-null assertation operator
//use it when you are sure the VALUE IS NOT NULL
// Throws NullPointerException if the
    println("the lenght of name is${text!!.length}")
}

//simple class with simple method

class Car {
    private val carModel = "Lada"
    fun outputCar() {
        println("my car is $carModel")
    }
}

//simple class with primary constructor

class MyCar(name: String){
    val myCar = name
    fun outputMyCar(){
        println("This is my car: $myCar")
    }
}
class MyPresonalCar(val myCar: String, var myCarYear: Int){

    init {
       println("My car is $myCar and age is ${2020-myCarYear}")
    }

}

data class Human(val weight: Double, val age: Int, val height: Double,val eyeColor: String){
//    val weight : Double,
//    val age: Int,
//    val height: Double,
//    val eyeColor: String
}

fun debugging() {

    val a = 100.98
    val b = 105.23

    val c = a.pow(2)/ b

    val d = false
    val e = !d

    val f = "Kristaps"
    val g = "My name is $f"

    val h = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val i = h[6]

    print(a)

}

fun extensionFunctions(){
println("1000".addEURSign())
}