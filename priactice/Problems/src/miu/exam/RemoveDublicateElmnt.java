package miu.exam;

import java.util.HashMap;

public class RemoveDublicateElmnt {
	
	public static void main(String[] args) {
		RemoveDublicateElmnt elm = new RemoveDublicateElmnt();
		int [] arr = {11,2,0,6,7,2,0,9,7,20};
		int[] newArray = elm.removeDublicate(arr);
		elm.print(newArray);
	}
	
	int[] removeDublicate(int[] array) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for (int i=0; i<array.length; i++) {
			if(!( map.containsKey(array[i])))
			map.put(array[i], i);
		}
		
		int[] ukArray = new int[map.size()];
		int index =0;
		for(int i: map.keySet()) {
			ukArray[index]	 = i;
			index ++;
		}
		return ukArray;
	}
	
	private void print(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
}
