package gersonaguiar.Array

class PlusOne {

    init {
        plusOne(intArrayOf(1, 2, 3))
    }

    fun plusOne(digits: IntArray): IntArray {

        for (i in digits.size - 1 downTo 0) {
            digits[i] = digits[i] + 1
            if (digits[i] <= 9) {
                return digits
            }
            digits[i] = 0
        }

        val plusOneIntInArray = IntArray(digits.size + 1)
        plusOneIntInArray[0] = 1
        return plusOneIntInArray
    }
}