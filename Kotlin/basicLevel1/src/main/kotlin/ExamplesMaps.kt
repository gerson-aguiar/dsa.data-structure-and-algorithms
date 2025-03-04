package gersonaguiar

class ExamplesMaps {

    init {
        //
        val scores = mapOf("A" to 2, "B" to 3)
        println(scores)

        //
        val mutableScores = mutableMapOf("A" to 2, "B" to 3)
        mutableScores["C"] = 4
        println(mutableScores)

        //
        for ((key, value) in scores) println("$key -> $value")

        val highScores = scores.filter { it.value > 2 }

        println(highScores)

        println(highScores.values)

        mutableScores.remove("B")
    }
}