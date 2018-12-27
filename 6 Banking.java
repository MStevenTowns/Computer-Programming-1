/*
M. Steven Towns
Assignment 6
Part 2.5
8/14/2013
*/

import java.util.Scanner;

//This class allows the user to control a bank account
public class Banking
{
//This method runs when the file is executed
	public static void main(String[] args)
	{
		Bank bob=new Bank(15);
		Scanner sc=new Scanner(System.in);
		System.out.println("What do you want the initial value of your account to be?");
		bob.money=sc.nextDouble()+0.00;
		while(true)
		{
			if(bob.money<bob.minMoney)
			{
				bob.overdrawn();
			}
			//The main menu
			System.out.println("1: Deposit\n2: Withdraw\n3: Check Balance\n4: Quit");
			System.out.println("What do you want to do?");
			String input=sc.next();
			int option=0;
			try
			{
				option=Integer.parseInt(input);
			}
			catch(Exception e)
			{
				option=0;
			}
			//This test to see if the selected option is in the menu
			if (option>=1&&option<=4)
			{
			//preforms the necessary function based on input
				if(option==1)
				{
					System.out.println("How much would you like to deposit?");
					bob.value=sc.nextDouble();	
					bob.deposit();
				}
				if(option==2)				
				{
					System.out.println("How much would you like to withdraw?");
					bob.value=sc.nextDouble();	
					bob.withdraw();
				}
				if(option==3)
				{
					System.out.printf("\nYour balance is $%.2f\n", bob.money);
				}
				if(option==4)
				{
					System.out.println("WHAT YOUR LEAVING???? Fine, go away!");
					break;
				}
			}
			//error message
			else
			{
				System.out.println("INVALID INPUT!!!! I am going to give you another chance, please do not mess up.");
			}
		}
	}
}