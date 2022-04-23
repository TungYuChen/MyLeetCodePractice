import java.util.ArrayList;
import java.util.List;

class Solution {
    public int myAtoi(String s) {

        char[] ch = s.toCharArray();
        long ans = 0;
        long mod = (long) Math.pow(2, 31);
        int sign = 1;
        int signCount = 0;
        if (ch.length == 0) return 0;
        boolean space = true;
        List<Integer> array = new ArrayList<>();
        for (char c : ch) {
            if (signCount == 0 && c == ' ') {
                space = true;
            } else if (signCount == 0 && (c == '-' || c == '+')) {
                if (!space) return 0;
                if (c == '-') sign *= -1;
                signCount++;
                space = false;
            } else if ((c >= 48 && c <= 57)) {
                array.add(Integer.parseInt(Character.toString(c)));
                space = false;
                signCount++;
            }
            else {
                break;
            }
        }
        for (int i = 0; i < array.size(); i++) {
            ans += array.get(i) * Math.pow(10, array.size() - 1 - i);
        }
        ans *= sign;
        if (ans < mod * -1) {
            return -2147483648;
        } else if (ans >= mod) {
            return (int) (mod - 1);
        }

        return (int) ans;
    }
}
