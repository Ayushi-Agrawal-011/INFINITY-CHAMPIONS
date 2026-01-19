package INFINITY_CHAMPIONS.WEEK2;
import java.util.*;
public class Reverse_string_using_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(reverse(s));
	}
	 public static  String reverse(String s) {
	        // code here
	        Stack<Character> st=new Stack<>();
	        StringBuilder sb=new StringBuilder();
	        for(int i=0;i<s.length();i++){
	            st.push(s.charAt(i));
	        }
	        while(!st.isEmpty()){
	            sb.append(st.pop());
	        }
	        return sb.toString();
	    }
}
