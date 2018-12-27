/*
M. Steven Towns
Assignment 2
Part 2
6/22/2013
*/

import java.util.Scanner;

//A simple class used to create a MadLib
public class MadLib
{
	//The main method that will run when you execute the file
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Answer the prompts");
		System.out.println("name: ");
		String name=sc.nextLine();
		System.out.print("place: ");
		String place=sc.nextLine();	
		System.out.println("superhero?");
		String talk2=sc.nextLine();
		System.out.print("Another name: ");
		String friend=sc.nextLine();	
		System.out.println("Thing: ");
		String thing=sc.nextLine();
		System.out.println("action:");
		String act1=sc.nextLine();
		System.out.println("food:");
		String talk=sc.nextLine();
		System.out.print("action: ");
		String act4=sc.nextLine();
		System.out.println("emotion");
		String emotion=sc.nextLine();
		System.out.print("place: ");
		String place2=sc.nextLine();
		System.out.print("-ing verb: ");
		String act3=sc.nextLine();
		System.out.println("");
		System.out.println("Your complete story is:");
		System.out.println("Your name is, "+name+", You are in "+place+"! You are "+act3+" with "+friend+" in "+place+". Suddenly you see a "+thing+". You "+act1+" and the "+thing+" "+act4+"s. "+friend+" says they want "+talk+", and you say there's "+talk2+"! Then your friend says: I am "+emotion+", and I am going to "+place2+".");
	}
}