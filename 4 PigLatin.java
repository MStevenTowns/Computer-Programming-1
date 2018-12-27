/*
M. Steven Towns
Assignment 4
Part 2
7/8/2013
*/

import java.util.Scanner;
import java.io.File;

//this class reads from a file and then converts all the words in the file to pig latin
public class PigLatin
{
	//This is the method to change each word
	public static String change(String word)
	{
		String first=(word.substring(0, 1));
		String last=(word.substring(1));
		String output="";
		if (first.equals("a"))
		{
			output=(word+"-way");
		}
		else if (first.equals("e"))
		{
			output=(word+"-way");
		}
		else if (first.equals("i"))
		{
			output=(word+"-way");
		}
		else if (first.equals("o"))
		{
			output=(word+"-way");
		}
		else if (first.equals("u"))
		{
			output=(word+"-way");
		}
		else 
		{
			
			output=(""+last+"-"+first+"ay");
		}
		return output;
	}
	
	//this is the main method that runs and calls the file and first method
	public static void main(String[] args) throws Exception
	{
		//If you want to change what the input sentence is just change the Input file.
		Scanner sc=new Scanner(new File("Input.txt"));
		while (sc.hasNext())
		{
			System.out.print(change(sc.next())+" ");
		}
		
	}
}