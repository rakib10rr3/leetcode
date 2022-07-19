class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val smallest = if (word1.length < word2.length) word1 else word2
        val longest = if (word1 == smallest) word2 else word1

        val answer = java.lang.StringBuilder()

        for(i in smallest.indices) {
            answer.append(word1[i]).append(word2[i])
        }
        for (i in smallest.length until  longest.length)
            answer.append(longest[i])

        return answer.toString()
    }
}