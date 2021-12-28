package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
	Map<Integer, Character> map = new HashMap<>();
	
	public static void main(String[] args) {
		IntegerToRoman r = new IntegerToRoman();
		String roman = r.intToRoman(255);
		System.out.println(roman);
	}
	
	 public String intToRoman(int num) {
		 if(num <= 0) return null; 
		 String romanValue = null;
		 populateMap();
		 int mod = 0; // last digit
		 while(num != 0) {
			 mod = num % 10; // 123 = 12.3 this return 3, the last digit
			 
			 
		 }
		 
		 return romanValue;
	        
	    }
	
	
	private void populateMap() {
		map.put(1,'I');
		map.put(5,'V');
		map.put(10,'X');
		map.put(50,'L');
		map.put(100,'C');
		map.put(500,'D');
		map.put(1000,'M');
	}
}
