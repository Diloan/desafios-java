package desafios.java.programmr11;

import java.util.Scanner;

public class SpringCheck {

	// Verifica se é a primavera ou não(20/03 à 20/06)
	public static void main(String[] args) {
		int month,day;

		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter month and day:");

		month = sc.nextInt();
		day = sc.nextInt();
		String situacao;

		if(month >= 3 && month <= 6 && day >= 1 && day <= 20){
			situacao = "Spring";
		}else{
			situacao = "Not Spring";
		}

		System.out.println("This is: " + situacao);

	}

}
