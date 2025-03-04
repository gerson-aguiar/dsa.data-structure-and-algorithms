package gersonaguiar

class ExamplesLists() {
    init {

        // 1
        val list = mutableListOf(1, 2, 3, 4, 5)
        list.add(6)
        println(list)

        // 2
        val immutableList = listOf(1, 3, 4)
        println(immutableList)

        // 3
        println(immutableList[1])

        // 4
        val evens = list.filter { it % 2 == 0 }
        println(evens)

        // 5
        val squared = list.map { it * it }
        println(squared)

        // 6
        println(3 in list)

        // 7
        for (item in list) println(item)


        // 8
        val sortedList = list.sortedDescending()
        println(sortedList)

        // 9
        list.remove(2)

        // 10
        val sum = list.sum()
        println(sum)
    }
}