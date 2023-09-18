package dsa.binarysearch;

public class BinarySearch {
	
	private static int binarySearch(int[] nums, int target) {
		
		int start =0;
		int end = nums.length-1;
		
		while(start <= end) {
			
			int mid = start+(end - start) /2; 
			
			if(target < nums[mid]) {
				end = mid-1;
			}else if(target > nums[mid]) {
				start = mid +1;
			}else 
				return mid;
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int[] nums = new int[] {-40,-30,-80,0,10,20,50};
		System.out.println(binarySearch(nums, 50));
		
	}
}
