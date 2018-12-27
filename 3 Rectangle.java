/*
M. Steven Towns
Assignment 3
Part 2
7/2/2013
*/

import java.util.Scanner;

// A simple class used to print out a rectangle based on user input values
public class Rectangle
{
	//The main method that will run when you execute the file
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("I am going to draw a rectangle out of a character. What character do you want to use?");
		String sign=sc.next();
		System.out.println("How many characters high do you want the rectangle?");
		int high=sc.nextInt();
		System.out.println("How many characters wide do you want the rectangle?");
		int wide=sc.nextInt();
		int b=0;
		while (b<high)
		{
			int a=0;
			while (a<wide)
			{
				System.out.print(sign);
				a=a+1;
			}
			b=b+1; 
			System.out.println(); 
		}
		int total=high*wide;
		System.out.println("I printed "+sign+" "+total+" times.");
	}
}