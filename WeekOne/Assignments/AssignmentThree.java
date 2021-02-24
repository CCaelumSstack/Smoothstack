/**
 * 
 */
package com.ss.weekone;
import java.util.Scanner;

/**
 * @author Carolina Caelum
 * @date February 23, 2021
 * Smoothstack Week One Core Java Assignment Three
 * Take values from command line and show the sum
 */
public class AssignmentThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		
		String rawInput = "";
		boolean done = false;
		
		do
		{
			System.out.print("Enter a number to be summed, or X to exit: ");
			rawInput = scanner.nextLine();
			if(rawInput.equals("X"))
			{
				done = true;
			}
			else
			{
				sum += Double.parseDouble(rawInput);
			}
		}
		while(!done);
		
		System.out.println("The sum is: " + sum);
	}

}
