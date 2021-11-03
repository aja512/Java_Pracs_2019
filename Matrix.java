/*
Write the Menu driven program to perform
a) Addition of two matrices of order m*n and p*q
b) Multiplication of two matrices of order m*n and p*q
c) Transpose of matrix of order m*n
d) addition of diagonal and non-diagonal elements
*/
//
package dbit;
import java.util.*;
class Add
{
	static void add(int a[][],int b[][],int c[][],int p,int q,int m,int n)
	{
		System.out.println("First Matrix:");
        for (int i = 0; i < p; i++) 
        {
            for (int j = 0; j < q; j++) 
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Second Matrix:");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < p; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                for (int k = 0; k < q; k++) 
                {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
        }
        System.out.println("Matrix after addition:");
		for (int i = 0; i < p; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println("");
		}
	}
}

class Mul
{
	static void multi(int a[][],int b[][],int mu[][],int q,int m,int n)
	{
		int sum=0;
		for(int r=0;r<m;r++)
		{
			for(int c=0;c<q;c++)
			{
				for(int k=0;k<n;k++)
				{
					sum+=a[r][k]*b[k][c];
				}
				mu[r][c] = sum;
	           sum = 0;
			}
		}
		System.out.println("Product of entered matrices:-");
		for(int r=0;r<m;r++)
		{
			for(int c=0;c<q;c++)
			{
				System.out.print(mu[r][c]+"\t");
			}
			System.out.print("\n");
		}
	}
}
class Tra
{
	static void transpose(int a[][],int b[][],int m,int n)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		System.out.println("Transpose of Matrix:-");
		for(int r=0;r<n;r++)
		{
			for(int c=0;c<m;c++)
			{
				System.out.print(b[r][c]+"\t");
			}
			System.out.print("\n");			
		}
	}
}
class Diago
{
	static void Sum(int a[][],int m,int n)
	{
		int sum=0,sum1=0;
		for(int r=0;r<m;r++)
		{
			for(int c=0;c<n;c++)
			{
				if(r==c)
				{
					sum+=a[r][c];
				}
				else
				{
					sum1+=a[r][c];
				}
			}
		}
		System.out.println("Sum of Diagonal elements: "+sum);
		System.out.println("Sum of Non-diagonal elements: "+sum1);
	}
}
public class Matrix
{
	Add o1=new Add();
	Mul o2=new Mul();
	Tra o3=new Tra();
	Diago o4=new Diago();
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int fin,ch,p,q, m, n;
		do
		{
			System.out.println("         MENU         ");
			System.out.println("1.	Addition of 2 Matrices");
			System.out.println("2.	Multiplication of 2 Matrices");
			System.out.println("3.	Transpose of matrix");
			System.out.println("4.	Addition of Diagonal and Non-Diagonal Elements");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:System.out.print("Enter number of rows in first matrix:");
				        p = sc.nextInt();
				        System.out.print("Enter number of columns in first matrix:");
				        q = sc.nextInt();
				        System.out.print("Enter number of rows in second matrix:");
				        m = sc.nextInt();
				        System.out.print("Enter number of columns in second matrix:");
				        n = sc.nextInt();
				        if((p==m)&&(q==n))
				        {
				        	int a[][] = new int[p][q];
				            int b[][] = new int[m][n];
				            int c[][] = new int[m][n];
				            System.out.println("Enter all the elements of first matrix:");
				            for (int i = 0; i < p; i++) 
				            {
				                for (int j = 0; j < q; j++) 
				                {
				                    a[i][j] = sc.nextInt();
				                }
				            }
				            System.out.println("Enter all the elements of second matrix:");
				            for (int i = 0; i < m; i++) 
				            {
				                for (int j = 0; j < n; j++) 
				                {
				                    b[i][j] = sc.nextInt();
				                }
				            }
				            Add.add(a, b, c, p, q, m, n);
				        }
				        break;
				case 2:System.out.println("Enter the number of rows and columns of first matrix");
					    m = sc.nextInt();
					    n = sc.nextInt();
					 
					    int first[][] = new int[m][n];
					    System.out.println("Enter the elements of first matrix");
					    for(int r=0;r<m;r++)
					    {
					    	for(int c=0;c<n;c++)
					    	{
					    		first[r][c] = sc.nextInt();
					    	}
					    }
					    System.out.println("Enter the number of rows and columns of second matrix");
					    p = sc.nextInt();
					    q = sc.nextInt();
					    if ( n != p )
					    System.out.println("Matrices with entered orders can't be multiplied with each other.");
					    else
					    {
					    	int second[][] = new int[p][q];
					        int multiply[][]= new int[m][q];
					        System.out.println("Enter the elements of second matrix");
					        for(int r=0;r<m;r++)
						    {
						    	for(int c=0;c<n;c++)
						    	{
						    		second[r][c] = sc.nextInt();
						    	}
						    }
							Mul.multi(first, second, multiply, q, m, n);
						}	
					    break;
				case 3:System.out.println("Enter the number of rows and columns of first matrix");
					    m = sc.nextInt();
					    n = sc.nextInt();
					    int a1[][]=new int[m][n];
					    System.out.println("Enter elements:");
					    for(int r=0;r<m;r++)
						{
						   for(int c=0;c<n;c++)
						   {
						    	a1[r][c] = sc.nextInt();
						   }
						}
					    int b2[][]=new int[n][m];
					    Tra.transpose(a1,b2,m,n);
					    break;
				case 4:System.out.println("Enter the number of rows and columns of first matrix");
					    m = sc.nextInt();
					    n = sc.nextInt();
					    int d[][]=new int[m][n];
					    System.out.println("Enter elements:");
					    for(int r=0;r<m;r++)
						{
						    for(int c=0;c<n;c++)
						    {
						    	d[r][c] = sc.nextInt();
						    }
						}
					    Diago.Sum(d,m,n);
					    break;
				default:System.out.println("INVALID INPUT!!!");
						break;	    
			}
			System.out.println("Do you wish to continue? "+"\n"+" Press 1 for Yes & 0 for No");
			fin=sc.nextInt();
		}
		while(fin!=0);
	}
}
/*
dbit@it6-44:/media/dbit/HP x740w/AJA/SEMESTER 3/Java_Lab_AJA$ javac Matrix.javadbit@it6-44:/media/dbit/HP x740w/AJA/SEMESTER 3/Java_Lab_AJA$ java Matrix
         MENU         
1.	Addition of 2 Matrices
2.	Multiplication of 2 Matrices
3.	Transpose of matrix
4.	Addition of Diagonal and Non-Diagonal Elements
Enter your choice:
1
Enter number of rows in first matrix:2
Enter number of columns in first matrix:2
Enter number of rows in second matrix:2
Enter number of columns in second matrix:2
Enter all the elements of first matrix:
1
1
1
1
Enter all the elements of second matrix:
2
2
2
2
First Matrix:
1 1 
1 1 
Second Matrix:
2 2 
2 2 
Matrix after addition:
3 3 
3 3 
Do you wish to continue? 
 Press 1 for Yes & 0 for No
1
         MENU         
1.	Addition of 2 Matrices
2.	Multiplication of 2 Matrices
3.	Transpose of matrix
4.	Addition of Diagonal and Non-Diagonal Elements
Enter your choice:
2
Enter the number of rows and columns of first matrix
2
2
Enter the elements of first matrix
2
3
1
0
Enter the number of rows and columns of second matrix
2
3
Enter the elements of second matrix
1
0 
1
1
Product of entered matrices:-
5	3	0	
1	0	0	
Do you wish to continue? 
 Press 1 for Yes & 0 for No
1
         MENU         
1.	Addition of 2 Matrices
2.	Multiplication of 2 Matrices
3.	Transpose of matrix
4.	Addition of Diagonal and Non-Diagonal Elements
Enter your choice:
3
Enter the number of rows and columns of first matrix
2
2
1
1
1
1
Transpose of Matrix:-
1	1	
1	1	
Do you wish to continue? 
 Press 1 for Yes & 0 for No
4
         MENU         
1.	Addition of 2 Matrices
2.	Multiplication of 2 Matrices
3.	Transpose of matrix
4.	Addition of Diagonal and Non-Diagonal Elements
Enter your choice:
4
Enter the number of rows and columns of first matrix
1
2
1
1
Sum of Diagonal elements: 1
Sum of Non-diagonal elements: 1
dbit@it6-44:/media/dbit/HP x740w/AJA/SEMESTER 3/Java_Lab_AJA$ javac Matrix.java
dbit@it6-44:/media/dbit/HP x740w/AJA/SEMESTER 3/Java_Lab_AJA$ java Matrix
         MENU         
1.	Addition of 2 Matrices
2.	Multiplication of 2 Matrices
3.	Transpose of matrix
4.	Addition of Diagonal and Non-Diagonal Elements
Enter your choice:
3
Enter the number of rows and columns of first matrix
2
2
Enter elements:
1
2
3
4
Transpose of Matrix:-
1	3	
2	4	
Do you wish to continue? 
 Press 1 for Yes & 0 for No
1
         MENU         
1.	Addition of 2 Matrices
2.	Multiplication of 2 Matrices
3.	Transpose of matrix
4.	Addition of Diagonal and Non-Diagonal Elements
Enter your choice:
4
Enter the number of rows and columns of first matrix
2
2
Enter elements:
5
12
1999
4
Sum of Diagonal elements: 9
Sum of Non-diagonal elements: 2011
Do you wish to continue? 
 Press 1 for Yes & 0 for No
0
dbit@it6-44:/media/dbit/HP x740w/AJA/SEMESTER 3/Java_Lab_AJA$ 
*/
