package gersonaguiar

// Simple function
fun sayHello(name: String) {
    println("Hello, $name!")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    sayHello("Gerson")

    print(sum(1,2))
}