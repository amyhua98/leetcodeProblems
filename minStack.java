class MinStack {
    ArrayList<Integer> list;
    ArrayList<Integer> min;
    
    /** initialize your data structure here. */
    public MinStack() {
        list = new ArrayList<>();
        min = new ArrayList<>();
        
    }
    
    public void push(int val) {
        if(min.size() == 0 || min.get(min.size() - 1) >= val){
            min.add(val);
        }
        list.add(val);
    }
    
    public void pop() {
        if(list.get(list.size() - 1).equals(min.get(min.size()-1))){
            min.remove(min.size() - 1);
        }
        list.remove(list.size()-1);
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        return min.get(min.size() - 1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */