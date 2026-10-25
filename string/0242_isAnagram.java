class Solution {
    public boolean isAnagram(String s, String t) {
        // 长度不一样直接false
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        // s字符计数+1
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        // t字符计数-1
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }
        // 检查全部归零
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}