class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var totalSum = 0
        var leftSum = 0
        for (i in nums.indices) {
            totalSum += nums[i]
        }

        for (j in nums.indices) {
            if (totalSum - leftSum == leftSum + nums[j]) {
                return j
            }
            leftSum += nums[j]
        }
        return -1
    }
}