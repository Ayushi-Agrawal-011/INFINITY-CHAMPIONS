package INFINITY_CHAMPIONS.WEEK2;

public class Stack_Implementation_Using_Arr {
private  int[]arr;
private  int idx=-1;
	public  Stack_Implementation_Using_Arr() {
		// TODO Auto-generated method stub
		arr=new int[5];
	}
	public  Stack_Implementation_Using_Arr(int n) {
		// TODO Auto-generated method stub
		arr=new int[n];
	}
	public  void push(int val) throws Exception{
		if(idx==arr.length-1) {
		throw new Exception("stack is full");
		}
	
		idx++;
		arr[idx]=val;
		
	}
	public  int pop() throws Exception{
		if(idx==-1) {
		throw new Exception("stack is empty");
		}
		int val=arr[idx];
		idx--;
		return val;
		
	}
	public  int peek() throws Exception{
		if(idx==-1) {
		throw new Exception("stack is empty");
		}
		int val=arr[idx];
		return val;
		
	}
	public  int size() {
		return idx+1;
	}
	public boolean isfull() {
		return idx==arr.length-1;
	}
	public  boolean isEmpty() {
		return idx==-1;
	}
	public  void Display() {
		for(int i=0;i<=idx;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	

}
