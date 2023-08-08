package BinarySearch.FindMinimumInRotatedSortedArray;

public class findMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        if(nums.length == 0) return 0;//edge cases
        if(nums.length == 1) return nums[0];//edge cases
        int l = 0, r = nums.length - 1;
        while(l < r){
            int mid = (l + r) / 2;

            if(mid > 0 && nums[mid] < nums[mid - 1]) //case when 0 is the mid
                return nums[mid];

            if(nums[mid] >= nums[l] && nums[mid] > nums[r])//if my mid is greater than l/r pointer then we search right ->
                l = mid + 1;//making the left pointer mid + 1 for the next iteration

            else r = mid - 1;
        }
        return nums[l];
    }
}