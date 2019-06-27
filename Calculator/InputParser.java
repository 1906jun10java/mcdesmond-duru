package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputParser {

	private Scanner scan;

	public InputParser(Scanner scan) {
		this.scan = scan;
	}
	
	//This will continue to ask for input until the user's will is broken and he types a number
	//How would we grab an input like E or PI?
	public double getDouble() {
		//We are using the fact that an uninitialized, wrapped double will be null to 
		//continue the loop
		Double d = null;
		do {
			try { // try catch
				d = Double.parseDouble(scan.nextLine());
				//d is now set and no longer null
			} catch (NumberFormatException e) { //InputFormat earlier, the java console printed out NumberFormat
				System.out.println("Invalid input. Type a double followed by return.");
			}
		} while (d == null);
		return d;
	}
	
	//Logic more or less the same as above
	public char getChar() {
		Character c = null;
		String temp;
		do {
			try {
				// I wasn't sure how to check for an input that was two long except by parsing it out
				//from a string (+dlfajsdf would be valid input otherwise)
				temp = scan.nextLine();
				if(temp.length() > 1) {
					System.out.println("String too long, type a single operator");
					continue;
				}
				c = temp.charAt(0);
				if(!isOperator(c)) {
					System.out.println("Not an operator!  Try again.");
					//Since c was an invalid char type we have to set c to null again to continue the loop
					c = null;
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Type a double followed by return.");
			}
		} while (c == null);
		return c;
	}

	//just checks if a char is one of several values
	private boolean isOperator(Character c) {
		if(c == '%' || c == '/' || c == '*' || c == '+' || c == '-' || c == '!') {
			return true;
		}
		return false;
	}
	
	
	
}
