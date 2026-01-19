package INFINITY_CHAMPIONS.WEEK2;
import java.util.*;
public class Delete_mid_in_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        while(n-->0){
            int x=sc.nextInt();
//            System.out.print(x+" ");
            st.push(x);
        }
        deleteMid(st);
        System.out.println(st);
	}
	 public static void deleteMid(Stack<Integer> st) {
	        // code here
	        int c=0;
	        Stack<Integer> temp=new Stack<>();
	        int te=(int)Math.floor((st.size())/2);
	        while(c<te){
	           int x= st.pop();
	            c++;
	         
	            temp.push(x);
	        }
	        if(!st.isEmpty())
	        st.pop();
	        while(!temp.isEmpty()){
	            st.push(temp.pop());
	        }
	        
	    }
}
