class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val answer = IntArray(nums.size)
        var currentSum = 0
        for (i in nums.indices) {
            currentSum += nums[i]
            answer[i] = currentSum
        }
        return answer 
    }
}