package ArraysAndHashing.groupAnagrams;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();//corner case

        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){//eat
            char[] ca = s.toCharArray();//e,a,t
            Arrays.sort(ca);//a,e,t
            String keyString = String.valueOf(ca);//aet

            if(!map.containsKey(keyString)) map.put(keyString, new ArrayList<>());//here I check if my map has this key or not
            map.get(keyString).add(s);//this will store the common keys and their original strings
        }
        return new ArrayList<>(map.values());//here while returning we are only asking for the values inside the map and not the keys.
    }
}
