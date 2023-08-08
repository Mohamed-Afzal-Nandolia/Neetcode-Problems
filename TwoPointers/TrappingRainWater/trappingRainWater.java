package TwoPointers.TrappingRainWater;

class TrappingRainWater {
    public static int trap(int[] height) {
        int maxLeft = 0, maxRight = 0, l = 0, r = height.length - 1, waterCount = 0;

        while(l < r){
            maxLeft = Math.max(maxLeft, height[l]);
            maxRight = Math.max(maxRight, height[r]);
            if(height[l] <= height[r]){
                l++;
                if(maxLeft - height[l] > 0){
                    waterCount += maxLeft - height[l];
                }
            }
            else if(height[l] >= height[r]){
                r--;
                if(maxRight - height[r] > 0){
                    waterCount += maxRight - height[r];
                }
            }
        }
        return waterCount;
    }
}
