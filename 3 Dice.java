/*
M. Steven Towns
Assignment 3
Part 4
7/2/2013
*/

import java.util.Scanner;

//A simple class used to randomly generate dice rolls and add them together
public class Dice
{
	//The main method that will run when you execute the file
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("This is a dice game, the goal is to reach an exact value by rolling four dice.");
		System.out.println("The standard game is playing to 21.");
		System.out.println("The maximum is 24, and the minimum is 4.");
		System.out.println("What value do you want to play to?");
		int play=sc.nextInt();
		if (play<4)
		{
			System.out.println("that is an invalid input! value set at 4.");
			play=4;
		}
		else if (play>24)
		{
			play=24;
			System.out.println("that is an invalid input! value set at 24.");
		}
		int t=0;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int z=1;
		while (t!=play)
		{
			a=((int)(6*Math.random())+1);
			b=((int)(6*Math.random())+1);
			c=((int)(6*Math.random())+1);
			d=((int)(6*Math.random())+1);
			t=a+b+c+d;
			System.out.println("roll "+z+": "+a+" "+b+" "+c+" "+d+"");
			System.out.println("Total: "+t+"");
			z++;
		}
		System.out.println("It took  "+z+" rolls to reach your goal of "+t+".");
		System.out.println("Thank you for playing!");
	}
}