import kotlin.text.toLowerCase

class Solution {
    fun isPalindrome(s: String): Boolean {
        var answer = true
    var front = 0
    var back = s.length - 1

    if (s.isBlank())
        return true
    else {
        while (front <= back) {
            while (!s[front].isLetterOrDigit()) {
                front++
                if (front > back)
                    return true
            }
            while (!s[back].isLetterOrDigit()) {
                back--
            }

//        println("current front ${s[front]} back ${s[back]}")

            if (s[front].toLowerCase() != s[back].toLowerCase()) {
                answer = false
                break
            } else {
                front++
                back--
                answer = true
            }
        }
    }

    println(s)
    println(answer)
    return answer
    }
}