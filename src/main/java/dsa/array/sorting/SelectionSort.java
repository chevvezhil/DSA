package dsa.array.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		//Place the smallest number in the front

		int[] array = new int[] { 25, 34, 65, 1, 90, 45 };


		for (int i = 0; i < array.length-1; i++) {
			int smallIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[smallIndex]) {
					smallIndex = j;
				}
			}

			int smallNum = array[smallIndex];
			array[smallIndex] = array[i];
			array[i] = smallNum;

		}

		for (int i : array) {
			System.out.print(i + " ");
		}
	}

}
