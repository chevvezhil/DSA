package dsa.binarysearch;

public class CapacityToShipPackage {
	
	
	private static int findDays(int[]nums , int capacity) {
		
		int load =0, days =1;
		
		for(int i=0;i< nums.length;i++) {
			
			if(load+nums[i] > capacity) {
				days = days+1;
				load = nums[i];
			}else
				load +=nums[i];
		}
		
		return days;
		
	}
	
	
	private static int findCapacity(int[] nums, int days) {
		
		int low =0, high =0;
		
		for(int i=0;i<nums.length;i++) {
			 low = Math.max(low, nums[i]);
			 high +=nums[i];
		}
		
		while( low <= high) {
			
			int mid = low +(high-low)/2;
			
			int noOfDays = findDays(nums,mid);
			
			if(noOfDays <= days)
				high = mid-1;
			else
				low = mid+1;
			
		}
		
		return low;
	}
	
	
	public static void main(String[] args) {
		
		int[] weights = {1,2,3,4,5,6,7,8,9,10};
		int days = 5;
		
		System.out.println("The least capacity to ship the weights is " + findCapacity(weights,days));
	}

}
