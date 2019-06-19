/**
 * 
 */
package com.revature.wednesday;

/**
 * @author McDesmond
 *
 */
public class Wednesday {

	/**
	 * @return 
	 * 
	 */

	public static String reverse (String str){
		str = "racecar";
		String blank = "";
		char[] stringCharArray = str.toCharArray(); 
		
		for (int i = stringCharArray.length - 1; i >= 0; i-- ) {
			System.out.println(stringCharArray[i]);

			blank = blank + stringCharArray[i];
			
			System.out.println(blank);
		}
		
		
		if ( str.equals(blank) ) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");	
		}
		
		System.out.println(stringCharArray);
		return str;
		// TODO Auto-generated constructor stub
	}
	public boolean isPalindrome(String str) {

		
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
