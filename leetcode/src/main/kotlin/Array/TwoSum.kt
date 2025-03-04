package gersonaguiar.Array

class TwoSum {

    init {
        Solution().twoSum(intArrayOf(2, 7, 11, 15), 9)
    }

    class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val map = mutableMapOf<Int, Int>()

            for (i in nums.indices) {
                if (map.containsKey(target - nums[i])) {
                    return intArrayOf(map[target - nums[i]]!!, i)
                } else {
                    map[nums[i]] = i
                }

            }
            return intArrayOf(0, 0)
        }

        fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {
            for (i in 0..nums.size - 1) {
                for (j in i + 1..nums.size - 1) {
                    if (nums[i] + nums[j] == target) {
                        return intArrayOf(i, j)
                    }
                }
            }
            return intArrayOf()
        }
    }
}