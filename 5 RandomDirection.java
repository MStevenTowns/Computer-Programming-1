/*
M. Steven Towns
Assignment 5
Part 2
7/20/2013
*/

//This class moves a turtle in a random direction until it leaves the screen
public class RandomDirection
{
//This method points a turtle in a random direction and moves it forward
	public static void goRandomDirection (Turtle bob)
	{
		bob.left((int)(Math.random()*361));
		bob.forward(10);
	}
//this method moves bob back to home if he leaves the screen
	public static void main(String[] args)
	{
		Turtle bob=new Turtle();
		int repeat=0;
//infinite loop
		while (repeat<1)
		{
			goRandomDirection(bob);
			if (bob.getX()>=250||bob.getX()<=-250||bob.getY()>=250||bob.getY()<=-250)
			{
				bob.up();
				bob.setPosition(0,0);
				bob.down();
			}
		}
	}
}