package SlidingWindow.SlidingWindowMaximum;

public class slidingWindowMaximum {
        public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || k <= 0) return new int[0];
        int n = nums.length;
        int[] arr = new int[n-k+1];//cause we only need that much
        int j = 0;//for the iteration of the arr
        Deque<Integer> q = new ArrayDeque<>();
        //doubly linked list
        for(int i = 0; i < nums.length; i++){
            // remove numbers out of range k
            while(!q.isEmpty() && q.peek() < i - k + 1){
                q.poll();//removes the first element
            }
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
            // remove smaller numbers in k range as they are useless
                q.pollLast();//removes the last element
            }
            q.offer(i);//offer means add
            if(i >= k - 1){
                arr[j++] = nums[q.peek()];
            }
        }
        return arr;
    }
}//nums = [1,3,-1,-3,5,3,6,7], k = 3