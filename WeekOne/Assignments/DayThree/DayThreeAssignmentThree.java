/**
 * 
 */
package com.ss.weekone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author Carolina Caelum
 * @date February 24, 2021
 * Smoothstack Week One Day 3 Assignment Three
 * Count number of times a phrase appears in a file
 */
public class DayThreeAssignmentThree {
	
	public static void main(String[] args) {
		DayThreeAssignmentTwo assignment = new DayThreeAssignmentTwo();
		System.out.print("Please input a directory path to a file: ");
		Scanner scanner = new Scanner(System.in);
		String path = scanner.nextLine();		
		System.out.print("Please input text to count instances of: ");
		String text = scanner.nextLine();	
		
		int count = 0;
		
		BufferedReader buf = null;
		String line = "";
		try {
			buf = new BufferedReader(new FileReader(path));
			line = buf.readLine();
			while(line != null && !line.equals(""))
			{
				count += countTimesInString(line, text);
				line = buf.readLine();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		} finally {
			try {
				buf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("The phrase " + text + " appeared " + count + " times.");
	}
	
	public static int countTimesInString(String string, String phrase)
	{
		int mycount = 0;
		if(string.contains(phrase))
		{
			mycount++;
			mycount += countTimesInString(string.substring(string.indexOf(phrase) + phrase.length()), phrase);
		}
		return mycount;
	}

}
