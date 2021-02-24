/**
 * 
 */
package com.ss.weekone;
import java.util.Random;

/**
 * @author Carolina Caelum
 * @date February 23, 2021
 * Smoothstack Week One Core Java Assignment Four
 * Construct a 2D array and find the max number and show its position in an array
 */
public class AssignmentFour {

	public static void main(String[] args) {
		int[][] intarray = new int[4][4];
		Random random = new Random();
		int max = 0;
		int maxipos = -1;
		int maxjpos = -1;
		
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.print("[");
				System.out.print(intarray[i][j] = random.nextInt(100) + 1);
				System.out.print("]");
				
				if(intarray[i][j] > max)
				{
					max = intarray[i][j];
					maxipos = i;
					maxjpos = j;
				}
			}
			System.out.println();
		}
		
		int x = maxjpos + 1;
		int y = maxipos + 1;
		
		System.out.println("The maximum value is " + max 
						+ " at position [" + x + "][" + y + "].");
		
		
	}

}
