public class Solution {
    public static void moveZeroes(int[] nums) {
        int bot = nums.length;
        int count = 0;
        for (int i = 0; i < bot; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }
        int zeroCount = bot - count;
        while (zeroCount > 0) {
            nums[bot - 1] = 0;
            bot--;
            zeroCount--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}