public class Main {

    public static void main(String[] args) {
	// write your code here
        int h = 5;
        int w = 4;
        int[] hor = {3,1};
        int[] ver = {1};
        Solution sl = new Solution();
        int result = sl.maxArea(h, w, hor, ver);
        System.out.println(result);
    }
}
