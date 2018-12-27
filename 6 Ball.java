/*
M. Steven Towns
Assignment 6
Part 3
8/12/2013
*/
//Special thanks to Mr. Seward for allowing me to copy large parts of this code.

//This class creates the framework for a ball
//This program is not meant to be run!!!!!!
public class Ball
{
	//instance variable
	int psi;
	boolean isPopped;
	static int maxPsi=100;
	
	//constructor
	public Ball(int psi)
	{
		this.psi=psi;
		this.isPopped=false;
	}
	
	//This method inflates the ball
	public void inflate()
	{
		if(!isPopped)
		{
			this.psi+=5;
			System.out.println("Whoosh");
		}
		else
		{
			System.out.println("Pfft");
		}
	}
	
	//This method deflates the ball
	public void deflate()
	{
		if(!isPopped&&psi>=5)
		{
			this.psi-=5;
			System.out.println("Sssss");
		}
	}
	
	//This method pops the ball
	public void stab()
	{
		this.isPopped=true;
		this.psi=0;
		System.out.println("Bam\nYour ball popped.");
	}
	
	//this method bounces the ball and adds slight pressure to it
	public void bounce()
	{
		if(!isPopped)
		{
			System.out.println("Thud");
			this.psi+=5;
		}
		if(isPopped||psi<=10)
		{
			System.out.println("Flop");
		}
	}
	
	//This method patches the ball if it is popped
	public void patch()
	{
		if(isPopped)
		{
			this.isPopped=false;
			this.psi=1;
		}
	}	
}
