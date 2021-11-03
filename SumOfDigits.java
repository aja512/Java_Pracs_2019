import java.util.Scanner;
public class SumOfDigits
{
	public static void main(String args[])
	{
		int n,dig,sum=0;
		System.out.println("Enter a no. to check sum of even digits:");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		while(n!=0)
		{
			dig=n%10;
			if(dig%2==0)
			{
				sum+=dig;
			}
			n/=10;
		}
		System.out.println("Sum Of Even Digits:"+sum);
		obj.close();
	}
}
/*
O/P:-
dbit@it6-44:~/Desktop/Java_Lab_AJA$ javac SumOfDigits.java
dbit@it6-44:~/Desktop/Java_Lab_AJA$ java SumOfDigits
Enter a no. to check sum of even digits:
413
Sum Of Even Digits:4
dbit@it6-44:~/Desktop/Java_Lab_AJA$ javac SumOfDigits.java
dbit@it6-44:~/Desktop/Java_Lab_AJA$ java SumOfDigits
Enter a no. to check sum of even digits:
512
Sum Of Even Digits:2
dbit@it6-44:~/Desktop/Java_Lab_AJA$ javac SumOfDigits.java
dbit@it6-44:~/Desktop/Java_Lab_AJA$ java SumOfDigits
Enter a no. to check sum of even digits:
284
Sum Of Even Digits:14
*/
