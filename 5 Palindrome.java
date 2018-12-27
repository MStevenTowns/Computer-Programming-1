/*
M. Steven Towns
Assignment 5
Part 1
7/20/2013
*/

import java.util.Scanner;
import java.io.File;

//This class reads a dictionary file and test the words to see if they are palindromes
public class Palindrome
{
//this method reverses each word and returns true if it matches the original word
	public static boolean isPalindrome(String word)
	{
		String output="";
		word.toUpperCase();
		for (int i=0;i<word.length();i++)
		{
			String letter=word.substring(i,i+1);
			output=letter+output;
		}
		if (output.equals(word)&&(word.length()>=2))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
//This method prints out the palindromes and calculates what percent of the total words are palindromes
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(new File("Dictionary.txt"));
		int num=0;
		int total=0;
		while(sc.hasNext())
		{
			String word=sc.next();
			total++;
			if(isPalindrome(word))
			{
				System.out.print(word+" ");
				num++;
			}
		}
		double percent=(1.0*num)/(1.0*total);
		percent*=100.0;
		System.out.println();
		System.out.println("Out of the "+total+" words tested "+num+" were Palindromes.");
		System.out.println("This is "+percent+"% of the total.");
	}
}