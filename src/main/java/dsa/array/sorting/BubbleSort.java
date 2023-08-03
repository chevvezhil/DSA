package dsa.array.sorting;

import java.util.Arrays;

public class BubbleSort {

	//place the largest number in the end
	
	public static void main(String[] args) {
		
		int[] nums = new int[] {10,2,35,-1,3};
		
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-i-1;j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
	}
}
