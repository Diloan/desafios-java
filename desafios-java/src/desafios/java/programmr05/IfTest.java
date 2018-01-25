package desafios.java.programmr05;

import java.util.Scanner;

public class IfTest {
	
	// Verifica quais dos dois números é o maior
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int maxNumber = 0; // variable to hold max of given two numbers
		System.out.println("Enter the first no:");
		int number1 = scanner.nextInt();
		System.out.println("Enter second number:");
		int number2 = scanner.nextInt();

		if (number1 > number2) {
			maxNumber = number1;
		} else {
			maxNumber = number2;
		}

		
		System.out.println("The Maximum No is:\n" + maxNumber);

	}

}
