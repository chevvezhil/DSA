package dsa.binarysearch;

public class FindElementInInfiniteSortedArray {

	// find the range first by startign with window size 1 and increase it by double

	private static int ans(int[] nums, int target) {

		int start = 0;
		int end = 1;

		while (target > nums[end]) {
			int newStart = end + 1;
			end = end + (end - start + 1) * 2; //doubling the window size
			start = newStart;
		}

		return binarySearch(nums, start, end, target);
	}

	private static int binarySearch(int[] nums, int start, int end, int target) {

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

		int[] nums = new int[] { -40, -30, -80, 0, 10, 20, 50 };
		System.out.println(ans(nums, 50));

	}
}
