import java.io.*;

public class StringDemo 
{
 	  public static void main(String args[])
 	  {
		  String Str1 = new String("Welcome to Tutorialspoint.com");
		  String Str2 = new String("WELCOME TO TUTORIALSPOINT.COM");

		  System.out.print("Canonical representation:" );
		  System.out.println(Str1.intern());

		  System.out.print("Canonical representation:" );
		  System.out.println(Str2.intern());
		  System.out.println("result");
		  if(Str1.equals(Str2))
		  	System.out.println("match");
      	  if(Str1.intern()==Str2.intern())
		  	System.out.println("match");
      
      }
}
/*
O/P:-
E.G:-
.docx files can open on libreoffice,but word doesn't let you make changes to .odt file.

dbit@it6-44:/media/dbit/AIKO/AJA BE-IT/SEMESTER 3/Java_Lab_AJA$ javac StringDemo.java
dbit@it6-44:/media/dbit/AIKO/AJA BE-IT/SEMESTER 3/Java_Lab_AJA$ java StringDemo
Canonical representation:Welcome to Tutorialspoint.com
Canonical representation:WELCOME TO SUTORIALSPOINT.COM
dbit@it6-44:/media/dbit/AIKO/AJA BE-IT/SEMESTER 3/Java_Lab_AJA$ javac StringDemo.java
dbit@it6-44:/media/dbit/AIKO/AJA BE-IT/SEMESTER 3/Java_Lab_AJA$ java StringDemo
Canonical representation:Welcome to Tutorialspoint.com
Canonical representation:WELCOME TO SUTORIALSPOINT.COM
dbit@it6-44:/media/dbit/AIKO/AJA BE-IT/SEMESTER 3/Java_Lab_AJA$ javac StringDemo.java
dbit@it6-44:/media/dbit/AIKO/AJA BE-IT/SEMESTER 3/Java_Lab_AJA$ java StringDemo
Canonical representation:Welcome to Tutorialspoint.com
Canonical representation:WELCOME TO SUTORIALSPOINT.COM
dbit@it6-44:/media/dbit/AIKO/AJA BE-IT/SEMESTER 3/Java_Lab_AJA$ javac StringDemo.java
dbit@it6-44:/media/dbit/AIKO/AJA BE-IT/SEMESTER 3/Java_Lab_AJA$ java StringDemo
Canonical representation:Welcome to Tutorialspoint.com
Canonical representation:WELCOME TO SUTORIALSPOINT.COM
result
dbit@it6-44:/media/dbit/AIKO/AJA BE-IT/SEMESTER 3/Java_Lab_AJA$ javac StringDemo.java
dbit@it6-44:/media/dbit/AIKO/AJA BE-IT/SEMESTER 3/Java_Lab_AJA$ java StringDemo
Canonical representation:Welcome to Tutorialspoint.com
Canonical representation:WELCOME TO SUTORIALSPOINT.COM
result
dbit@it6-44:/media/dbit/AIKO/AJA BE-IT/SEMESTER 3/Java_Lab_AJA$ javac StringDemo.java
dbit@it6-44:/media/dbit/AIKO/AJA BE-IT/SEMESTER 3/Java_Lab_AJA$ java StringDemo
Canonical representation:Welcome to Tutorialspoint.com
Canonical representation:WELCOME TO TUTORIALSPOINT.COM
result
dbit@it6-44:/media/dbit/AIKO/AJA BE-IT/SEMESTER 3/Java_Lab_AJA$ java StringDemo


*/
