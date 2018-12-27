/*
M. Steven Towns
Assignment 6
Part 1
8/16/2013
*/

import java.util.Scanner;

//This class preforms basic math functions
public class Operator
{
//This method runs when the file is executed
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean stop=false;
		while(!stop)
		{
			System.out.print("\nWhat is the first number? ");
			String num1=sc.next();
			double number1=0;
			double number2=0;
			try
			{
				number1=Integer.parseInt(num1);
				System.out.print("What is the second number? ");
				String num2=sc.next();
				try
				{
					number2=Integer.parseInt(num2);
					System.out.print("What is the operation? ");
					String operation=sc.next();
					//these test to see what operation needs to be preformed
					if(operation.equals("*"))
					{
						try
						{
							System.out.println(number1*number2);
						}
						catch(Exception e)
						{
							System.out.println("That doesn't work try again");
						}
					}
					if(operation.equals("/"))
					{
						try
						{
							System.out.println(number1/number2);
						}
						catch(Exception e)
						{
							System.out.println("That doesn't work try again");
						}
					}
					if(operation.equals("+"))
					{
						try
						{
							System.out.println(number1+number2);
						}
						catch(Exception e)
						{
							System.out.println("That doesn't work try again");
						}
					}
					if(operation.equals("-"))
					{
						try
						{
							System.out.println(number1-number2);
						}
						catch(Exception e)
						{
							System.out.println("That doesn't work try again");
						}
					}
				}
				catch(Exception e)
				{
					number2=0;
					number1=0;
					System.out.println("That is not a valid number, please try again");
				}
			}
			catch(Exception e)
			{
				number1=0;
				number2=0;
				System.out.println("That is not a valid number, please try again");
			}
			//test to see if the program needs to quit or continue running from the beginning
			System.out.println("Do you want to stop?");
			String end=("no");
			end=sc.next();
			if (end.equals("yes"))
			{
				stop=true;
			}
		}
	}
}