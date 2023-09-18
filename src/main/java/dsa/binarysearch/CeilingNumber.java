package dsa.binarysearch;

public class CeilingNumber {
	
	//return start if target is not found (because start will b the next smallest greater element in the array) 

	//For floor of the number- return end;
	private static int ceilingNum(int[]nums, int target) {
		
		int start = 0, end = nums.length-1;
		
		while(start <=end ) {
			int mid = start +(end - start)/2;
			
			if(nums[mid] == target) 
				return nums[mid];
			
			if(target < nums[mid]) {
				end = mid-1;
			}else if (target > nums[mid])
				start = mid+1;
		}
		
		return nums[start];
	}
	
	public static void main(String[] args) {
		
		int[] nums = new int[] {1,3,4,5,80,90};
		
		System.out.println(ceilingNum(nums, 76));
	}
	
}
