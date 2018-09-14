package com.aca;

import java.util.Scanner;

public class SecondConverter {

	public static void main(String[] args) {
		
		int seconds;
		int minutes;
		int hours;
		int input;
		
		Scanner scanner= new Scanner(System.in);
		
		//ask for folks to put in seconds
	
		System.out.println("Put in the seconds!");
		
		input=scanner.nextInt();
		

		hours= input/3600;
		seconds= input% 3600;
		minutes = seconds/60;
		seconds= seconds%60;
		
		System.out.println("hours"+ hours);
		
		System.out.println("minutes"+ minutes);
		
		System.out.println("seconds" + seconds);
		
		
		
		
		
	}

}
