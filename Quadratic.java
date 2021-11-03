import java.util.Scanner;
import java.lang.Math.*;
public class Quadratic
{

public static void main(String[] args)
{
	Scanner o1= new Scanner(System.in);
	Scanner o2= new Scanner(System.in);
	Scanner o3= new Scanner(System.in);
	System.out.println("Enter quadratic equn as ax^2+bx+c=0: ");
	double a=o1.nextInt();
	double b=o2.nextInt();
	double c=o3.nextInt();
	double d=b*b-4*(a*c);
	
	if(d>=0)
	{
		System.out.print("Roots are real and equal"+"\n");
	}
	else if(d<0)
	{
		System.out.print("Roots are imaginary"+"\n");
	}
	double r1=0,r2=0;
	r1=(-b+Math.sqrt(d))/(2*a);
	r2=(-b-Math.sqrt(d))/(2*a);
	System.out.println( "Roots are:");
	System.out.println("root 1= "+r1+"\n");
	System.out.println("root 2= "+r2+"\n");
	
	o1.close();
	o2.close();
	o3.close();
}

}		
/*
O/P:
dbit@it6-44:~/Desktop/Java Lab AJA$ javac Quadratic.java
dbit@it6-44:~/Desktop/Java Lab AJA$ java Quadratic
Enter quadratic equn as ax^2+bx+c=0: 
1
-5
6
Roots are real
Roots are:
root 1= 3.0

root 2= 2.0

dbit@it6-44:~/Desktop/Java Lab AJA$ javac Quadratic.java
dbit@it6-44:~/Desktop/Java Lab AJA$ java Quadratic
Enter quadratic equn as ax^2+bx+c=0: 
1
0
1
Roots are imaginary
Roots are:
root 1= NaN

root 2= NaN

dbit@it6-44:~/Desktop/Java Lab AJA$ 
*/
