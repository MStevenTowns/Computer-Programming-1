/*
M. Steven Towns
Assignment 3
Part 4
7/2/2013
*/

import java.util.Scanner;

public class DiceRepeat
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("This is a dice game, the goal is to reach an exact value by rolling four dice.");
		System.out.println("The standard game is playing to 21.");
		System.out.println("The maximum is 24, and the minimum is 4.");
		System.out.println("What value do you want to play to?");
		int play=sc.nextInt();
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
		System.out.println("It took  "+z+" rolls to reach "+t+".");
		System.out.println();
		System.out.println("Would you like to play again? yes or no?");
		String msg=sc.nextLine();
		if(msg=="yes")
		{
			System.out.println("Perfect, now I don't have to blow your computer up :)");
			System.out.println("What value do you want to play to?");
			int play2=sc.nextInt();
			int g=0;
			int p=0;
			while (g!=play2)
			{
				a=((int)(6*Math.random())+1);
				b=((int)(6*Math.random())+1);
				c=((int)(6*Math.random())+1);
				d=((int)(6*Math.random())+1);
				g=a+b+c+d;
				System.out.println("roll "+z+": "+a+" "+b+" "+c+" "+d+"");
				System.out.println("Total: "+t+"");
				p++;
			}
			System.out.println("It took "+p+" rolls to reach "+g+".");
			System.out.println("Would you like to play again? yes or no?");
			String msg2=sc.nextLine();
			msg=msg.replace("yes",msg2);
		}
		else
		{
			System.out.println("Thank you for playing!");
		}
	}
}