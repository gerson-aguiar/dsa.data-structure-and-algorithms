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

    fun mergeOptimized(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = m - 1 // Pointer for nums1 (last valid element)
        var j = n - 1 // Pointer for nums2 (last element)
        var k = m + n - 1 // Pointer for final position in nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]
                i--
            } else {
                nums1[k] = nums2[j]
                j--
            }
            k--
        }

        while (j >= 0) {
            nums1[k] = nums2[j]
            j--
            k--
        }

    }
}