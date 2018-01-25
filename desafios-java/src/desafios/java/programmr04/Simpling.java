package desafios.java.programmr04;

import java.util.Scanner;

public class Simpling {
	// Imprimie o intervalo entre os numeros dados
	public static void main(String[] args) {
		int M,N;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number and how many last samples u want:");
		N = sc.nextInt() - 1;
		M = sc.nextInt() + 1;

		if(N > M){
			for(int i = N; i > M; i-- ){
				System.out.print(i);

				N--;
			}


		}
	}
}
