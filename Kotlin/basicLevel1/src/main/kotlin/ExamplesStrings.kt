package gersonaguiar

class ExamplesStrings {
    init {
        val name = "Gerson"
        val greeting = "Hello, $name!"


        println(greeting)
        println(name.length)

        println(name.trim())

        println(name.replace("G", "g"))

        println(name.contains("e", ignoreCase = true))
        println(name.contains("e"))

        println(name.substring(0, 1))
        println(name.reversed())

        fun String.out() = println(this)
        println("Hello, World!".out())
    }
}