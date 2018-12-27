/*
M. Steven Towns
Assignment 3
Part 5
7/4/2013
*/

import java.util.Scanner;

//A simple class used to place dots on a canvas and calculate Pi
public class Dots
{
	// The main method that will run when you execute the file
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Turtle bob=new Turtle();
		System.out.println("I am going to use randomly placed dots to estimate the value of Pi.");
		System.out.println("How many dots do you want to place? (the more dots the more accurate but the more time)");
		int h = sc.nextInt();
		int a=0;
		double c=0;
		bob.setPosition(-200,0);
		bob.setPosition(200,0);
		bob.home();
		bob.setPosition(0,-200);
		bob.setPosition(0,200);
		double j=h/600.0;
		System.out.println("This is estimated to take "+j+" minutes.(based on my computer, it will vary.)");
		while (a<h)
		{
			bob.up();
			double x=((400*Math.random()-200));
			double y=((400*Math.random()-200));
			bob.setPosition(x,y);
			double b=Math.sqrt(((x-0)*(x-0))+((y-0)*(y-0)));
			//System.out.println(b);
			if (b<200)
			{
				bob.penColor("green");
				c++;
			}
				else
			{
				bob.penColor("red");
			}
			bob.dot();
			a++;
			//System.out.println(a); uncomment this if you want a rolling script of how many dots have been placed.
		}
		bob.home();
		bob.hide();
		double d=(c/h);
		System.out.println(d);
		double f= d*4;
		double g=f-Math.PI;
		System.out.println("Pi is estimated at "+f+".");
		System.out.println("The real value of pi is "+Math.PI+".");
		System.out.println("The difference is "+g+".");
		
	}
}