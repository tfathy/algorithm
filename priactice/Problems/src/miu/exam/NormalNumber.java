package miu.exam;

public class NormalNumber {

	public static void main(String[] args) {
		NormalNumber n = new NormalNumber();
		System.out.println(n.isNormal(20));
	}

	int isNormal(int n) {
		boolean odd = false;
		for (int i = 1; i < n; ++i) {
			if (n % i == 0) {
				odd = isOdd(i);
				if (odd) {
					return 0;
				}

			}
		}
		return 1;

	}

	boolean isOdd(int i) {
		if (i == 1)
			return false;
		
		return i % 2 > 0;
	}

}
