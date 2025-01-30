package TwoPointers;

public class Q11 {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int max = Integer.MIN_VALUE;

        while(l < r){
            int h = Math.min(height[l], height[r]);
            int b = r - l;
            max = Math.max(max, h * b);
            if(height[l] > height[r]) r--;
            else l++;
        }

        return max;
    }
}
