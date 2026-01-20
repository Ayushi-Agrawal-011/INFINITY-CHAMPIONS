package INFINITY_CHAMPIONS.WEEK2;
import java.util.*;
public class Remove_Outermost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();
System.out.println(removeOuterParentheses(s));
	}
	 public static String removeOuterParentheses(String s) {
	        StringBuilder sb=new StringBuilder();
	        Stack<Character> st=new Stack<>();
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            if(ch=='('){
	                if(!st.isEmpty())
	                sb.append(ch);
	                st.push(ch);
	            }
	            else{
	                char b=st.pop();
	                if(!st.isEmpty()){
	                    sb.append(ch);
	                }
	            }
	        }
	        return sb.toString();
	    }
}
