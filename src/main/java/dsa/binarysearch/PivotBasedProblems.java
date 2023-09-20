package dsa.binarysearch;

public class PivotBasedProblems {

	// Find pivot - This is the max element in array
	// Do BS from 0 to pivot and pivot+1 to end ( as both the sides will b in
	// ascending order)

	private static int findPivot(int[] nums) {

		int start = 0;
		int end = nums.length;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (mid < end && nums[mid] > nums[mid + 1])
				return mid;
			else if (mid > start && nums[mid] < nums[mid - 1])
				return mid - 1;

			if (nums[start] > nums[mid]) {
				end = mid - 1;
			} else
				start = mid + 1;

		}

		return -1;
	}
	
	private static int smallestElementinRotatedArray(int[]nums) {
		
		return nums[findPivot(nums)+1];
	}
	
	private static int noOftimesArrayRotated(int[] nums) {
		
		return findPivot(nums)+1;
	}

	private static int binarySearch(int[] nums,int start, int end, int target) {

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else
				return mid;
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] nums = new int[] {4,5,6,7,0,1,2};
		
		int pivot = findPivot(nums);
		int target =0;
	
		if(pivot == -1) {
			System.out.println(binarySearch(nums, 0,nums.length-1,0));
		}
		
		if(target >= nums[0]) {
			System.out.println(binarySearch(nums,0,pivot-1,target));
		}else {
			System.out.println(binarySearch(nums,pivot+1,nums.length-1,target));
		}
		
		System.out.println(smallestElementinRotatedArray(nums));
		System.out.println(noOftimesArrayRotated(nums));
		
	}
}
