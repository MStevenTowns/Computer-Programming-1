/*
M. Steven Towns
Assignment X
Part X
6/22/2013
*/

import java.util.Scanner;
//sc.nextDouble(), Sc.nextInt(), sc.next(), sc.nextLine()
public class InputExample
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Tell me your name: ");
		String name=sc.nextLine();
		System.out.println("Hello "+name+"!");
		System.out.print("Tell me another name: ");
		name=sc.nextLine();	
		System.out.println("Hello "+name+"!");		
	}
}