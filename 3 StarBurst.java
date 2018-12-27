/*
M. Steven Towns
Assignment 3
Part 3
7/1/2013
*/

import java.util.Scanner;

//A simple class used to print out a star burst with a user specified radius and number of lines
public class StarBurst
{
	//The main method that will run when you execute the file
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("I am going to draw a Star Burst, what do you want the radius to be?");
		double radius=sc.nextDouble();
		System.out.println("How many lines do you want it to have?");
		int line=sc.nextInt();
		double y=0.0;
		double x=(360.0/line);
		Turtle bob = new Turtle();
        for(double i=0.0;y<=360;i++)
        {
            bob.forward(radius);
			bob.setPosition(0,0);
			bob.left (180);
			bob.forward(radius);
            bob.left(x);
			bob.setPosition(0,0);
			y=i+x;
			bob.zoomFit();
		}
		bob.hide();
	}
}