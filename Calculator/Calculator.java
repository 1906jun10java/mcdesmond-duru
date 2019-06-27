package Calculator;
import java.util.Scanner;

import Calculator.InputParser;

public class Calculator {

	public static double calculator(double input, double input2) {
		Scanner sc = new Scanner(System.in);	
		InputParser number = new InputParser(sc);	
		
		System.out.println("Enter first number: ");
		input = number.getDouble();
		System.out.println("Enter second number: ");
		input2 = number.getDouble();
		
		double result = 0;
		

		String invalid;

		
		char dummy = number.getChar();
		
		switch (dummy) {
		case ('+'):
			result = input + input2;
			break;
		case ('-'):
			result = input - input2;
			break;
		case ('/'):
			result = input / input2;
			break;
		case ('*'):
			result = input * input2;
			break;
		case ('%'):
			result = input % input2;
			break;
		default:
			invalid = "invalid operation";
			break;
		}
		System.out.println(result);
		return result;
	}

}
