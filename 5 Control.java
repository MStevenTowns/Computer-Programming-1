/*
M. Steven Towns
Assignment X
Part X
7/2X/2013
*/

import java.util.Scanner;

public class Control
{
	public static void goLeft(Turtle t)
	{
		t.left(90);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Turtle bob=new Turtle();
		bob.onKey("goLeft","left");
		
	}
}