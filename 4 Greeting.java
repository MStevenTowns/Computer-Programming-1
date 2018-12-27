/*
M. Steven Towns
Assignment 4
Part 1
7/5/2013
*/

import java.util.Scanner;

//This is a simple class to great the user with correct grammar.
public class Greeting
{
	//This is the main method that runs when you execute the file
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your name?");
		String in = sc.nextLine();
		String name = in.trim();
		//this changes the first letter to upper-case
		String first=(name.substring(0, 1));
		String firstU = first.toUpperCase();
		//this changes the rest of the letters to lower-case
		String last=(name.substring(1));
		String lastU=last.toLowerCase();
		System.out.println("Hello "+firstU+""+lastU+". let me out of this machine!");
	}
}