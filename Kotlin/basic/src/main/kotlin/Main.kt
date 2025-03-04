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

fun main() {
    sayHello("Gerson")

    print(sum(1,2))

    print(multiply(2,3))

    greet()

}