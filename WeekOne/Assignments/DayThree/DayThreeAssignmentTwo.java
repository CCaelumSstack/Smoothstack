/**
 * 
 */
package com.ss.weekone;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Carolina Caelum
 * @date February 24, 2021
 * Smoothstack Week One Day 3 Assignment Two
 * Append text to an existing file
 */
public class DayThreeAssignmentTwo {

	
	public static void main(String[] args) {
		DayThreeAssignmentTwo assignment = new DayThreeAssignmentTwo();
		System.out.print("Please input a directory path to a file: ");
		Scanner scanner = new Scanner(System.in);
		String path = scanner.nextLine();		
		System.out.print("Please input text to append: ");
		String text = scanner.nextLine();	
		BufferedWriter buf = null;
		try {
			buf = new BufferedWriter(new FileWriter(path, true));
			buf.write(text);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		} finally {
			try {
				buf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
