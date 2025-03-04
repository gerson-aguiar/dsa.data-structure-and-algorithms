package gersonaguiar.Array

class SearchInsertPosition {

    init {
        println(Solution().searchInsert(intArrayOf(1, 3, 5, 6), 5))
    }

    class Solution {
        fun searchInsert(nums: IntArray, target: Int): Int {

            var start = 0
            var end = nums.size - 1

            while (start <= end) {
                val mid = (start + end) / 2
                if (target == nums[mid]) {
                    return mid
                } else if (target < nums[mid]) {
                    end = mid - 1
                } else if (target > nums[mid]) {
                    start = mid + 1
                }
            }
            return start
        }
    }
}