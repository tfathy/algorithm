package miu;

public class MadhavArray {

	public static void main(String[] args) {
		MadhavArray arr = new MadhavArray();
		int[] a1= {2,1,1};
		 int a=arr.isMadhavArray(a1);
		 System.out.println(a);
	}

	private int isMadhavArray(int[] a1) {
		int comparator = a1[0], index = 1, index_2 = 0;
		for (int i = 1; i < a1.length - 1; i = index_2 + 1) {
			if (i * 1 + index >= a1.length)
				return 0;
			if (!checkSum(a1, comparator, i, i * 1 + index))
				return 0;
			index_2 = i * 1 + index;
			index++;
		}
		return 1;
	}

	private boolean checkSum(int[] a1, int comparator, int index, int index_2) {
		int sum = 0;
		for (int i = index; i <= index_2; i++) {
			sum += a1[i];
		}
		if (sum != comparator)
			return false;
		return true;
	}

}
