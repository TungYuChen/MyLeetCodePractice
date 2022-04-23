import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int max = 1;
        int temp = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                temp++;
                if (temp > max)
                    max = temp;
            } else if (nums[i] - nums[i - 1] == 0) {

            } else {
                temp = 1;
            }
        }
        return max;
    }
}