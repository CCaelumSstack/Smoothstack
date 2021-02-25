/**
 * 
 */
package com.ss.weekone;

import java.io.File;
import java.util.Scanner;

/**
 * @author Carolina Caelum
 * @date February 24, 2021
 * Smoothstack Week One Day 3 Assignment One
 * list all files and directory names under a given directory
 */
public class DayThreeAssignmentOne {

	
	public static void main(String[] args) {
		DayThreeAssignmentOne assignment = new DayThreeAssignmentOne();
		System.out.print("Please input a directory path to get all child files and directories: ");
		Scanner scanner = new Scanner(System.in);
		assignment.listAllFilesInADirectory(scanner.nextLine(), true);
		System.out.println();
	}
	
	public void listAllFilesInADirectory(String directory, boolean firstLevel) {
		File file = new File(directory);
		String[] filenames = file.list();
		
		for(int i = 0; i < filenames.length; i++)
		{
			if(!firstLevel)
				System.out.print("    ");
			System.out.println(filenames[i]);
			File mysubfile = new File(directory + "\\" + filenames[i]);
			
			if(mysubfile.isDirectory())
			{
				this.listAllFilesInADirectory(directory + "\\" + filenames[i], false);
			}
		}
	}

}
