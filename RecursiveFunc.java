package dbit;
import java.util.*;
import static java.lang.StrictMath.pow;
class GCD
{
	static int gcd(int a, int b) 
    {   
        if (a == 0 || b == 0) 
           return 0; 
       
        if (a == b) 
            return a; 

        if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
    } 

    static int lcm(int a, int b) 
    { 
        return (a*b)/gcd(a, b); 
    } 
}
class FIB
{
	static void fibo(int n1)
	{
		int a = 0, b = 1; 
	    if (n1 >= 0) 
	        System.out.print(a + " "); 
	    if (n1>= 1) 
	        System.out.print(b + " "); 
	    for (int i = 2; i <= n1; i++)  
	    { 
	        System.out.print(a + b + " "); 
	        b = a + b; 
	        a = b - a; 
	    } 
	}
}
class REV
{
	 static int reverse(int x, int length)
	 {
		 if(length == 1)
	     {
			 return x;
	     }
	     else
	     {
	    	 int b = x % 10;
	         x = x / 10;
	         return (int) ((b * pow(10, length - 1)) + reverse(x, --length));
	     }
	 }
}
class SUM
{
	static int findSum(int A[], int N)
    {
        if (N <= 0)
        return 0;
        else
        return (findSum(A, N - 1) + A[N - 1]);
    }
 
}
public class RecursiveFunc 
{
	 GCD o1=new GCD();
	 FIB o2=new FIB();
	 REV o3=new REV();
	 SUM o4=new SUM();
	 static Scanner sc=new Scanner(System.in);
	 public static void main(String args[])
	 {
		 int p,ch,n1,n2,count=0;
		 
		 do
		 {
			 System.out.println("         MENU         ");
			 System.out.println("1. GCD & LCM");
			 System.out.println("2. FIBONACCI OF N NOS");
			 System.out.println("3. REVERSE OF A NO.");
			 System.out.println("4. SUM OF N NATURAL NOS. ");
			 ch=sc.nextInt();
			 switch(ch)
			{
				 case 1:System.out.println("Enter no.1");
				 		n1=sc.nextInt();
				 		System.out.println("Enter no.2");
				 		n2=sc.nextInt();
					 	System.out.println("LCM of " + n1 +" and " + n2 + " is " + GCD.lcm(n1, n2)); 
				 		System.out.println("GCD of " + n1 +" and " + n2 + " is " + GCD.gcd(n1,n2)); 
				 		break;
				 case 2:int a=0,b=1;
					 	System.out.println("Enter no . of terms:");
				 		n1=sc.nextInt();
				 		FIB.fibo(n1);
				 		break;
				 case 3:System.out.println("Enter no.:");
			 			n1=sc.nextInt();
			 			n2=n1;
			 			while(n2>0)
			 			{
			 				count++;
			 				n2=n2/10;
			 			}
			 			System.out.println("Reverse of "+n1+" is "+REV.reverse(n1,count));
			 			break;
				 case 4:int[] intArray = new int[20];
				 		System.out.println("Enter no. of terms:");
			 			n1=sc.nextInt();
			 			System.out.println("Enter array elements:");
			 			for(int i=0;i<n1;i++)
			 			{
			 				intArray[i]=sc.nextInt();
			 			}
			 			System.out.println("Sum of Array "+SUM.findSum(intArray, n1));
			 			break;
			 	default:System.out.println("INVALID INPUT!!!");
			 			break;
			}	
			System.out.println("Do you wish to continue? "+"\n"+" Press 1 for Yes & 0 for No");
			p=sc.nextInt();
		 }
		 while(p!=0);
	 }
}
/*
 *         MENU         
1. GCD & LCM
2. FIBONACCI OF N NOS
3. REVERSE OF A NO.
4. SUM OF N NATURAL NOS. 
1
Enter no.1
15
Enter no.2
25
LCM of 15 and 25 is 75
GCD of 15 and 25 is 5
Do you wish to continue? 
 Press 1 for Yes & 0 for No
1
         MENU         
1. GCD & LCM
2. FIBONACCI OF N NOS
3. REVERSE OF A NO.
4. SUM OF N NATURAL NOS. 
4
Enter no. of terms:
5
Enter array elements:
1
2
3
4
5
Sum of Array 15
Do you wish to continue? 
 Press 1 for Yes & 0 for No
 1
          MENU         
1. GCD & LCM
2. FIBONACCI OF N NOS
3. REVERSE OF A NO.
4. SUM OF N NATURAL NOS. 
3
Enter no.:
512
Reverse of 512 is 215
Do you wish to continue? 
 Press 1 for Yes & 0 for No
1
         MENU         
1. GCD & LCM
2. FIBONACCI OF N NOS
3. REVERSE OF A NO.
4. SUM OF N NATURAL NOS. 
2
Enter no . of terms:
9
0 1 1 2 3 5 8 13 21 34 Do you wish to continue? 
 Press 1 for Yes & 0 for No
*/