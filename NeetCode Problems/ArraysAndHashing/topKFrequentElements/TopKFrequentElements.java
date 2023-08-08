package ArraysAndHashing.topKFrequentElements;
import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.merge(i, 1, Integer::sum);//this method will add the element to the map if not present, if it is present then add 1 to the corresponding value
        }//this for loop will calculate the frequency of all the numbers

        Queue<Integer> maxHeap = new PriorityQueue((a,b) -> map.get(b) - map.get(a));//here the lamda expression is used to show how its going to store the values

        for(int key : map.keySet()){//looking into the keySet of map
            maxHeap.add(key);
        }

        int[] ans = new int[k];

        for(int i = 0; i < k; i++){
            ans[i] = maxHeap.poll();//.poll() will return the first element inside the Queue and add it to the ans array
        }
        return ans;
    }
}
