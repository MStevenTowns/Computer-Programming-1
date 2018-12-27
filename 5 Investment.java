/*
M. Steven Towns
Assignment 5
Part 3
7/20/2013
*/

import java.util.Scanner;

//This class calculates the future value of an investment
public class Investment
{
//This method takes the input and calculates the future value and prints it out
	public static double calculations(double investment, double rate, double term)
	{
		double rate2=rate/100.0;
		double multiplyer=(rate2+1.0);
		double yield = (investment*(multiplyer));
		for (int i=0;i<term-1;i++)
		{
			yield=(yield*(multiplyer));
		}
		yield=(double)(Math.round(yield*100))/100;
		System.out.println("The future value of the investment is: $"+yield+".");
		return yield;
	}
//this method takes input from the user and sends it to the other method
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("What is the initial investment?");
		double investment=sc.nextDouble();
		System.out.println("What is the percent interest rate for the investment?");
		double rate=sc.nextDouble();
		System.out.println("What is the investment term?");
		double term=sc.nextDouble();
		calculations(investment,rate,term);
	}
}