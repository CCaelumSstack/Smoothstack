/**
 * 
 */
package com.ss.weekone;

/**
 * @author Carolina Caelum
 * @date February 24, 2021
 * Smoothstack Week One Day 4 Assignment One
 * Implement Singleton with double checked locking
 */

public class DayFourAssignmentOne {

	private static volatile DayFourAssignmentOne singleInstance = null;
	
	private DayFourAssignmentOne() {
		
	}
	
	public static void main(String[] args) {

	}
	
	public static DayFourAssignmentOne getInstance()
	{
		synchronized(singleInstance) {
			if(singleInstance == null)
			{
				singleInstance = new DayFourAssignmentOne();
			}
			return singleInstance;
		}
	}

}
