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
}