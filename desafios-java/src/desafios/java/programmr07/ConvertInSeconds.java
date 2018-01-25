package desafios.java.programmr07;

import java.util.Scanner;

public class ConvertInSeconds {
	
	// Converte a hora dada em segundos
	public static void main(String[] args) {
		int hours=0,minutes=0,seconds=0,number_of_seconds=0;


		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of Hours:");
		hours=scan.nextInt();

		System.out.println("Enter number of Minuts:");
		minutes=scan.nextInt();

		System.out.println("Enter number of Seconds:");
		seconds=scan.nextInt();

		number_of_seconds = hours * 360 + minutes * 60 + seconds;

		System.out.println("Total number of seconds :");
		System.out.println(number_of_seconds);
	}

}
