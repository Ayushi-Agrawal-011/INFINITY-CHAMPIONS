package INFINITY_CHAMPIONS.WEEK1;
import java.util.*;
public class FIRST_MISSING_POSITIVE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println(firstMissingPositive(nums));
	}
	 public static  int firstMissingPositive(int[] nums) {
		    TreeSet<Integer> set=new TreeSet<>();
		    for(int i=0;i<nums.length;i++){
		        if(nums[i]>0)
		        set.add(nums[i]);
		    }
		    if(!set.contains(1))
		  return 1;
		  for(int x:set){
		    if(!set.contains(x+1))
		    return x+1;
		  }
		  return -1;
		    }
}
