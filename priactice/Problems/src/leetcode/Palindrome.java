package leetcode;

import java.util.LinkedList;

public class Palindrome {

	
	
	  public boolean isPalindrome(int x) {
	        // convert this number to string
	        String str = String.valueOf(x);
	        // using stack data structure
	        LinkedList<Character> stack = new LinkedList<Character>();
	        //loop over this string
	        //populate the stack
	        for(int i=0; i<str.length(); i++){
	            char c = str.charAt(i);
	            stack.push(c);
	        }
	        
	        // now compose the revered staring
	        StringBuilder reveresed = new StringBuilder(stack.size());
	        // loop over the stack and pop the string
	        while(!stack.isEmpty()){
	            reveresed.append(stack.pop());
	        }
	        return reveresed.toString().equals(str);
	        
	        
	    }
}
