package INFINITY_CHAMPIONS.WEEK2;
import java.util.*;
public class Valid_Paranthes_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(checkValidString(s));
	}
	  public static  boolean checkValidString(String s) {
	      Stack<Integer> p=new Stack<>();
	      Stack<Integer> star=new   Stack<>();
	      for(int i=0;i<s.length();i++){
	        char ch=s.charAt(i);
	        if(ch=='(')
	        p.push(i);
	        else if(ch=='*')
	        star.push(i);
	        else{
	            if(!p.isEmpty())
	            p.pop();
	           else if(!star.isEmpty())
	            star.pop();
	            else{
	                return false;
	            }

	        }
	      }
	      while(!p.isEmpty() && !star.isEmpty()){
	         if (p.peek() > star.peek()) return false; // '(' comes after '*', can't match
	            p.pop();
	            star.pop();
	      }
	      return p.isEmpty();
	    }
}
