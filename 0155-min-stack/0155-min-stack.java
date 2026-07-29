class MinStack {
    Stack<Long> stack;
    long min ;

    public MinStack() {
       stack = new Stack<>();
        
    }
    
    public void push(int value) {
        long val = value;
        if(stack.isEmpty()) {
        min= val;
        stack.push(min);
        }
       else{
        if(value<min) { 
            stack.push(2L*val-min);
            min= val;
        }else stack.push(val);
       }
        
    }
    
    public void pop() {
      long removed = stack.pop();
      if(removed<min) min = 2L*min -removed;
        
    }
    
    public int top() {
        long t =stack.peek();
      if(t>min) return (int)t;
      else return (int)min;
        
    }
    
    public int getMin() {
        return (int)min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */