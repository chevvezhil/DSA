package dsa.binarysearch;

public class PeakElement {
	
	private static int peakElentInMountainArray(int[]nums) {
		
		int start = 0;
		int end = nums.length-1;
		
		while(start < end) {
			
			int mid = start +(end - start)/2;
			
			if(nums[mid] > nums[mid+1]) {
				end = mid;
			}else if(nums[mid] < nums[mid+1])
				start = mid +1;
		}
		
		return nums[start];
	}


	public static void main(String[] args) {
		
		int[] nums = new int[] {1,2,3,4,5,4,3,1};
		System.out.println(peakElentInMountainArray(nums));
		
	}
}
