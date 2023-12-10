package dsa.educosys.dp.one_d;

import java.util.Arrays;

public class Fibonacci {

	
	static int bottomUp(int n) {
		
		int[] dp = new int[n+1];
		dp[0] =0; dp[1] =1;
		
		for(int i=2;i<=n;i++)
			dp[i] = dp[i-1] + dp[i-2];
		
		return dp[n];
	}
	
	static int  topDown(int n,int[] dp) {
		
		if(n<2) return n;
		if(dp[n] != -1)
			return dp[n];
		
		return dp[n] = topDown(n-1,dp)+topDown(n-2,dp);
	}
	
	public static void main(String[] args) {
		
		int n =8;
		
		System.out.println( bottomUp(n));
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println( topDown(n,dp));
	}
}
