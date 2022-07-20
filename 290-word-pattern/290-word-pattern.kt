class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val splitString = s.split(" ")
        if (pattern.length != splitString.size)
            return false
        val map = mutableMapOf<Char, String>()
        for (i in pattern.indices) {
            if (!map.containsKey(pattern[i])) {
                if (map.containsValue(splitString[i]))
                    return false
                map[pattern[i]] = splitString[i]
            }

            if (map[pattern[i]] != splitString[i])
                return false
        }
        return true
    }
}