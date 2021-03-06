package miu.exam;

public class NiceArray {

	public static void main(String[] args) {
		NiceArray nice = new NiceArray();
		int[] arr = {12, 11, 5 };
		System.out.println(nice.isNice(arr));
	}

	int isNice(int[] arr) {
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int comparedValue = arr[i]; // put this value in memory
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				if (j != i) {
					sum = sum + arr[j];
				}

			}
			if (comparedValue < sum) {
				result = 1;
			} else {
				return 0;

			}
		}

		return result;

	}

}

/*
 * 
 * 
 * 2. An array arr is called isNice if every element in the array is less than
 * the sum of other elements in the array. write a function isNice its signature
 * is given that takes an array of integers as input and checks whether the
 * given array, arr, is Nice or not. The function returns 1,if the array is Nice
 * otherwise it returns 0. int isNice(int[] arr); isNice([1, 5, 32]) → 0
 * isNice([3,10,12]) → 1 isNice([12, 11, 0]) → 0 isNice([7, 4, 23,5]) → 0
 * isNice([12, 11, 5]) → 1
 */
