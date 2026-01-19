package INFINITY_CHAMPIONS.WEEK2;
import java.util.*;
public class Backspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();

String t=sc.next();
System.out.println(backspaceCompare(s,t));
	}
	 public static boolean backspaceCompare(String s, String t) {
	        String a=removeStars(s);
	        String b=removeStars(t);
	        
	        return a.equals(b);
	    }
	    public static String removeStars(String s) {
	        Stack <Character> st=new Stack<>();
	        for(int i=0;i<s.length();i++){
	            if(!st.isEmpty()){
	               
	                if(s.charAt(i)=='#')
	                   st.pop();
	                else
	                   st.push(s.charAt(i)); 
	            }
	            else if(st.isEmpty() && s.charAt(i)!='#')
	              st.push(s.charAt(i));
	        }
	       
	        String k="";
	        String p="";
	        while(!st.isEmpty()){
	            k+=st.pop();
	        }
	        for(int i=k.length()-1;i>=0;i--){
	            p+=k.charAt(i);
	        }
	      
	        return p;
	    }
}
