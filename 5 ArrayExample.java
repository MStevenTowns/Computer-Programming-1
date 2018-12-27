/*
M. Steven Towns
Assignment 
Part X
7/1X/2013
*/

import java.util.Scanner;

public class ArrayExample
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
		int[] nums=new int[6]; 
		for(int i=0;i<nums.length;i++)
		{
				nums[i]=(i+1)*(i+1);
		}
		for(int i=0;i<nums.length;i++) System.out.println(nums[i]);
		int sum=0;
		for(int i=0;i<nums.length;i++) sum+=nums[i];
		System.out.println("Sum: "+sum);
	}
}
