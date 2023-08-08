package Stack.EvaluateReversePolishNotation;

import java.util.Stack;

public class evaluateReversePolishNotation {//["2","1","+","3","*"]
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a, b;
        for(String s : tokens){
            if(s.equals("+")){
                stack.add(stack.pop() + stack.pop());
            }
            else if(s.equals("-")){
                b = stack.pop();
                a = stack.pop();
                stack.add(a - b);
            }
            else if(s.equals("*")){
                stack.add(stack.pop() * stack.pop());
            }
            else if(s.equals("/")){
                b = stack.pop();
                a = stack.pop();
                stack.add(a / b);
            }
            else{
                stack.add(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}/*
we didn't use stack.add(stack.pop - stack.pop()) cause the first pop element is always going to be 
the 5 (in the 2nd example) so 5 / 13 is 0, therefore we use a and b to store the values before doing the actual operation on them
*/