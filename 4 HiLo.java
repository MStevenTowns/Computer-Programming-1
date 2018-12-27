/*
M. Steven Towns
Assignment 4
Part 4
7/8/2013
*/

import java.util.Scanner;

//This class creates a random number and asks the user to guess what number it is.
public class HiLo
{
	//This is the main method that runs when you execute the file.
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//generates the random number between 0 and 100
		int secret=(int)(101*Math.random());
		//starting numbers so that at least one play through is required
		int guess=-10;
		int count=0;
		while (guess!=secret)
		{
			System.out.print("Guess a number between 0 and 100: ");
			guess=sc.nextInt();
			if (guess==secret)
			{
				System.out.println("You win!");
			}
			else if (guess<secret)
			{
				System.out.println("Too low");
			}
			else if (guess>secret)
			{
				System.out.println("Too high");
			}
			count++;
		}
		System.out.println("It took you "+count+" guesses to win");
		System.out.println("would you like to play again?");
		String again=sc.next();
		// I couldn't figure out how to put the while loop with the first play through until I had already completed it, so I left it on the end
		while (again.equals("yes"))
		{
			int count2=0;
			int secret2=(int)(101*Math.random());
			while (guess!=secret2)
			{
				System.out.print("Guess a number between 0 and 100: ");
				guess=sc.nextInt();
				if (guess==secret2)
				{
					System.out.println("You win!");
				}
				else if (guess<secret2)
				{
					System.out.println("Too low");
				}
				else if (guess>secret2)
				{
					System.out.println("Too high");
				}
				count2++;
			}
			System.out.println("It took you "+count2+" guesses to win");
			System.out.println("would you like to play again?");
			again=sc.next();
		}
		//When you are done this message appears
		System.out.println("Thank you for playing!");
	}
}