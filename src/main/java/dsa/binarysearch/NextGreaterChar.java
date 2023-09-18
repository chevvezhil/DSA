package dsa.binarysearch;

public class NextGreaterChar {

	// same as ceiling of number - Instead of num returning the char

	public char nextGreatestLetter(char[] letters, char target) {

		int start = 0, end = letters.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target < letters[mid])
				end = mid - 1;
			else
				start = mid + 1;

		}

		return letters[start % letters.length]; // As its wrap around

	}
}
