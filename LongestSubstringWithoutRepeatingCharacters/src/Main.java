import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int length = lengthOfLongestSubstring("abcabcbb");
        System.out.println(length);
    }

    public static int  lengthOfLongestSubstring(String s) {
        int prePosition = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
                max = Math.max(max, i - prePosition + 1);
            } else {
                prePosition = Math.max(map.get(s.charAt(i)) + 1, prePosition);
                max = Math.max(max, i - prePosition + 1);
                map.put(s.charAt(i), i);
            }
        }
        return max;

    }
}
