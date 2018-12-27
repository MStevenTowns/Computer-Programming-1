/*
M. Steven Towns
Assignment 4
Part 3
7/8/2013
*/

import java.util.Scanner;

//This class will print out a fractal of a user specified order
public class Fractal
{
/*
//I was unable to figure out how to call this method into the main one. any help would be appreciated.
	public static String change()
	{
		String output="";
		for(int i=0;i<input; i++)
		{
			fractal=fractal.toUpperCase();
			fractal=fractal.replaceAll("S",change);
		}
		
		return output;
	}
	*/
	//This is the main method that runs when the file is executed
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String change="SLSRSLS";
		String fractal="SRSRS";
		//be careful here, a 5 order fractal can take a long time.
		System.out.println("What order fractal do you want?");
		int input=(sc.nextInt()-1);
		//changes all "S" in the String "fractal" to the String "change"
		for(int i=0;i<input; i++)
		{
			fractal=fractal.toUpperCase();
			fractal=fractal.replaceAll("S",change);
		}
		Turtle bob = new Turtle();
		bob.hide();
		//Turtle was too slow for high order fractals
		bob.speed(0);
		//testing lines
		//System.out.println(fractal);
		//System.out.print(fractal.length());
		for(int i=0;i<fractal.length(); i++)
		//this test each letter in the series and preforms a specific action based on which one it is
		{
			String letter=fractal.substring(i,i+1);
			if (letter.contains("S"))
			{
				bob.forward(100);
			}
			if (letter.contains("L"))
			{
				bob.left(60);
			}
			if (letter.contains("R"))
			{
				bob.right(120);
			}
			//helps to make the entire shape visible while it is being drawn
			bob.zoomFit();
		}
		
	}
}