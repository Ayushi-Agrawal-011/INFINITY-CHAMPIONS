package INFINITY_CHAMPIONS.WEEK1;
import java.util.*;
import java.util.Scanner;

public class MEDIAN_TWO_SORTED_ARRAYS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[]nums1=new int[n];
		for(int i=0;i<n;i++) {
			nums1[i]=sc.nextInt();
		}
		int[]nums2=new int[m];
		for(int i=0;i<m;i++) {
			nums2[i]=sc.nextInt();
		}
System.out.println(findMedianSortedArrays(nums1,nums2));
	}
	 public static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
	       int c=0;
	       int[]arr=new int[nums1.length+nums2.length];
	       for(int i=0;i<nums1.length;i++){
	        arr[c]=nums1[i];
	        c++;
	       }
	       for(int i=0;i<nums2.length;i++){
	        arr[c]=nums2[i];
	        c++;
	       }
	       Arrays.sort(arr);
	       int len=nums1.length+nums2.length;
	       if(len%2!=0)
	       return (double)arr[len/2];
	       double a=(double)arr[len/2];
	       double b=(double)arr[(len/2)-1];
	       return (double)(a+b)/2;
	       
	    }
}
