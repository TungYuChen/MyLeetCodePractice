import java.util.Arrays;


class Solution {
    public static int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[] eff = new int[n];
        int[] oEff;
        int[] speedMax = new int[k];
        int[] effMax = new int[k];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            eff[i] = speed[i] * efficiency[i];
        }
        oEff = Arrays.copyOf(eff, n);
        Arrays.sort(oEff);
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                if (oEff[n - 1 - i] == eff[j]) {
                    speedMax[i] = speed[j];
                    effMax[i] = efficiency[j];
                }
            }
        }
        for (int i : speedMax)
            sum += i;

        Arrays.sort(effMax);
        return sum * effMax[0];
    }

    public static void main(String[] args) {
        int n = 6;
        int[] speed = {2,10,3,1,5,8};
        int[] efficiency = {5,4,3,9,7,2};
        int k = 3;
        System.out.println(maxPerformance(n, speed, efficiency, k));
    }
}