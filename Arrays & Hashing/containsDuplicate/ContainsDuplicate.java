package containsDuplicate;

import java.util.HashSet;
//to check distinct elements, you can use HashSet, which can tell if any integer is repeated
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])) return true;//if duplicate exists then return true

            else set.add(nums[i]);//else add it to the set
        }
        return false;//else return false
    }
}