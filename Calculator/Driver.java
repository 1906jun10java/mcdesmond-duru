package Calculator;

import java.util.Scanner;

import Calculator.InputParser;

public class Driver {

	public static void main(String[] args) {
		getNum();


	}

	private static void getNum() {
		Scanner input = new Scanner(System.in);
		InputParser getInput = new InputParser(input);
		
		System.out.println("Please type the first number.");
		double test = getInput.getDouble();
		System.out.println("num was "+test);
		System.out.println("Please type a SINGLE character for the operation");
		char cTest = getInput.getChar();
		System.out.println("char was "+ cTest);
		//trying printf
		System.out.printf("Char was %c num was %f", cTest, test);
		
	}

}
