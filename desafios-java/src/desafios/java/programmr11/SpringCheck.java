package desafios.java.programmr11;

import java.util.Scanner;

public class SpringCheck {

	// Verifica se � a primavera ou n�o(20/03 � 20/06)
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
