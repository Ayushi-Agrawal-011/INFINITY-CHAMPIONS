package INFINITY_CHAMPIONS.WEEK2;
import java.util.*;
public class MIN_STACK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> min;
	public List<Integer> st;
	    public MIN_STACK() {
	        min=new ArrayList<>();
	        st=new ArrayList<>();
	    }
	    
	    public void push(int val) {
	        st.add(val);
	        if(min.isEmpty() || min.get(min.size()-1)>=val)
	         min.add(val);
	    }
	    
	    public void pop() {
	        int a=st.remove(st.size()-1);
	        if(!min.isEmpty() && min.get(min.size()-1)==a)
	        min.remove(min.get(min.size()-1));
	    }
	    
	    public int top() {
	        return st.get(st.size()-1);
	    }
	    
	    public int getMin() {
	        return min.get(min.size()-1);
	    }
}
