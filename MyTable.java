import java.util.Scanner;

public class MyTable
{

public static void main(String[] args)
{
	Scanner obj1= new Scanner(System.in);
	System.out.println("Enter your number for mul table: "+"\n");
		int n=obj1.nextInt();
	for(int i=1;i<=10;i++)
	{
		int p=n*i;
		System.out.print(" "+n);
		System.out.print(" X "+i);
		System.out.println(" = "+p+"\n");
	}
	obj1.close();

}
}	
/*
O/P:
dbit@it6-44:~/Desktop/Java Lab AJA$ javac MyTable.java
dbit@it6-44:~/Desktop/Java Lab AJA$ java MyTable
Enter your number for mul table: 

15
 15 X 1 = 15

 15 X 2 = 30

 15 X 3 = 45

 15 X 4 = 60

 15 X 5 = 75

 15 X 6 = 90

 15 X 7 = 105

 15 X 8 = 120

 15 X 9 = 135

 15 X 10 = 150

*/
