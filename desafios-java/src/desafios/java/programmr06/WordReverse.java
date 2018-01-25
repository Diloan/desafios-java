package desafios.java.programmr06;

import java.util.Scanner;

public class WordReverse {
	// Inverte uma String 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.print("Enter a string:\n"); 	
		String s; 	 
		s = input.nextLine();	
		String rev="";	  


		rev = new StringBuffer(s).reverse().toString();
		System.out.println("Reverse:\n"+ rev);
	}

}
