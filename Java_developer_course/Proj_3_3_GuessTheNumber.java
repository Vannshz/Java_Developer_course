package com.practice.Java_developer_course;

import java.util.Random;
import java.util.Scanner;

public class Proj_3_3_GuessTheNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ourGuess,computerNumber,guessCount=0;
		Random random=new Random();
		computerNumber=random.nextInt(100)+1;
		boolean guessNumber=false;

		while(!guessNumber)
		{
			System.out.println("Enter your integer guess");
			ourGuess=sc.nextInt();
			guessCount++;
			if(ourGuess>=1 && ourGuess<=100)
			{
				if(ourGuess==computerNumber) {
					System.out.println("Congratulatins! You guess the number in " + guessCount + " guesses! Thanks for playing!");
guessNumber=true;
				}
				else if(ourGuess>computerNumber)
					System.out.println("Your guess was too high!");
				else
					System.out.println("Your guess is too low!");


			}
			else
			{
				System.out.println("That was a wasted guess. You must pic the number between 1 to 100");

			}
		}

	}

}
