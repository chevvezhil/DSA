package dsa.binarysearch;

public class KThMissingPositiveNumber {


	private static int missingK(int[]arr, int k) {
		
		int low = 1, high = arr.length-1;
		
		while(low <= high) {
			int mid = low +(high-low)/2;
			
			int missing = arr[mid] - (mid+1);
			
			if(missing < k)
				low = mid+1;
			else 
				high = mid-1;
		}
		
		return low+k;
		
	}
	
	
	public static void main(String[] args) {
		int[] vec = { 4, 7, 9, 10 };
		int n = 4, k = 4;
		int ans = missingK(vec, k);
		System.out.println("The missing number is: " + ans);
	}

}
