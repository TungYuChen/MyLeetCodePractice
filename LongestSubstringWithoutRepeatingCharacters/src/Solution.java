import java.util.HashMap;

class Solution {

    public static void main(String[] args) {
        lengthOfLongestSubstring("abba");
    }

    public static int  lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        if (s.length() == 1)
            return 1;
        HashMap<Character, Integer> charMap = new HashMap<>();
        char[] chars = s.toCharArray();
        int max = 0;
        int prePosition = 0;
        for (int i = 0; i < chars.length; i++) {
            if (!charMap.containsKey(chars[i])) {
                charMap.put(chars[i], i);
            } else {
                if (max < i - charMap.get(chars[i])) {
                    max = i - charMap.get(chars[i]);
                }
                prePosition = i;
                charMap.put(chars[i], i);
            }
            if (max < i - prePosition + 1) {
                max = i - prePosition + 1;
            }
        }
        return max;

    }
}