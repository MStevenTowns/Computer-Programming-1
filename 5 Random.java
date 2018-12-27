/*
M. Steven Towns
Assignment 5
Part 4
7/22/2013
*/

import java.util.Arrays;

//This class generates random numbers and calculates max, min, and average of them
public class Random
{
//This method generates numbers and calculates max, min, and average
	public static void main(String[] args)
	{
		int num=100;
		int[] random=new int[num];
		for (int i=0;i<num;i++)
		{
			random[i]=(int)(((Math.random())*33.0)+10);
		}
		Arrays.sort(random);
		for(int i=0;i<random.length;i++) 
		{
			System.out.println(random[i]);
		}
		System.out.println("The largest number is :"+random[(random.length)-1]);
		int min = 100;
		for(int i=0;i<random.length;i++)
		{
			if(random[i] < min)
			{
				min = random[i];
			}
		}
		System.out.println("The smallest number is :" + min); 
		double sum=0;
		for(int i=0;i<random.length;i++) sum+=random[i];
		double average=sum/num;
		System.out.println("The average is :"+average);
	}
}