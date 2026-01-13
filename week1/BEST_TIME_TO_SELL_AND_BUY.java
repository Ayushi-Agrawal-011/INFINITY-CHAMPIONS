package INFINITY_CHAMPIONS.WEEK1;

import java.util.Scanner;

public class BEST_TIME_TO_SELL_AND_BUY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
System.out.println(maxProfit(nums));
System.out.println(maxProfit2(nums));
	}
	public static  int maxProfit(int[] nums) {
	      int buy=nums[0];
	      int profit=0;
	      for(int i=1;i<nums.length;i++){
	        if(nums[i]<buy)
	        buy=nums[i];
	        else if(nums[i]-buy>profit)
	        profit=nums[i]-buy;
	      }
	      return profit;
	    }
	public static  int maxProfit2(int[] nums) {
		int profit=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				profit=Math.max(profit,nums[j]-nums[i]);
			}
		}
		return profit;
	}
}
