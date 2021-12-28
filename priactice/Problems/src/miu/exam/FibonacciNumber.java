package miu.exam;

public class FibonacciNumber {
	int firstNumber =1 ,secondNumber=1,total=0;
	public static void main(String[] args) {
		FibonacciNumber f = new FibonacciNumber();
		int num = f.closestFibonacci(13); // must return 8
		
		System.out.println(num);
		
	}
	
	int closestFibonacci(int n) {	
		if(n<1) return 0;		
		total = firstNumber +secondNumber; // 1+1 =2 
		firstNumber =secondNumber;	  // a = 1
		secondNumber =total;	 // b= 2
		if(total>n) return total-firstNumber;
		int result = closestFibonacci(n);		
		return result;
	}

}




/************************************************************************************************************************************
       The Fibonacci sequence of numbers is 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The first and
       second numbers are 1 and after that ni = ni-2 + ni-1, e.g., 34 = 13 + 21. A number in the
     sequence is called a Fibonacci number. Write a method with signature int
closestFibonacci(int n)
     which returns the largest Fibonacci number that is less than or
      equal to its argument. For example, closestFibonacci(13) returns 8 because 8 is the
      largest Fibonacci number less than 13 and closestFibonacci(33) returns 21 because 21 is
     the largest Fibonacci number that is <= 33. closestFibonacci(34) should return 34. If the
      argument is less than 1 return 0. Your solution must not use recursion because unless you
       cache the Fibonacci numbers as you find them, the recursive solution recomputes the
      same Fibonacci number many times.
**************************************************************************************************************************************/