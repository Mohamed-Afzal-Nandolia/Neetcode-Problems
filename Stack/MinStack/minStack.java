package Stack.MinStack;

public class minStack {
        Stack<Integer> stack = new Stack<>();
    Stack<Integer> min_stack = new Stack<>();
      
    public void push(int val) {
        if(min_stack.isEmpty() || val <= min_stack.peek()){
            min_stack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if(stack.peek().equals(min_stack.peek())){
            min_stack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {//we are only storing the min values in here
        return min_stack.peek();
    }
}//https://www.youtube.com/watch?v=WxCuL3jleUA&ab_channel=NickWhite

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */