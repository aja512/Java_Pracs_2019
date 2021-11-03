import java.util.Scanner;
public class charfreq
{
	public static void main(String args[])
	{
		String a;
		int i,freq=0;
		System.out.println("Enter a string:");
		Scanner obj=new Scanner(System.in);
		a=obj.nextLine();
		int l=a.length();
		for(i=0;i<l;i++)
		{
			char ch=a.charAt(i);
			if(ch=='a'||ch=='A')
			freq++;
		}
		System.out.println("Occurence of Letter A/a:"+freq);
		obj.close();
	}
}
/*
O/P:-
dbit@it6-44:~/Desktop/Java_Lab_AJA$ javac charfreq.java
dbit@it6-44:~/Desktop/Java_Lab_AJA$ java charfreq
Enter a string:
Amanda Judy Andrade
Occurence of Letter A/a:5
dbit@it6-44:~/Desktop/Java_Lab_AJA$ 
*/
