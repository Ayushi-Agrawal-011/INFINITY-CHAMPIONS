package INFINITY_CHAMPIONS.WEEK2;

public class Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack_Implementation_Using_Arr st=new Stack_Implementation_Using_Arr();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		st.Display();
		st.pop();
		st.Display();
		System.out.println(st.peek());
	}

}
