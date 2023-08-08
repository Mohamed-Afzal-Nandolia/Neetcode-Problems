package Stack.LargestRectangleInHistogram;

public class largestRectangleInHistogram {
    
    public static int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        for(int i = 0; i <= len; i++){//index out of bounds
            int h = (i == len ? 0 : heights[i]);
            if(s.isEmpty() || h >= heights[s.peek()]){
                s.push(i);
            }
            else{
                int temp = s.pop();
                maxArea = Math.max(maxArea, heights[temp] * (s.isEmpty() ? i : i - 1 - s.peek()));
                i--;
            }
        }
        return maxArea;
    }
}