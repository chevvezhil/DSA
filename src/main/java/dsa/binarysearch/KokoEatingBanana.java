package dsa.binarysearch;

public class KokoEatingBanana {
	
	
	//Say
	private static int findTotalHours(int[]arr, int noOfBananaPerHour) {
		
		int totalHourToEatBanana = 0;
		
		for(int i=0;i<arr.length;i++) {
			totalHourToEatBanana += Math.ceil((double)arr[i]/(double)noOfBananaPerHour);
			
		}
		
		return totalHourToEatBanana;
		
	}
	
	private static int minEatingSpeed(int[] arr, int hours) {
		
		int start =1;
		int end =0;
		
		for(int n: arr)
			end = Math.max(n, end);
	
		while(start <= end) {
			
			int mid = start +(end-start)/2;
			
			int totalHours = findTotalHours(arr, mid);
			
			if(totalHours <= hours)
				end = mid-1;
			else
				start = mid+1;
		}
		
		return start;
		
	}
	
	public static void main(String[] args) {
		
		int[]  piles = {3,6,7,11};
		int h = 8;
		System.out.println(minEatingSpeed(piles,h));
	}

}
