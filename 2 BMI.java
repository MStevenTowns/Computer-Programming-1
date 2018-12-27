/*
M. Steven Towns
Assignment 2
Part 4
6/25/2013
*/

import java.util.Scanner;

//A simple class used to calculate the BMI (Body Mass Index) of a person
public class BMI
{
	//The main method that will run when you execute the file
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Your Name:");
		String name=sc.nextLine();
		System.out.println("Your weight in pounds:");
		int weight=sc.nextInt();
		System.out.println("the feet portion of your height:");
		int y=sc.nextInt();
		System.out.println("the inch portion of your height:");
		int z=sc.nextInt();
		double h=((y*12)+z);
		double c=weight/(h*h);
		double bmi=(c*703.0695796391592783);
		System.out.println(""+name+", your BMI is "+bmi+".");
	}
}