package SlidingWindow.LongestRepeatingCharacterReplacement;

public class longestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();

        int left = 0, maxRepeat = 0, maxWindow = 0;

        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if(!map.containsKey(ch)) {
                map.put(ch, 0);
            }
            map.put(ch, map.get(ch) + 1);

            // IMPORTANT: maxRepeat is not the accurate number of dominant character, It is the historical maximum count
            // We do not care about it because unless it gets greater, it won't affect our final max window size.
            maxRepeat = Math.max(maxRepeat, map.get(ch));
            //maxRepeat is the window from left to right
            //maxRepeat gets the freq of the last added element
            if(right - left + 1 - maxRepeat > k) {//Sliding happens here
                char remove = s.charAt(left);
                map.put(remove, map.get(remove) - 1);
                left++;
            }
//the above if loops works when the window - maxRepeat > k, means the current window has more repeated 
//elements than allowed(k)

            maxWindow = Math.max(maxWindow, right - left + 1);
        }

        return maxWindow;
    }
}
