/*
 Write a Menu driven program in java to implement simple banking application.
 Application should read the customer name, account number, initial balance, rate of interest, contact number and address field etc.
 Application should have following methods.
1. createAccount()
2. deposit()
3. withdraw()
4. computeInterest()
5. displayBalance()
 */
import java.util.*;
public class account
{
	private double balance;
	private double interest;

	public SavingsAccount()
	{
		balance = 0;
		interest = 0;
	}

	public SavingsAccount(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		interest = initialInterest;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public double getBalance()
	{
		return balance;
	}

}

	public static void main(String[] args)
	{
		SavingsAccount user = new SavingsAccount(1000, 0.10);
		user.withdraw(250);
		user.deposit(400);
		user.addInterest();
		System.out.println(user.getBalance());
		System.out.println("Expected: 1265.0");
	}
