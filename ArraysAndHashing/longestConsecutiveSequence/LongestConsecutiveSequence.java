package ArraysAndHashing.longestConsecutiveSequence;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int max = 0;
        Set set = new HashSet();
        for(int i : nums){
            set.add(i);
        }
        for(int i = 0; i < nums.length; i++){
            int count = 1;

            int num = nums[i];
            while(set.contains(--num)){
                count++;
                set.remove(num);
            }
            num = nums[i];
            while(set.contains(++num)){
                count++;
                set.remove(num);
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
/*
Intuition is add all the elements to the hashset and then, in a for loop, create a count variable = 1.
take the first number eg. 100 and check in the while loop that is 99 present in the set? if yes then count++ and remove that element.
like in ex = 4 -> in the first/second while loop, 3, 2, 1 are present in the set. therefore making the count = 4, then in the end
we get the Math.max(max, count) and return it.
*/
