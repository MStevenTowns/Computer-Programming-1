/*
M. Steven Towns
Assignment 2
Part 3
6/25/2013
*/

import java.util.Scanner;

//A simple class used to count how many wheels you have
public class Vehicles
{
	//The main method that will run when you execute the file
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("For the following questions please use only numbers");
		System.out.println("How many cars do you have?");
		int x=sc.nextInt();
		System.out.println("How many motorbikes do you have?");
		int y=sc.nextInt();
		System.out.println("How many bicycles do you have?");
		int z=sc.nextInt();
		System.out.println("How many tricycles do you have?");
		int a=sc.nextInt();
		System.out.println("How many 4-wheelers do you have?");
		int b=sc.nextInt();
		System.out.println("How many unicycles do you have?");
		int c=sc.nextInt();
		System.out.println("How many small trailers do you have?");
		int d=sc.nextInt();
		System.out.println("How many large trailers do you have?");
		int e=sc.nextInt();
		System.out.println("How many wheelbarrows do you have?");
		int f=sc.nextInt();
		System.out.println("How many scooters do you have?");
		int g=sc.nextInt();
		int sum=(x*4)+(y*2)+(z*2)+(a*3)+(b*4)+c+(d*2)+(e*4)+f;
		System.out.println("You have "+sum+" wheels.");
	}
}