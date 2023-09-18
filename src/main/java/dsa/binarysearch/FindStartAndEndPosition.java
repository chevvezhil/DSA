package dsa.binarysearch;

import java.util.Arrays;

public class FindStartAndEndPosition {

	private static int search(int[] nums, int target, boolean isStart) {

		int start = 0;
		int end = nums.length - 1;

		int ans = -1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				ans = mid;
				if (isStart) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

		}

		return ans;

	}

	public static void main(String[] args) {

		int[] nums = { 4, 5, 6, 7, 7, 7, 7, 7, 9 };
		int[] ans = { -1, -1 };

		ans[0] = search(nums, 7, true);

		if (ans[0] != -1)
			ans[1] = search(nums, 7, false);

		System.out.println(Arrays.toString(ans));
	}

}
