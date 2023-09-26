package dsa.binarysearch;

import java.util.Arrays;

public class AggressiveCows {
	
	/*
	 * Problem Statement: You are given an array ‘arr’ of size ‘n’ which denotes the
	 * position of stalls. You are also given an integer ‘k’ which denotes the
	 * number of aggressive cows. You are given the task of assigning stalls to ‘k’
	 * cows such that the minimum distance between any two of them is the maximum
	 * possible. Find the maximum possible minimum distance.
	 */
	private static boolean canWePlaceCows(int[]nums, int distance, int k) {
		
		int noOfCows =1;
		int last = nums[0];
		for(int i=1;i<nums.length;i++) {
			
			if(nums[i] -last >=distance)
			{
				noOfCows++;
				last = nums[i];
			}
			
			if(noOfCows >= k)
				return true;
		}
		return false;
	}
	
	
	private static int maxOfPossibleDistance(int[] nums, int k) {
		
		Arrays.sort(nums);
		
		int low =1; //Considering the minimum distance
		int high = nums[nums.length-1] - nums[0];
		
		while(low <= high) {
			
			int mid = low +(high-low)/2;
			
			if(canWePlaceCows(nums,mid,k) == true)
				low = mid+1;
			else
				high = mid-1;
		}
		return high;
		
	}
	
	public static void main(String[] args) {
		int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = maxOfPossibleDistance(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
	}

}
