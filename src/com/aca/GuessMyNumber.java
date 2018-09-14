package com.aca;

import java.util.Random;

import java.util.Scanner;

public class GuessMyNumber {

	public static void main(String[] args) {
		//pick a random number
		
		int guess;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("I'm thinking of a number between 1 and 100 (including both).\n Can you guess what it is?\n Enter a number:");
		
		guess = (int) scanner.nextInt();
		
		Random random = new Random();
		int selectnumber = random.nextInt(100)+1;
		System.out.println("The number I was thinking of was" + " " + selectnumber);
		
		int difference= Math.abs(guess- selectnumber);
		System.out.println("You were off by:" + difference +   "\n \n ...Thank you for playing!");
	

	}

}
