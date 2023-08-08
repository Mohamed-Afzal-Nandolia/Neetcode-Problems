package Stack.GenerateParentheses;

public class generateParentheses {
        public List<String> generateParenthesis(int n) {
        List<String> output_arr = new ArrayList<>();
        backtracking(output_arr,"",0,0,n);
        return output_arr;
    }
    public void backtracking(List<String> output_arr, String current_string, int open, int close, int max){
        if(current_string.length() == max * 2){//if the length of the string "" is 3*2 = 6 then add it to the List
            output_arr.add(current_string);
            return;
        }
        if(open < max){
            backtracking(output_arr, current_string + "(", open + 1, close, max);
        }
        if(close < open){
            backtracking(output_arr, current_string + ")", open, close + 1, max);
        }
    }
}//https://www.youtube.com/watch?v=qBbZ3tS0McI&ab_channel=NickWhite