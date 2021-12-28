package leetcode;

public class ReverseInteger {
	
	public static void main(String[] args) {
		ReverseInteger r = new ReverseInteger();
		System.out.println(r.reverse(1702));
	}
	
	public int reverse(int x) {
		int reversed =0;
		int pop;
		
		while(x != 0) {
			pop = x % 10;  // 123 will be 12.3 return 3
			// decrease x
			x = x /10;
			
			// set boundaries
			if(reversed > Integer.MAX_VALUE/10 || reversed == Integer.MAX_VALUE/10 && pop >7) return 0;
			if(reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE/10 && pop < -8) return 0;
			
			reversed = (reversed*10) +pop;
			
		}
		
		
		return reversed;
	}

}

/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside
 the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * */
