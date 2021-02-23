/**
 * 
 */
package com.ss.weekone;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Carolina Caelum
 * @date February 22, 2021
 * Smoothstack Week One Core Java Assignment Two
 */
public class AssignmentTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
		int numberOfGuesses = 0;
		int guess = 0;
		boolean foundNumber = false;
		do
		{
			if(numberOfGuesses == 0)
				System.out.print("Please guess a number from 1-100: ");
			else
				System.out.print("Please keep trying: ");
				
			guess = scanner.nextInt();
			numberOfGuesses++;
			
			if(Math.abs(randomNumber - guess) <= 10)
				foundNumber = true;
		}
		while(!foundNumber && numberOfGuesses < 5);
		
		if(!foundNumber)
			System.out.print("Sorry ");
		System.out.println("The number was " + randomNumber);
	}

}
