import java.util.PriorityQueue;

class Solution {
    PriorityQueue<Integer> ans = new PriorityQueue<>();
    public int minCostClimbingStairs(int[] cost) {

        int step = cost.length;
        int price = 0;
        minPrice(step, cost, price);
        return ans.poll();
    }

    public int minPrice(int step, int[] cost, int price) {
        if (step < 0) {
            ans.add(price);
            return 0;
        }
        if (step < cost.length)
            price += cost[step];
        if (step >= 0) {
            price += Math.min(minPrice(step - 1, cost, price), minPrice(step - 2, cost, price));
        }
        return price;
    }

}