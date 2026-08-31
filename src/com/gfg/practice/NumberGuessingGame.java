package com.gfg.practice;

import java.util.Scanner;

/*
 * Requirement - System generates an random number which should be guessed by the user.
 *             - User has limited number of guesses
 *             - Hint will be given for every input by user as "Go higher" & "Go lower"
 */
public class NumberGuessingGame {
	public static void main(String[] args) {
		int guessingNumber = 37;
		int noOfChances = 5;
		int maxInput = 50;
		Scanner input = new Scanner(System.in);
		System.out.println("-------------Welcome to Number guessing game------------\n"
				+ "Rules:\n"
				+ "1. You only have 5 chances to guess.\n"
				+ "2. Number lies between 1 to 50\n"
				+ "---- Good Luck ----");
		
		for(int i = 1; i<=noOfChances; i++) {
			System.out.print("Guess " + i + ": ");
			int guessedNumber = input.nextInt();
			
			if(guessedNumber == guessingNumber && guessedNumber<=maxInput) {
				System.out.println("Congrats!!!");
				break;
			}else if(i==noOfChances && guessedNumber!=guessingNumber){
				System.out.println("You ran out of chances. Next Time!!!");
				break;
			}else if(guessedNumber >= guessingNumber && guessedNumber<=maxInput){
				System.out.println("Go lower");
			}else if(guessedNumber <= guessingNumber && guessedNumber<=maxInput) {
				System.out.println("Go higher");
			}else {
				System.out.println("Guess below " + maxInput);
			}
			
			if(i==noOfChances) 
				System.out.println("You ran out of chances. Next Time!!!");
			
		}
		input.close();
	}
}
