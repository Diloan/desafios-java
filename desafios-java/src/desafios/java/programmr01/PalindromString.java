package desafios.java.programmr01;
import java.io.*;

public class PalindromString  
{  
	//Verifica se a string dada é polidromo
	public static void main(String a[]) throws Exception  
	{  
		String strn;  
		int flag=0;  
		System.out.println("Enter the string:");  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		strn=br.readLine();  
		System.out.println("Result string is:");  

		String invertida = new StringBuilder(strn).reverse().toString();

		
		System.out.println(invertida);
		if(strn.equals(invertida))  {
			System.out.print("palindrome");  
		}else{   
			System.out.print("not a palindrome2");  

		}  
	}
}
