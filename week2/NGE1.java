package INFINITY_CHAMPIONS.WEEK2;
import java.util.*;
public class NGE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[]nums1=new int[n];
	for(int i=0;i<n;i++) {
		nums1[i]=sc.nextInt();
	}
	int m=sc.nextInt();
	int[]nums2=new int[m];
	for(int i=0;i<m;i++) {
		nums2[i]=sc.nextInt();
	}

	}
	  public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		    int[]k= NGE(nums2);
		    int[]p=new int[nums1.length];
		      HashMap<Integer, Integer> map = new HashMap<>();
		        for (int i = 0; i < nums2.length; i++) {
		            map.put(nums2[i], k[i]);
		        }

		        int[] ans = new int[nums1.length];
		        for (int i = 0; i < nums1.length; i++) {
		            ans[i] = map.get(nums1[i]);
		        }

		        return ans;
		    }
		    public static int[] NGE(int[]nums){
		int[]ans=new int[nums.length];
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<nums.length;i++){
		    while(!st.isEmpty()&& nums[i]>nums[st.peek()]){
		        ans[st.pop()]=nums[i];
		    }
		    st.push(i);
		}
		while(!st.isEmpty()){
		    ans[st.pop()]=-1;
		}

		return ans;
		    }
}
