package miu;

public class UpCount {

	public static void main(String[] args) {
		UpCount count = new UpCount();
		int[] a = { 2, 3, 1, -6, 8, -3, -1, 2 }; // 5
		 //int[] a = {6,3,1}; //6
		 //int[] a = {1,2,-1,5,3,2,-3}; //20
		 
		int total = count.upCount(a, 5);
		System.out.println(total);

	}

	int upCount(int[] a, int n) {
		if (a.length == 0)
			return 0;
		int total = 0;
		int sum = a[0];
		if (sum > n) {
			total++;
		}
		for (int i = 1; i < a.length; i++) {		
			sum = sum + a[i];
			if (sum > n) {
				total++;
			}

		}
		return total;
	}
}
