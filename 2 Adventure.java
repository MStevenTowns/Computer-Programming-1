/*
M. Steven Towns
Assignment X
Part X
6/22/2013
*/

import java.util.Scanner;
//sc.nextDouble(), Sc.nextInt(), sc.next(), sc.nextLine()
public class Adventure

{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Tell me your name: ");
		String name=sc.nextLine();
		System.out.println("Hello "+name+"! I am going to take you on a wonderful adventure");
		System.out.print("Tell me where your adventure will take place: ");
		String place=sc.nextLine();	
		System.out.println("You are in "+place+"!");
		System.out.print("Tell me another name: ");
		String friend=sc.nextLine();	
		System.out.println("you are walking along with "+friend+" in "+place+". Suddenly you see a: ");
		String thing=sc.nextLine();
		System.out.println("what do you do when you see the "+thing+"?");
		String act1=sc.nextLine();
		System.out.println("the "+thing+" disappears.");
		System.out.println(""+friend+" says:");
		String talk=sc.nextLine();
		System.out.println("What do you say?");
		String talk2=sc.nextLine();
		System.out.println("Then "+friend+" says: Sorry, but, I am tired, and I am going home");
		System.out.println("");
		System.out.println("Your complete story is:");
		System.out.println("Your name is, "+name+", You are in "+place+"! You are walking along with "+friend+" in "+place+". Suddenly you see a "+thing+". You "+act1+" and the "+thing+" disappears. "+friend+" says "+talk+", and you say "+talk2+". Then your friend says: I am tired, and I am going home");
	}
}