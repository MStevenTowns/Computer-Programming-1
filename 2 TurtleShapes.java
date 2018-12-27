/*
M. Steven Towns
Assignment 2
Part 5
6/26/2013
*/

//A simple class used to draw three shapes using a turtle
public class TurtleShapes
{
	//The main method that will run when you execute the file
	public static void main(String[] args)
	{
		Turtle bob=new Turtle();
		bob.up();
		bob.setPosition(0,0);
		bob.down();
		bob.forward(100);
		bob.left(90);
		bob.forward(100);
		bob.left(90);
		bob.forward(100);
		bob.left(90);
		bob.forward(100);
		bob.up();
		bob.setPosition(0,-50);
		bob.down();
		bob.forward(100);
		bob.left(120);
		bob.forward(100);
		bob.left(120);
		bob.forward(100);
		bob.up();
		bob.setPosition(-50,0);
		bob.down();
		bob.forward(100);
		bob.left(72);
		bob.forward(100);
		bob.left(72);
		bob.forward(100);
		bob.left(72);
		bob.forward(100);
		bob.left(72);
		bob.forward(100);
		bob.left(72);
	}
}