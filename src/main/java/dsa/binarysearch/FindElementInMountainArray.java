package dsa.binarysearch;

public class FindElementInMountainArray {

	
	private static int findPeakElement(int[] nums) {
		
		int start =0;
		int end = nums.length;
		
		while(start < end) {
			
			int mid = start +(end-start)/2;
			
			if(nums[mid] > nums[mid+1])
				end = mid;
			else
				start = mid+1;
		}
		
		return start;
	}
	
	private static int orderAgnosticBS(int[]nums, int start, int end, int target) {
		
		boolean isAsc = nums[start] < nums[end];
		
		while(start <= end) {
			int mid = start +(end-start)/2;
			
			if(nums[mid] == target)
				return mid;
			
			if(isAsc) {
				
				if(nums[mid] > target)
					end = mid-1;
				else
					start = mid+1;
			}else {
				if(nums[mid] > target)
					start = mid+1;
				else 
					end = mid-1;
			}
		}
				return -1;
		
	}
	
public static void main(String[] args) {
		
		int[] nums = new int[] {1,2,3,4,5,4,3,1};
		
		int peakIndex = findPeakElement(nums);
		int ans = orderAgnosticBS(nums,0,peakIndex,3);
		if(ans == -1)
			ans = orderAgnosticBS(nums, peakIndex+1, nums.length, 3);
		
		System.out.println(ans);
		
	}
}
