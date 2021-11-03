package dbit;
import java.util.Scanner;

public class StringD 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		String s1;
		String s2;
		System.out.println("Enter 1st string :");
		s1=sc.next();
		System.out.println("Enter 2nd string :");
		s2=sc.next();
		System.out.println(""+s1.concat(s2));
		System.out.println("Length of s1:"+s1.length());
		System.out.println("Length of s2:"+s2.length());
		String str1 = "Strings are immutable";
	      String str2 = new String("Strings are immutable");
	      String str3 = new String("Integers are not immutable");
	      
	      int result = str1.compareTo( str2 );
	      System.out.println("str1>str2:"+result);
	      
	      result = str2.compareTo( str3 );
	      System.out.println("str2>str3:"+result);
	      String Str1 = new String("Welcome to Tutorialspoint.com");
	      char[] Str2 = new char[7];
	      try 
	      {
	         Str1.getChars(5, 11, Str2, 0);
	         System.out.print("Copied Value = " );
	         System.out.println(Str2 );
	      } 
	      catch ( Exception ex)
	      {
	         System.out.println("Raised exception..."); 
	      }
	      String Str = new String("Welcome to Tutorialspoint.com");
	      System.out.print("Found Index :" );
	      System.out.println(Str.indexOf( 'o', 5 ));
	    		  
	      String Str11 = new String("Welcome to Tutorialspoint.com");

	      System.out.print("Return Value :" );
	      System.out.println(Str11.replace('o', 'T'));

	      System.out.print("Return Value :" );
	      System.out.println(Str11.replace('l', 'D'));
	      
	      String Str22 = new String("Monkey-D.Luffy");
	      System.out.println("Return Value :" );      
	      
	      for (String retval: Str22.split("-"))
	      {
	         System.out.println(retval);
	      }
	      System.out.println(""+s1.toLowerCase());
	      System.out.println(""+s2.toUpperCase());
	      System.out.println("String trim:"+s1.trim());
	}
}
/*
 *Output:-
 *Enter 1st string :
Amanda
Enter 2nd string :
Judy
AmandaJudy 
Length of s1:6
Length of s2:4
str1>str2:0
str2>str3:10
Copied Value = lcome t
Copied Value = me to
Found Index :9
Return Value :WelcTme tT TutTrialspTint.cTm
Return Value :WeDcome to TutoriaDspoint.com
Return Value :
Monkey
D.Luffy
amanda
ANDRADE
String trim:Amanda

 */
