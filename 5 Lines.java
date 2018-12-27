/*
M. Steven Towns
Assignment X
Part X
7/2X/2013
*/

import java.util.Scanner;

public class Lines
{

	public static double getTotalLineLength(double xs[],double ys[])
	{
		double sum=0;
		for(int i=1;i<xs.length;i++)
		{
			sum+=distance(xs[i-1],ys[i-1],xs[i],xs[i]);
		}
		return sum;
	}
	
	public static double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Turtle t=new Turtle();
		t.up();
		int size=4;
		double xs[]=new double[size];
		double ys[]=new double[size];
		for(int i=0;i<size;i++)
		{
			double x=Math.random()*500-250;
			double y=Math.random()*500-250;
			xs[i]=x;
			ys[i]=y;
		}
		t.setPosition(xs[0],ys[0]);
		t.down();
		for(int i=0;i<xs.length;i++)
		{
			t.setPosition(xs[i],ys[i]);
		}
		System.out.println(getTotalLineLength(xs,ys));
	}
}