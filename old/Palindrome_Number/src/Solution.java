import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        String number = Integer.toString(x);
        char[] numberChar = number.toCharArray();
        int indexFront = 0;
        int indexBottom = numberChar.length - 1;
        while (indexFront < indexBottom) {
            if (numberChar[indexFront] != numberChar[indexBottom])
                return false;
            indexFront++;
            indexBottom--;
        }


        return true;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        System.out.println(solution.isPalindrome(number));
    }
}
