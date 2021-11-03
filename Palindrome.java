import java.util.Scanner;

public class Palindrome
{

public static void main(String[] args)
{
	String text,reversetext="";
	Scanner obj1= new Scanner(System.in);
	System.out.println("Enter a string to check: ");
		text=obj1.next();
	int l=text.length();
	for(int i=l-1;i>=0;i--)
	{
		reversetext=reversetext+text.charAt(i);
	}
	if(text.equals(reversetext))
	{
		System.out.println("Its a Palindrome");
	}
	else
	{
	System.out.println("Its NOT a Palindrome");
	}
	
}

}
/*
O/P:
dbit@it6-44:~/Desktop/Java Lab AJA$ javac Palindrome.java
^[[Adbit@it6-44:~/Desktop/Java Lab AJA$ java Palindrome
Enter a string to check: 
nitin
Its a Palindrome
dbit@it6-44:~/Desktop/Java Lab AJA$ javac Palindrome.java
dbit@it6-44:~/Desktop/Java Lab AJA$ java Palindrome
Enter a string to check: 
Ajay
Its NOT a Palindrome
dbit@it6-44:~/Desktop/Java Lab AJA$ 







*/
