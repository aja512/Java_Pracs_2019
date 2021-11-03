import java.util.Scanner;

public class countstring
{

	public static void main(String[] args)
	{
		String test="There are 25 students in IT class??or65.5??";
		count(test);
	}
	public static void count(String x)
	{
		char[] ch=x.toCharArray();
		int letter=0;
		int num=0;
		int space=0;
		int other=0;
		int l=x.length();
		for(int i=0;i<l;i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			else 
			if(Character.isDigit(ch[i]))
			{
				num++;
			}
			else 
			if(Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			else
			{
				other++;	
			}
		}
		System.out.println("The string used=There are 25 students in IT class??or65.5??");
		System.out.println("No. of Alphabets = "+letter);
		System.out.println("No. of digits = "+num);
		System.out.println("No. of spaces = "+space);
		System.out.println("No. of special symbols = "+other);
	}

}
/*
O/P:-
dbit@it6-44:~/Desktop/Java_Lab_AJA$ javac countstring.java
dbit@it6-44:~/Desktop/Java_Lab_AJA$ java countstring 
The string used=There are 25 students in IT class??or65.5??
No. of Alphabets = 27
No. of digits = 5
No. of spaces = 6
No. of special symbols = 5
dbit@it6-44:~/Desktop/Java_Lab_AJA$ 


*/
