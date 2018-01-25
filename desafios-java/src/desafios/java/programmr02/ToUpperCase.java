package desafios.java.programmr02;
import java.io.*;
import java.util.Scanner;

public class ToUpperCase {

	// Coloca a string dada em upperCase
	  public static void main(String[] args) throws IOException
	  {
	   
	    String str;
	    String upper;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter a string:"); 
	    str = br.readLine();
	    str = str.toUpperCase();
	   

	    System.out.println("Uppercase conversion:" + str);
	    
	  }
	}


