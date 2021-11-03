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

//package dbit;
import java.util.Scanner;
public class BankAccount 
{
	double initialbalance,finalbalance,amount;
	int accountno,contact;
	float rate;
	String name,address;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[])
	{
		
        int p;
	    int ch;
	    BankAccount a=new BankAccount();
        do
        {
           
			System.out.println("   MENU    ");
			System.out.println("1. Create an Account");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withraw Money");
			System.out.println("4. Compute Interest");
			System.out.println("5. Display the Total Amount");
			ch=sc.nextInt();
			switch(ch)
			{
                 case 1:a.createAccount();
						System.out.println("Your account details:");
						System.out.println("Name:"+a.name);
                        System.out.println("Contact no.:"+a.contact);
                        System.out.println("Address:"+a.address);
                        System.out.println("Account No. :"+a.accountno);
                        break;
               	 case 2:double t=a.deposit();
			   			System.out.println("Your total amount in the account:"+t);
                        break;
               	 case 3:double d=a.withdraw();
			  			System.out.println("Your total amount in the account:"+d);
                        System.out.println("Rs." + a.finalbalance + " has been withdrawn.");
			    		break;
				 case 4:double c=a.computeInterest();
						System.out.println("Your total amount in the account:"+c);
						break;
			     case 5:a.displayBalance();
					    break;
			}
			System.out.println("Do you wish to continue?"+"\n"+"Press 1 for Yes & 0 for No");
			p=sc.nextInt();
		}	
		while(p!=0);
	}
	void createAccount()
	{
	    System.out.println("Enter your name :");
	    name=sc.next();
	    System.out.println("Enter your contact no.:");
		contact=sc.nextInt();
		System.out.println("Enter your address field :");
		address=sc.next();
		System.out.println("Enter your account no. :");
		accountno=sc.nextInt();
		System.out.println("Enter your initial balance:");
		initialbalance=sc.nextDouble();
	}
	double deposit()
	{
		System.out.println("Enter your Amount you've deposited:");
		amount=sc.nextDouble();
		finalbalance=initialbalance + amount;
		initialbalance=finalbalance;
		return finalbalance;
	}
	double withdraw()
	{
		System.out.println("Enter your Amount you've withdrawn:");
		amount=sc.nextDouble();
		finalbalance=initialbalance - amount;
		initialbalance=finalbalance;
        return finalbalance;
	}
	double computeInterest()
	{
		double interest;
		System.out.println("Enter your interest:");
		interest=sc.nextDouble();
		finalbalance=initialbalance + interest*initialbalance;
		initialbalance=finalbalance;
        return finalbalance;
	}
	void displayBalance()
	{
                System.out.println("Your total amount in the account:"+finalbalance);
	}
}
