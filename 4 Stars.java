/*
M. Steven Towns
Assignment 4
Part 5
7/8/2013
*/

import java.util.Scanner;

//This class will draw a series of stars based on user input, and randomly generated
public class Stars
{
	//This is the main method that will run when you execute the file
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Turtle bob=new Turtle();
		//This was the best way I found to start my while loop so that I could repeat for each star
		System.out.println("Do you want to draw a star?");
		String again=sc.next();
		while (again.equals("yes"))
		{
			//this draws the user input star
			System.out.println("where on the x-axis do you want it?");
			int x=sc.nextInt();
			System.out.println("where on the y-axis do you want it?");
			int y=sc.nextInt();
			System.out.println("How long do you want each line?");
			int z=sc.nextInt();
			bob.up();
			bob.setPosition(x,y);
			bob.down();
			bob.hide();
			for(int i=0;i<5;i++)
			{
				bob.forward(z);
				bob.right(144);
				bob.zoomFit();
			}
			//this section is for the randomly generated star
			int a= (int)(1000*Math.random()-500);
			int b= (int)(1000*Math.random()-500);
			int c= (int)(500*Math.random());
			bob.up();
			bob.setPosition(a,b);
			bob.down();
			bob.hide();
			for(int i=0;i<5;i++)
			{
				bob.forward(c);
				bob.right(144);
				bob.zoomFit();
			}
			System.out.println("Do you want to draw another?");
			again=sc.next();
		}
		//When the program is quit, you get this message
		System.out.println("Thank you for playing!");
	}
}