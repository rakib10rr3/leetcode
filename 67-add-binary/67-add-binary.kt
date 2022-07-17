import kotlin.math.abs

class Solution {
    fun addBinary(a: String, b: String): String {
        var first = a
        var second = b

        for (i in 0 until abs(first.length - second.length)) {
            if (a.length < b.length) first = "0$first"
            else second = "0$second"
        }

        val answer = StringBuilder(first)
        var carry = 0
        var temp: Int

        for (i in first.length - 1 downTo 0) {
            temp = (first[i].toString().toInt() xor second[i].toString().toInt())
            answer[i] = (temp xor carry).toString().single()
            carry = if (first[i] == '1' && second[i] == '1' || carry == 1 && temp == 1) {
                1
            } else {
                0
            }
        }

        if (carry == 1) answer.insert(0, 1)

        return answer.toString()
    }

}