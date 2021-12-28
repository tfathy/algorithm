package miu;

public class PrimeCount {
	public static void main(String[] args) {
		PrimeCount p = new PrimeCount();
		int i = p.primeCount(10, 30);
		System.out.println(i);
	}

	int primeCount(int start, int end) {
		int counter = 0;
		if (start<0) start =1;
		// for better performance, use the square root of end
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				counter++;
			}

		}
		return counter;

	}

	private boolean isPrime(int n) {
		if(n==1) return false;
		boolean output = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				output= false;
			}

		}
		return output;
	}

}
