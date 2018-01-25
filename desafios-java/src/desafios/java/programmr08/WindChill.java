package desafios.java.programmr08;

import java.util.Scanner;

public class WindChill {
	
	// Calcula o frio do vento, tendo como entrada a temperatura(F) e velocidade do vento
	public static void main(String[] args) {
		 double temp, wind_speed,wind_chill=0;
         
	        System.out.println("Enter temperature and wind speed: ") ;
	        Scanner sc = new Scanner(System.in);
	        temp = sc.nextDouble();
	        wind_speed = sc.nextDouble();

	        wind_chill = 35.74 + 0.6215 * temp + (0.4275*temp - 35.75) * Math.pow(wind_speed,0.16);

	        System.out.println("Wind chill is: " + wind_chill);

	}

}
