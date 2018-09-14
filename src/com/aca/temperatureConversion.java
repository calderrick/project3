package com.aca;

import java.util.Scanner;

public class temperatureConversion {

	public static void main(String[] args) {
		
		double celsius = 0;
		double farenheit = 0;
		
		Scanner scanner = new Scanner(System.in);
	
		//ask for Temp in Celsius
		
		System.out.println("Type Celsius Temp for Farenheit Output");
		
		celsius= scanner.nextDouble();
		
		farenheit = (celsius * (9.0/5.0)) + 32;
		
		System.out.println("Multiple Decimal Places");
		System.out.println(celsius + "C = " + farenheit + "F");
		
		System.out.println("1 Decimal Place");
		System.out.printf("%.1f C= %.1f F", celsius, farenheit);

	}

}
