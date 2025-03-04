package gersonaguiar

// Simple function
fun sayHello(name: String) {
    println("Hello, $name!")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun multiply(a: Int, b: Int) = a * b

fun greet(name: String = "Guess") {
    println("Hello, $name!")
}

fun getStatus(code: Int) = when(code) {
    200 -> "OK"
    404 -> "Not found"
    500 -> "Server Error"
    else -> "Unknown"
}

fun main() {
    sayHello("Gerson")

    println(sum(1,2))

    println(multiply(2,3))

    greet()

    val age = 29
    val canDrive = if(age>=18) "Can drive" else "Can't drive"
    println(canDrive)

    println(getStatus(404))

    for (i in 1..5){
        println(i)
    }

    var count = 3
    while (count > 0){
        println("Count: $count")
        count--
    }

    val numbers = listOf(1,2,3,4,5)
    println(numbers[2])

    val evens = numbers.filter { it % 2 == 0 }
    println(evens)

    //
    val squares = numbers.map { it * it }
    println(squares)

    //
    class Person(val name: String, val age: Int)

    val person = Person("Gerson", 29)
    println(person.name)

    //
    class Car(val brand: String) {
        fun honk() {
            println("Tuut, $brand")
        }
    }

    val car = Car("Ford")
    car.honk()

    //
    data class User(val name: String, val age: Int)
    val user = User("Gerson", 29)
    println(user)

    //
    var name: String? = null
    println(name?.length ?: "Name is null")

    // lambda
    val add = {a: Int, b: Int -> a + b}
    println(add(1,2))

}