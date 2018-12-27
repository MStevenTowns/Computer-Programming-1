/*
M. Steven Towns
Assignment 2
Part 6
6/26/2013
*/

import java.util.Scanner;

//A simple class used to draw a rotated square around the origin
public class RotateSquare
{
	//The main method that will run when you execute the file
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("I am going to draw a square!");
		System.out.println("how long do you want your square to be?");
		double x=sc.nextInt();
		System.out.println("How many degrees do you want it rotated?");
		double y=sc.nextInt();
		double z=(x/2);
		Turtle bob=new Turtle ();
		bob.up();
		bob.setDirection(y);
		bob.forward(z);
		bob.left(90);
		bob.forward(z);
		bob.left(90);
		bob.stamp();
		bob.down();
		bob.forward(x);
		bob.left(90);
		bob.stamp();
		bob.forward(x);
		bob.left(90);
		bob.stamp();
		bob.forward(x);
		bob.left(90);
		bob.stamp();
		bob.forward(x);	
		bob.up();
		bob.home();
	}
}