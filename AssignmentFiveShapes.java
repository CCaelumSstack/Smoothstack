package com.ss.weekone;

 /**
 * 
 * @author Carolina Caelum
 * @date February 23, 2021
 * Smoothstack Week One Core Java Assignment Five
 * Create a hierarchy with a shape interface with calculatearea 
 * and display methods.  Implement the interface in a rectangle,
 * circle, and triangle class.
 */
public class AssignmentFiveShapes {

	public static void main(String[] args) {
		System.out.println("Creating rectangle with width 10 and height 5");
		Rectangle rect = new Rectangle(10, 5);
		System.out.println("Displaying rectangle and calculating area to be " + rect.calculateArea());
		rect.display();
		
		System.out.println("Creating circle with radius 5");
		Circle circle = new Circle(5);
		System.out.println("Displaying circle and calculating area to be " + circle.calculateArea());
		circle.display();
		
		System.out.println("Creating equilateral triangle with side 10");
		Triangle triangle = new Triangle(10);
		System.out.println("Displaying triangle and calculating area to be " + triangle.calculateArea());
		triangle.display();
	}

}

class Rectangle implements AssignmentFiveIShape
{
	private double width = 0, height = 0;
	
	public Rectangle(int w, int h)
	{
		width = w;
		height = h;
	}

	public double calculateArea() {
		return width * height;
	}

	public void display() {
		if(height > 0)
		{
			for(int i = 0; i < width; i++)
			{
				System.out.print("-");
			}
		}
		System.out.println();
	    if(width == 1)
	    {
	    	System.out.println("|");
	    }
	    else if(width > 1)
	    {	
	    	for(int i = 0; i < height - 2; i++)
			{
	    		System.out.print("|");
	    		for(int j = 0; j < width - 2; j++)
				{
					System.out.print(" ");
				}
	    		System.out.println("|");
			}
	    }
		if(height > 1)
		{
			for(int i = 0; i < width; i++)
			{
				System.out.print("-");
			}
		}
		System.out.println();
	}
}

class Circle implements AssignmentFiveIShape
{
	private double radius = 0;
	
	public Circle(double r)
	{
		radius = r;
	}
	
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public void display() {
		System.out.println("o");
	}
}

class Triangle implements AssignmentFiveIShape
{
	double sideLength = 0;
	
	public Triangle(double sl)
	{
		sideLength = sl;
	}
	
	public double calculateArea() {
		//area of equilateral triangle
		return (Math.sqrt(3)/4) * Math.pow(sideLength, 2);
	}

	public void display() {
		System.out.println(" /\\ ");
		System.out.println("/  \\");
		System.out.println("____");
	}
}
