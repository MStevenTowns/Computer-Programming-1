/*
M. Steven Towns
Assignment 5
Part 5
7/22/2013
*/

import java.util.ArrayList;
import java.util.Arrays;

//This class generates dates until two of the occur on the same day
public class Birthdays
{
//This method changes the numbers generated into dates
	public static String dateChange(int randomDate)
	{
		String date="";
		if(randomDate>=1&&randomDate<=31)
		{
			date+=("January ");
			date+=randomDate;
		}
		if(randomDate>=32&&randomDate<=59)
		{
			date+=("February ");
			date+=randomDate-31;
		}
		if(randomDate>=60&&randomDate<=90)
		{
			date+=("March ");
			date+=randomDate-59;
		}
		if(randomDate>=91&&randomDate<=120)
		{
			date+=("April ");
			date+=randomDate-90;
		}
		if(randomDate>=121&&randomDate<=151)
		{
			date+=("May ");
			date+=randomDate-120;
		}
		if(randomDate>=152&&randomDate<=181)
		{
			date+=("June ");
			date+=randomDate-151;
		}
		if(randomDate>=182&&randomDate<=212)
		{
			date+=("July ");
			date+=randomDate-181;
		}
		if(randomDate>=213&&randomDate<=243)
		{
			date+=("August ");
			date+=randomDate-212;
		}
		if(randomDate>=244&&randomDate<=273)
		{
			date+=("September ");
			date+=randomDate-243;
		}
		if(randomDate>=272&&randomDate<=304)
		{
			date+=("October ");
			date+=randomDate-273;
		}
		if(randomDate>=305&&randomDate<=334)
		{
			date+=("November ");
			date+=randomDate-304;
		}
		if(randomDate>=335&&randomDate<=365)
		{
			date+=("December ");
			date+=randomDate-334;
		}
		return date;
	}
//This method generates random numbers and test to see if they are already in the array
	public static void main(String[] args)
	{
		int length=366;
		String date=new String();
		int stop=0;
		int count=0;
		ArrayList<Integer> nums=new ArrayList<Integer>();
		while (stop<1)
		{
			int randomDate=((int)(Math.random()*366));
			if(nums.contains(randomDate))
			{
				stop+=10;
				date=dateChange(randomDate);
				System.out.println(dateChange(randomDate));
				count++;
			}
			else
			{
				System.out.println(dateChange(randomDate));
				nums.add(randomDate);
				count++;
			}
		}
		System.out.println("");
		System.out.print("It took "+count+" birthdays, but ");
		System.out.print("the first repeated birthday is "+date);
	}
}