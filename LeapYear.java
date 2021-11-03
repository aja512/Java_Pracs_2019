import java.util.Scanner;
public class LeapYear
{
	public static void main(String args[])
	{
		int Year;
		System.out.println("Enter a Year to Check Whether its a leap year or not:");
		Scanner obj=new Scanner(System.in);
		Year=obj.nextInt();
		if((Year%4==0)&&(Year%100!=0)||(Year%400==0))
		System.out.println("Leap Year:"+Year);
		else
		System.out.println("Not a Leap Year:"+Year);
		obj.close();
		
	}
}
/*
O/P:-
dbit@it6-44:~/Desktop/Java_Lab_AJA$ javac LeapYear.java
dbit@it6-44:~/Desktop/Java_Lab_AJA$ java LeapYear
Enter a Year to Check Whether its a leap year or not:
1999
Not a Leap Year:1999
dbit@it6-44:~/Desktop/Java_Lab_AJA$ javac LeapYear.java
dbit@it6-44:~/Desktop/Java_Lab_AJA$ java LeapYear
Enter a Year to Check Whether its a leap year or not:
2012
Leap Year:2012
dbit@it6-44:~/Desktop/Java_Lab_AJA$ javac LeapYear.java
dbit@it6-44:~/Desktop/Java_Lab_AJA$ java LeapYear
Enter a Year to Check Whether its a leap year or not:
1900
Not a Leap Year:1900
dbit@it6-44:~/Desktop/Java_Lab_AJA$ javac LeapYear.java
dbit@it6-44:~/Desktop/Java_Lab_AJA$ java LeapYear
Enter a Year to Check Whether its a leap year or not:
2000
Leap Year:2000

*/
