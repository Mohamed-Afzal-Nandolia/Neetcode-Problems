class ContainsWithMostWater {
    public static int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        while (l<r) {
            int minHeight = Math.min(height[l], height[r]);
            int width = r-l;
            max = Math.max(max, (minHeight*width));

            if (height[l] <= height[r]) l++;
            else if (height[l] > height[r]) r--;
        }
        return max;
    }
}