package miu.exam;

public class FunnyArray {
	
	public static void main(String[] args) {
		FunnyArray f = new FunnyArray();
		int[] arr = {12, 11, 5,13, 0, 5, 13};
		System.out.println(f.isFunny(arr));
	}
	
	
	int isFunny(int[] arr) {
		int funny = 0;
		if(arr[arr.length-1]==5) return 0;  // last value is 5 return 0
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==5) {
				if(arr[i+1]==13) {
					funny = 1;					
				}else {
					return 0;	
				}
			}
		}
		return funny;
	}

}

/*
1. An array arr is called Funny if every 5 in the array is immediately followed by 13, otherwise it
is not. write a function isFunny its signature is given below that takes an array of integers as
input that checks whether the array is funny or not. The function must return 1 if the array is
funny otherwise it returns 0.
int isFunny(int[] arr);
isFunny([1, 5, 32, 13]) → 0
isFunny([5, 11, 5,13, 0]) → 0
isFunny([12, 11, 5,13, 0]) → 1
isFunny([7, 4, 23,5]) → 0
isFunny([12, 11, 5,13, 0, 5, 13]) → 1

*/