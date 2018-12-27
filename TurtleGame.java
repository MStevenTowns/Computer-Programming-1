/*
M. Steven Towns
Assignment Game
8/16/2013
*/

import java.util.Scanner;

//This class generates dots and moves a turtle around the canvas until it hits one
public class TurtleGame
{
//This method runs when the file is executed
	public	static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Turtle bob=new Turtle();
		Turtle ann=new Turtle();
		bob.up();
		double speed=100;
		bob.speed(speed);
		ann.hide();
		ann.speed(0);
		int num=20;
		int count=0;
//This draws a line around the outside of the play area
		ann.up();
		ann.setPosition(-245,-245);
		ann.down();
		ann.forward(490);
		ann.left(90);
		ann.forward(490);
		ann.left(90);
		ann.forward(490);
		ann.left(90);
		ann.forward(490);
		ann.up();
//Stores the sizes of the red dots in an array
		int[] dotSize=new int[num];
		for(int i=0;i<num;i++)
		{
			dotSize[i]=((int)(Math.random()*40)+40);
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
			while(bob.getX()>(xPos[i]-(dotSize[i]/2+5))&&bob.getX()<(xPos[i]+(dotSize[i]/2+5))&&bob.getY()>(yPos[i]-(dotSize[i]/2+5))&&bob.getY()<(yPos[i]+(dotSize[i]/2+5)))
			{
				xPos[i]=((int)(Math.random()*450)-225);
				yPos[i]=((int)(Math.random()*450)-225);
			}
			ann.setPosition(xPos[i],yPos[i]);
			ann.dot("red",dotSize[i]);
		}
		int stop=0;
		System.out.println("Hello, this is a game to move the turtle around the canvas using your mouse. \nDo not let the mouse touch the turtle, the turtle to touch any of the red dots, or to leave the canvas. \nThe point of this game is to last as long as you can. \nHitting the green dots will allow you move slower and more carefully.");
		System.out.println("Would you like to play? yes or no?");
		String msg=sc.nextLine();
		if(msg.equals("yes"))
		{
//This test the location of the turtle to see if it is inside one of the dots or outside the screen
			int[] greenDot=new int[3];
			greenDot[0]=(20);
			greenDot[1]=(50);
			greenDot[2]=(50);
			int count2=0;
			int countGreen=0;
			ann.setPosition(greenDot[1],greenDot[2]);
			ann.dot("green",greenDot[0]);
			while(stop<1)
			{
				bob.face(Turtle.canvasX(bob.mouseX()),Turtle.canvasY(bob.mouseY()));
				bob.forward(10);
				if (bob.getSpeed()<=26) speed=26;
				if (speed%5==0)
				{
				System.out.println("Your speed is: "+speed+" sBTU (Strange Backwards Turtle Units)");
				}
				speed=speed-.5;
				bob.speed(speed);
				count++;
				count2++;
				int count3=0;
				for(int i=0;i<num;i++)
				{
					if (count>=10)
					{
						if (count2>=100)
						{
							ann.setPosition(greenDot[1],greenDot[2]);
							ann.dot("white",greenDot[0]+3);
							greenDot[1]=((int)(Math.random()*450)-225);
							greenDot[2]=((int)(Math.random()*450)-225);
							ann.setPosition(greenDot[1],greenDot[2]);
							ann.dot("green",greenDot[0]);
							count2=0;
							count3++;
							for(int a=0;a<num;a++)
							{
								ann.penColor("red");
								ann.setPosition(xPos[a],yPos[a]);
								ann.dot("red",dotSize[a]);
								count3=0;
								ann.setPosition(greenDot[1],greenDot[2]);
								ann.dot("green",greenDot[0]);
							}
						}
						if(bob.getX()>(greenDot[1]-(greenDot[0]/2+5))&&bob.getX()<(greenDot[1]+(greenDot[0]/2+5))&&bob.getY()>(greenDot[2]-(greenDot[0]/2+5))&&bob.getY()<(greenDot[2]+(greenDot[0]/2+5)))
						{
							speed+=20;
							if (speed>100) speed=100;
							bob.speed(speed);
							ann.setPosition(greenDot[1],greenDot[2]);
							ann.dot("white",greenDot[0]+3);
							greenDot[1]=((int)(Math.random()*450)-225);
							greenDot[2]=((int)(Math.random()*450)-225);
							ann.setPosition(greenDot[1],greenDot[2]);
							ann.dot("green",greenDot[0]);
							count2=0;
							count3++;
							countGreen++;
							for(int a=0;a<num;a++)
							{
								ann.penColor("red");
								ann.setPosition(xPos[a],yPos[a]);
								ann.dot("red",dotSize[a]);
								count3=0;
								ann.setPosition(greenDot[1],greenDot[2]);
								ann.dot("green",greenDot[0]);
							}
						}
						if(bob.getX()>(xPos[i]-(dotSize[i]/2+5))&&bob.getX()<(xPos[i]+(dotSize[i]/2+5))&&bob.getY()>(yPos[i]-(dotSize[i]/2+5))&&bob.getY()<(yPos[i]+(dotSize[i]/2+5)))
						{
							System.out.println("I am sorry, but you died after "+count+" moves, and collected "+countGreen+" dots");
							bob.hide();
							bob.home();
							bob.show();
							count=0;
							countGreen=0;
							speed+=101;
							if (speed>100) speed=100;
							bob.speed(speed);
						}
						if (10>=(Math.sqrt(((bob.getX()-Turtle.canvasX(bob.mouseX()))*(bob.getX()-Turtle.canvasX(bob.mouseX())))+((bob.getY()-Turtle.canvasY(bob.mouseY()))*(bob.getY()-Turtle.canvasY(bob.mouseY()))))))
						{
							System.out.println("I am sorry, but you died after "+count+" moves, and collected "+countGreen+" dots");
							bob.hide();
							bob.home();
							bob.show();
							count=0;
							countGreen=0;
							speed+=101;
							if (speed>100) speed=100;
							bob.speed(speed);
						}
						if (bob.getX()>=250||bob.getX()<=-250||bob.getY()>=250||bob.getY()<=-250)
						{
							System.out.println("I am sorry, but you died after "+count+" moves, and collected "+countGreen+" dots");
							bob.hide();
							bob.home();
							bob.show();
							count=0;
							countGreen=0;
							speed+=101;
							if (speed>100) speed=100;
							bob.speed(speed);
						}
					}
				}	
			}
		}
		else
		{
			System.out.print("I can see that you are not willing to make the commitment to play.\n thank you so much for waking me up just to tell me no.");
		}
	}
}