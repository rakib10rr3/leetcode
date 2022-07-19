import kotlin.math.max

class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val answer = java.lang.StringBuilder()

        for(i in 0 until max(word1.length,word2.length)) {
            if (i < word1.length) answer.append(word1[i])
            if (i < word2.length) answer.append(word2[i])
        }

        return answer.toString()
    }
}