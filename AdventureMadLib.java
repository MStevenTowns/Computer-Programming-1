
/*
M. Steven Towns
Assignment 2
Part 2
6/22/2013
*/

import java.util.Scanner;

public class AdventureMadLib

{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Answer the prompts");
		System.out.println("your name: ");
		String name=sc.nextLine();
		System.out.print("place: ");
		String place=sc.nextLine();	
		System.out.println("What do you say?");
		String talk2=sc.nextLine();
		System.out.print("Another name: ");
		String friend=sc.nextLine();	
		System.out.println("Thing: ");
		String thing=sc.nextLine();
		System.out.println("action:");
		String act1=sc.nextLine();
		System.out.println("what someone said");
		String talk=sc.nextLine();
		System.out.println("");
		System.out.println("Your complete story is:");
		System.out.println("Your name is, "+name+", You are in "+place+"! You are walking along with "+friend+" in "+place+". Suddenly you see a "+thing+". You "+act1+" and the "+thing+" disappears. "+friend+" says "+talk+", and you say "+talk2+". Then your friend says: I am tired, and I am going home");
	}
}
