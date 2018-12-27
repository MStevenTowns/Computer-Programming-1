/*
M. Steven Towns
Assignment 
Part 6
7/26/2013
*/

//This class generates dots and moves a turtle around the canvas until it hits one
public class TurtleDots
{
//This method 
	public	static void main(String[] args)
	{
		Turtle bob=new Turtle();
		Turtle ann=new Turtle();
		bob.up();
		bob.speed(10);
		ann.up();
		ann.hide();
		int num=20;
//Stores the sizes of the dots in an array
		int[] dotSize=new int[num];
		for(int i=0;i<num;i++)
		{
			dotSize[i]=((int)(Math.random()*40)+10);
		}
//This stores the x-coordinates of the dots in an array
		double[] xPos=new double[num];
		for(int i=0;i<num;i++)
		{
			xPos[i]=((int)(Math.random()*450)-225);
		}
//This stores the y-coordinates of the dots in an array
		double[] yPos=new double[num];
		for(int i=0;i<num;i++)
		{
			yPos[i]=((int)(Math.random()*450)-225);
		}
		for(int i=0;i<num;i++)
		{
			ann.penColor("red");
			ann.setPosition(xPos[i],yPos[i]);
			ann.dot("red",dotSize[i]);
		}
		int stop=0;
//This test the location of the turtle to see if it is inside one of the dots or outside the screen
		while(stop<1)
		{
			bob.forward(10);
			for(int i=0;i<num;i++)
			{
				if(bob.getX()>(xPos[i]-(dotSize[i]/2+5))&&bob.getX()<(xPos[i]+(dotSize[i]/2+5))&&bob.getY()>(yPos[i]-(dotSize[i]/2+5))&&bob.getY()<(yPos[i]+(dotSize[i]/2+5)))
				{
					bob.left(100);
					bob.forward(20);
				}
				else if (bob.getX()>=250||bob.getX()<=-250||bob.getY()>=250||bob.getY()<=-250)
				{
					bob.left(100);
					bob.forward(20);
				}
				else if (bob.getX()>=275||bob.getX()<=-275||bob.getY()>=275||bob.getY()<=-275)
				{
					bob.home();
				}
			}
		}
	}
}