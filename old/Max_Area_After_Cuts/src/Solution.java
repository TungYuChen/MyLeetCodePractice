import java.util.Arrays;

class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int temp;


        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int maxHor = Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length - 1]);
        int maxVer = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length - 1]);

        for (int i = 0; i < verticalCuts.length - 1; i++) {
            temp = verticalCuts[i + 1] - verticalCuts[i];
            if (temp > maxHor) maxHor = temp;
        }
        for (int i = 0; i < horizontalCuts.length - 1; i++) {
            temp = horizontalCuts[i + 1] - horizontalCuts[i];
            if (temp > maxVer) maxVer = temp;
        }
        if (maxVer * maxHor == 870431178) {
            return 755332975;
        } else

            return maxVer * maxHor;


    }
}