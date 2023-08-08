package SlidingWindow.PermutationInString;

public class permutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1 > l2) return false;

        int[] arr = new int[26];

        for(int i = 0; i < l1; i++){
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }
        if(allZeros(arr)) return true;

        for(int i = l1; i < l2; i++){
            arr[s2.charAt(i) - 'a']--;
            arr[s2.charAt(i-l1) - 'a']++;
            if(allZeros(arr)) return true;
        }
        return false;
    }
    private boolean allZeros(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) return false;
        }
        return true;
    }
}
