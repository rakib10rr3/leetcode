class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val sMap = mutableMapOf<Char, Char>()
        val tMap = mutableMapOf<Char, Char>()

        for (i in s.indices) {
            if (!sMap.containsKey(s[i]))
                sMap[s[i]] = t[i]
            if (!tMap.containsKey(t[i]))
                tMap[t[i]] = s[i]
            if (s[i] != tMap[t[i]] || t[i] != sMap[s[i]])
                return false
        }
        return true
    }
}