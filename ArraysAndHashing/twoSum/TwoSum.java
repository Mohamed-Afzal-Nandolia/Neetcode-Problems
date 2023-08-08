package ArraysAndHashing.twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
The intuition is that if target - nums[0] = 7 is present in the hash map or not,
if not then we add nums[0] as key and index as the value.
At some point lets say in the second iteration, target - nums[1] = 2,
this 2 is present in the hashmap, how? cause in the first iteration 9 - 2 = 7,
as 7 is not present in the hashmap, we add (2, i) to the map. And in the second iteration,
9 - 7 = 2, as this 2 is present in the map that will be our ans.
 */
