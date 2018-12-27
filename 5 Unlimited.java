/*
M. Steven Towns
Assignment X
Part X
7/2X/2013
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;

public class Unlimited
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Integer x=9564;
		//System.out.println(x.toHexString(x));
		ArrayList<Integer> nums=new ArrayList<Integer>();
		for (int i=1;i<=100;i++) nums.add(i);
		BigInteger product=BigInteger.valueOf(1);
		for (int i=0;i<nums.size();i++) product=product.multiply(BigInteger.valueOf(nums.get(i)));
		System.out.println(product);
	}
}