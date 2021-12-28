package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	Map<Character, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		RomanToInteger r = new RomanToInteger();
		int i = r.romanToInt("MCMXCIV");
		System.out.println(i);
	}

	public int romanToInt(String s) {
		int total = 0;
		populateMap();
		int[] nums = new int[s.length()];
		int prevValue = 0;
		int currentVal;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			currentVal = map.get(c); // get corresponding value for the Roman String
			nums[i] = currentVal; // put this value into the array. We will sum this array at the end
			// if the the previous number is less than the current number, then set the  change the previous to negative			
			if (i >= 1) {
				if (currentVal > prevValue) {
					prevValue = prevValue * -1;
					nums[i - 1] = prevValue;
				}
			}
			prevValue = currentVal;
		}
		// sum the array
		for (int i = 0; i < nums.length; i++) {
			total = total + nums[i];
		}

		return total;
	}

	private void populateMap() {
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}

}
