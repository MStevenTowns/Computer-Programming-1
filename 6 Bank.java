/*
M. Steven Towns
Assignment 6
Part 2
8/14/2013
*/

//This class creates the frame for a bank account
//This class is not meant to be run!!!!!!!
public class Bank
{
	//instance variable
	double money;
	double value;
	boolean overdrawn;
	static double minMoney=20.00;
	
	//constructor
	public Bank(int money)
	{
		this.money=money;
		this.overdrawn=false;
	}
	
	//This method adds money to the account
	public void deposit()
	{
		money+=value;
	}
	
	//This method takes money out of the account
	public void withdraw()
	{
		money-=value;
	}
	
	//This method takes extra money out of the account and tells the user that they have overdrawn their account
	public void overdrawn()
	{
		money-=17.00;
		System.out.println("You are overdrawn, you must now pay an extra $17.00 fee every time you withdraw. Have a nice day");
	}
}