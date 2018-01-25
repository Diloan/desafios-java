package desafios.java.programmr10;

import java.util.Scanner;

public class Factorial {
	
	// Calcula o fatorial
	public static void main(String[] agrs)
	{
		int prod=1,num;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		int fatorial = 1;
		while(num > 1){
			fatorial *= num;
			num--;
		}


		System.out.println("Factorial is: " + fatorial);

	}
}
