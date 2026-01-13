package INFINITY_CHAMPIONS.WEEK1;

import java.util.Scanner;
import java.util.*;
public class T3SUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		
	List<List<Integer>> ans=threeSum(nums);
	for(List<Integer> ll:ans) {
		for(int v:ll) {
			System.out.print(v+" " );
		}
		System.out.println();
	}
		
	}
	public static  List<List<Integer>> threeSum(int[] nums) {
	       List<List<Integer>> res = new ArrayList<>();
	        Arrays.sort(nums);
	for(int i=0;i<nums.length;i++){
	    if(i>0 && nums[i]==nums[i-1])
	    continue;
	    int left=i+1;
	    int right=nums.length-1;
	    while(left<right){
	        int sum=nums[i]+nums[left]+nums[right];
	        if(sum>0)
	        right--;
	        else if(sum<0)
	        left++;
	        else{
	            List<Integer> ll=new ArrayList<>();
	            ll.add(nums[i]);
	            ll.add(nums[left]);
	            ll.add(nums[right]);
	            res.add(new ArrayList<>(ll));
	            left++;
	            while(left<right && nums[left]==nums[left-1])
	            left++;

	        }
	    }
	}
	       return res;   
	    }

}
