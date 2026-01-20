package INFINITY_CHAMPIONS.WEEK2;
import java.util.*;
import java.util.Scanner;

public class Help_Classmates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]nums=new int[n];
	for(int i=0;i<n;i++) {
		nums[i]=sc.nextInt();
	}
	int[]res=help_classmate(nums,n);
	for(int i=0;i<res.length;i++) {
		System.out.print(res[i]+" ");
	}
	}
	public static int[] help_classmate(int arr[], int n) {
        // Your code goes here
        int []ans=new int[n];
		Stack<Integer> st=new Stack<>();
		for(int i=n-1;i>=0;i--) {
		while(!st.isEmpty() && arr[i]<=st.peek()) {
			st.pop();
		}
		if(st.isEmpty()) {
			ans[i]=-1;
			
		}
		else
			ans[i]=st.peek();
		st.push(arr[i]);
		}
		return ans;
    }

}
