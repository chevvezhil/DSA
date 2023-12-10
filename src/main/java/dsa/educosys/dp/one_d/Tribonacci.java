package dsa.educosys.dp.one_d;

import java.util.Arrays;

public class Tribonacci {
	
	static int bottomUp(int n) {
		
		int[] dp = new int[n+1];
		dp[0] =0; dp[1] =1; dp[2] =1;
		
		for(int i=3;i<=n;i++)
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		
		return dp[n];
	}
	
	static int  topDown(int n,int[] dp) {
		
		if(n<2) return n;
		if( n ==2) return 1;
		if(dp[n] != -1)
			return dp[n];
		
		return dp[n] = topDown(n-1,dp)+topDown(n-2,dp) + topDown(n-3,dp);
	}
	
	public static void main(String[] args) {
		int n =8;
		
		System.out.println( bottomUp(n));
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println( topDown(n,dp));
	}

}
