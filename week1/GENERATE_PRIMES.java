package INFINITY_CHAMPIONS.WEEK1;

import java.util.Scanner;

public class GENERATE_PRIMES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(countPrimes(n));
	}
	 public static int countPrimes(int n) {
	        if(n<=2)
	        return 0;
	        return fn(n);
	    }
	    public static  int fn(int n){
	        int[]ans=new int[n];
	        ans[0]=1;
	        ans[1]=1;
	        for(int i=2;i*i<=n;i++){
	            if(ans[i]==0){
	                for(int j=2;i*j<n;j++){
	                    
	                    ans[i*j]=1;
	                }
	            }
	        }
	        int c=0;
	        for(int i=2;i<n;i++){
	            if(ans[i]==0)
	            c++;
	        }
	        return c;
	    }

}
