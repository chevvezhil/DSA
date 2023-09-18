package dsa.binarysearch;

public class OrderAgnosticBinarySearch {
	// If array is sorted but not sure about its sorted in ascending or descending
	// order

	private static int orderAgnosticBinarySearch(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;

		boolean isAsc = nums[start] < nums[end];

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (nums[mid] == target)
				return mid;

			if (isAsc) {
				if (target < nums[mid]) {
					end = mid - 1;
				} else if (target > nums[mid]) {
					start = mid + 1;
				}
			} else {
				if (target < nums[mid]) {
					start = mid + 1;
				} else if (target > nums[mid]) {
					end = mid - 1;
				}
			}

		}

		return -1;
	}

	public static void main(String[] main) {

		int[] nums = new int[] {10,9,8,7,4,3,2};
		System.out.println(orderAgnosticBinarySearch(nums, 50));
	}
}
