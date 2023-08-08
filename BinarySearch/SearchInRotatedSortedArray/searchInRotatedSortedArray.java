package BinarySearch.SearchInRotatedSortedArray;

public class searchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r){
            int mid = (l + r) / 2;
            if (nums[mid] == target)
                return mid;
//either line 10 if statement will work or line 17 will work
            if (nums[l] <= nums[mid]){//checking if the l's value is less than mid means we are in the sorted part
                if (target < nums[mid] && target >= nums[l])//now comparing target with the mid AND l pointers
                    r = mid - 1;//target should be less than the mid and greater than the l pointer which means that the pointer is clearly between [ 4 5 6 ], Then just update the r pointer
                else
                    l = mid + 1;//other wise l pointer
            }

            if (nums[mid] <= nums[r]){//other wise, check if mid is greater than the r pointer -> if mid is 0 and target is 1
                if (target > nums[mid] && target <= nums[r])//than the target should be greater than the mid cause it is correctly sorted part AND less than the r pointer
                    l = mid + 1;//if yes update the left pointer
                else
                    r = mid - 1;//else update the r pointer
            }
        }
        return -1;//if nothing matches return -1
    }
}//Assuming mid is 7 and target is 4 ->  [4 5 6 7 0 1 2]