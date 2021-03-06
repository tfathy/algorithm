package miu.exam;

public class HappyPrime {
	
	public static void main(String[] args) {
		
		HappyPrime h = new HappyPrime();
		int p = h.isPrimeHappy(25);
		System.out.println(p);
		
		
	}
	
	int isPrimeHappy(int n) {
		if(n <2 ) return 0;
		int sum = 0;
		for(int i= 2; i< n ; i++) {
			if(isPrime(i)) {
				sum= sum+ i;
				if(sum % n == 0) {
					return sum/n;
				}
			}
		}
		return 0;
		
	}
	
	private boolean isPrime(int n) {

		for (int i=2;i<n;i++) {
			int rem = n % i;
			if(rem == 0) {
				return false;
			}
		}
		return true;
		
	}

}


/********************************************************************************************************************************
A number n is called prime happy if there is at least one prime less than n and the sum of all primes less
than n is evenly divisible by n.
Recall that a prime number is an integer > 1 which has only two integer factors, 1 and itself
The function prototype is int isPrimeHappy(int n);
For example

 25 is Happy Prime because 2, 3, 5, 7, 11, 13, 17, 19, 23 are the primes less than 25, their sum is 100 and 25 evenly divides 100

**************************************************************************************************************************************/ 
