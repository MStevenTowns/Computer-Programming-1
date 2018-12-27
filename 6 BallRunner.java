/*
M. Steven Towns
Assignment 6
Part 3.5
8/12/2013
*/

//Special thanks to Mr. Seward for allowing us to copy large parts of this code.

import java.util.Scanner;

//This class allows the user to control a ball and preform various actions with it
public class BallRunner
{
//This method runs when the file is executed
	public static void main(String[] args)
	{
		Ball bob=new Ball(15);
		Scanner sc=new Scanner(System.in);
		boolean go=false;
		while(true)
		{
			System.out.println("What do you want the initial psi of your ball to be?");
			bob.psi=sc.nextInt();
			if(bob.psi>0)
			{
				break;
			}
			else
			{
				System.out.println("That is not a valid input, please try again");
			}
		}
		if(bob.psi>=bob.maxPsi)
		{
			bob.stab();
		}
		while(true)
		{
		//main menu
			System.out.println("1: Inflate\n2: Deflate\n3: Stab\n4: Bounce\n5: Patch\n6: Check Pressure\n7: Quit");
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
			//makes sure that the selected option is within the menu
			if (option>0&&option<8)
			{
			//runs the necessary method based on the input
				if(option==1) 
				{
					bob.inflate();
					if(bob.psi>=bob.maxPsi)
					{
						bob.stab();
					}
				}
				if(option==2) 
				{
					bob.deflate();
					if(bob.psi>=bob.maxPsi)
					{
						bob.stab();
					}
				}
				if(option==3) 
				{
					bob.stab();
				}
				if(option==4) 
				{
					bob.bounce();
					if(bob.psi>=bob.maxPsi)
					{
						bob.stab();
					}
					bob.psi-=6;
				}
				if(option==5) 
				{
					bob.patch();
				}
				if(option==6) 
				{
					System.out.println("Your Psi is "+bob.psi+".");
				}
				if(option==7)
				{
					System.out.println("Thanks for playing");
					break;
				}
			}
			else
			{
				System.out.println("INVALID INPUT!!!! Please try again.");
			}
		}
	}
}
