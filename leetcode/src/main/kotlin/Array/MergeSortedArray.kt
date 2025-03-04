package gersonaguiar.Array

class MergeSortedArray {

    init {
        merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)
    }

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        for (i in nums2.size - 1 downTo 0) {
            nums1[m + i] = nums2[i]
        }
        nums1.sort()
    }
}