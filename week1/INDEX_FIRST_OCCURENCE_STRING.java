package INFINITY_CHAMPIONS.WEEK1;
import java.util.*;
public class INDEX_FIRST_OCCURENCE_STRING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String haystack=sc.next();
String needle=sc.next();
System.out.println(strStr(haystack,needle));
System.out.println(strStr2(haystack,needle));

	}
	 public  static int strStr(String haystack, String needle) {
	        if(haystack.length()<needle.length())
	        return -1;
	      int idx=-1;
	      int i=0;
	      int j=0;
	      while(i<haystack.length() && j<needle.length()){
	if(haystack.charAt(i)==needle.charAt(j)){
	    if(j==0)
	    idx=i;
	    j++;
	     if( j==needle.length())
	return idx;
	i++;
	    
	}
	else {
	    if (j > 0) {               
	          i = idx+1;   
	        }
	        else
	        i++;
	                j = 0;
	                idx = -1;
	    
	}

	      } 
	    return -1; 
	    }
	 public static  int strStr2(String haystack, String needle) {
	        if(haystack.length()<needle.length())
	        return -1;
	      int idx=-1;
	      int i=0;
	     
	      while(i<=haystack.length()-needle.length() ){
	   int j=0;
	   while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
	   j++;
	   if(j==needle.length())
	   return i;
	   i++;}
	   return -1;
	    }

}
