package validAnagram;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] store = new int[26];//this will give me 26 zeros in the array like. [0,0,0,0,0,0,0,0,0,0,0,0,...]

        for(int i = 0; i < s.length(); i++){
            store[s.charAt(i) - 'a']++;//this will get the index,(a in ascii is 97 and n in ascii 110 = 13) increment the value by ++ -> 1;[1,0,0,0,0,0,0,0,0,0,0,0,...]
            store[t.charAt(i) - 'a']--;//now t.charAt(i) - 'a' this is -> n - a -> 110 - 97 = 13. so in the 13th index -- the value;[1,0,0,0,0,0,0,0,0,0,0,0,0,-1...]
        }
        for(int j : store){
            if(j != 0) return false;
        }

        return true;
    }
}