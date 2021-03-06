package miu.exam;

import java.util.Arrays;

public class SecondLargestInArray {
	
	public static void main(String[] args) {
		SecondLargestInArray s = new SecondLargestInArray();
		int[] array = {2,0,-5,-11,-15};
		int num = s.getSecondLargest(array);
		System.out.println(num);
	}
	
	int getSecondLargest(int[] arr) {
		if(arr.length==0) return -1;
		if(arr.length==1) return arr[0];
		int[] temp = arr;
		sort(temp);
		return temp[0];
		
		
	}
	
	void sort(int[] arr){
		int len =  arr.length;
		for(int i= len-1 ; i>0; i--) {
			for(int j= 0; j<i; j++) {			
				if(arr[i]>arr[j]) {
				swap(arr,i,j);				
				System.out.println(Arrays.toString(arr));
			}
			}
			
		}
	}

	private void swap(int[] arr, int i, int j) {
		if(i==j) return;
		int temp = arr[i];
		arr[i] =arr[j];
		arr[j]= temp;
	}
}
