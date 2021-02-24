/**
 * 
 */
package com.ss.weekone;

/**
 * @author Carolina Caelum
 * @date February 22, 2021
 * Smoothstack Week One Core Java Assignment One
 */
public class AssignmentOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("1)");
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < i + 1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < 9; i++)
		{
			System.out.print(".");
		}
		System.out.println();
		System.out.println("2)");
		for(int i = 0; i < 10; i++)
		{
			System.out.print(".");
		}
		System.out.println();
		for(int i = 4; i > 0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("3)");
		for(int i = 0; i < 4; i++)
		{
			int numstars = 1 + (i * 2);
			for(int j = 0; j < (11-numstars)/2; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < numstars; j++)
			{
				System.out.print("*");
			}
			for(int j = 0; j < (11-numstars)/2; j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i = 0; i < 11; i++)
		{
			System.out.print(".");
		}
		System.out.println();
		System.out.println("4)");
		for(int i = 0; i < 12; i++)
		{
			System.out.print(".");
		}
		System.out.println();
		for(int i = 3; i >= 0; i--)
		{
			int numstars = 1 + (i * 2);
			for(int j = 0; j < (11-numstars)/2; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < numstars; j++)
			{
				System.out.print("*");
			}
			for(int j = 0; j < (11-numstars)/2; j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
