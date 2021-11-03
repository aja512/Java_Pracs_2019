package dbit;
import java.util.Scanner;
import java.lang.*;
public class VarNo 
{
	static Scanner x=new Scanner(System.in);
	public static void main(String args[])
	{
		int a,n,i=0;

		do
		{
			System.out.println("***MENU***");
			System.out.println("1.Factorial");
			System.out.println("2.Reverse");
			System.out.println("3.Armstrong");
			System.out.println("4.Palindrome");
			System.out.println("5.Prime");
	
			System.out.println("6.Fibonacci Series");
			System.out.println("7.Exit");
			System.out.println("Enter your choice:");
			n=x.nextInt();
	
			switch(n)
			{
				case 1:System.out.println("Enter an integer to calculate it's factorial");
						a=x.nextInt();
						if(a<0)
						System.out.println("Number should not be Negative.");
						else
						{
							double fact=1;
							for(int b=1;b<=a;b++)
							{	
								fact=fact*b;
							}
							System.out.println("Factorial of"+a+"="+fact);
						}
						break;
				case 2:System.out.println("Enter a integer to check its Reverse:");
						a= x.nextInt();
						int reversed = 0;
						while(a != 0) 
						{
							int digit = a % 10;
							reversed = reversed * 10 + digit;
							a /= 10;
						}
						System.out.println("Number is successfully reversed "+reversed);
						break;
				case 3:System.out.println("Enter an integer to check if it is Armstrong number");
						a=x.nextInt();
						int temp=a,dig=0,rem=0,sum=0;
						while(temp!=0)
						{
							dig++;
							temp=temp/10;
						}
						temp=a;
						while(temp!=0)
						{
							rem=temp%10;
							sum+=(Math.pow(rem,dig));
							temp=temp/10;
						}
						System.out.println("Sum:"+sum);
						if(a==sum)
						{	
							System.out.println(a+" is Armstrong number");
						}
						else
						System.out.println(a+" is not a Armstrong number");
						break;
				case 4:System.out.println("Enter a number to check if it is a Palindrome:");
						a= x.nextInt();
						int reverse= 0, remainder, originalInt;
						originalInt=a;
						// reversed integer is stored in variable
						while(a!= 0 )
						{
							remainder = a % 10;
							reverse= reverse* 10 + remainder;
							a /= 10;
						}
						// palindrome if orignalInteger and reversedInteger are equal
						if (originalInt == reverse)
						{
							System.out.println("Entered number is palindrome");
						}
						else
						System.out.println("Entered number is not a palindrome");
						break;
				case 5:System.out.println("Enter an integer to check if it is Prime number");
						a=x.nextInt();
						i=2;
						while(a%i!=0)
						{
							i++;
						}
						if(a==i)
						System.out.println("It is a Prime number");
						else
						System.out.println("It is a Composite number");
						break;
				case 6:System.out.println("Enter No. of terms you want to display of Fibonacci series");
						a=x.nextInt();
						System.out.println("Fibonacci Series: ");
						int t1=0,t2=1,nextTerm;
						for (i = 1; i <= a; ++i)
						{
							System.out.print(" "+t1+",");
							nextTerm = t1 + t2;
							t1 = t2;
							t2 = nextTerm;
						}
						System.out.println(""+"\n");
						break;
				default:System.out.println("Invalid input");
						break;
			}
		}
		while(n!=7);
		x.close();
	}
	
}
/*
 * ***MENU***
1.Factorial
2.Reverse
3.Armstrong
4.Palindrome
5.Prime
6.Fibonacci Series
7.Exit
Enter your choice:
1
Enter an integer to calculate it's factorial
7
Factorial of7=5040.0
***MENU***
1.Factorial
2.Reverse
3.Armstrong
4.Palindrome
5.Prime
6.Fibonacci Series
7.Exit
Enter your choice:
2
Enter a integer to check its Reverse:
125
Number is successfully reversed 521
***MENU***
1.Factorial
2.Reverse
3.Armstrong
4.Palindrome
5.Prime
6.Fibonacci Series
7.Exit
Enter your choice:
3
Enter an integer to check if it is Armstrong number
153
Sum:153
153 is Armstrong number
***MENU***
1.Factorial
2.Reverse
3.Armstrong
4.Palindrome
5.Prime
6.Fibonacci Series
7.Exit
Enter your choice:
4
Enter a number to check if it is a Palindrome:
12321
Entered number is palindrome
***MENU***
1.Factorial
2.Reverse
3.Armstrong
4.Palindrome
5.Prime
6.Fibonacci Series
7.Exit
Enter your choice:
4
Enter a number to check if it is a Palindrome:
12345
Entered number is not a palindrome
***MENU***
1.Factorial
2.Reverse
3.Armstrong
4.Palindrome
5.Prime
6.Fibonacci Series
7.Exit
Enter your choice:
6
Enter No. of terms you want to display of Fibonacci series
5
Fibonacci Series: 
 0, 1, 1, 2, 3,

 */