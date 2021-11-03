#include<stdio.h>

int main ()
{
	int r,c,k,m,n,p,a[20][20],b[20][20],re[20][20];
	printf("Enter rows and cols of A:");
	scanf("%d%d",&m,&n);
	printf("Enter elements:");
	for(r=0;r<m;r++)
	{
		for(c=0;c<n;c++)
		{
			scanf("%d",&a[r][c]);
		}
	}
	printf("Enter cols of B:");
	scanf("%d",&p);
	printf("Enter elements:");
	for(r=0;r<n;r++)
	{
		for(c=0;c<p;c++)
		{
			scanf("%d",&b[r][c]);
		}
	}
	
	for(r=0;r<m;r++)
	{
		for(c=0;c<p;c++)
		{
			re[r][c]=0;
			for(k=0;k<n;k++)
			{
				re[r][c]+=a[r][k]*b[k][c];
			}
		}
		re[r][c]=0;
		
	}

	printf("Resultant:\n");
	for(r=0;r<m;r++)
	{
		for(c=0;c<p;c++)
		{
			printf("%d\t",re[r][c]);
		}
		printf("\n");
	}
	return 0;
}
/*
dbit@it6-42:~/Desktop$ gcc matrix.c -o matrixout
dbit@it6-42:~/Desktop$ ./matrixout
Enter rows and cols of A:3
3
Enter elements:1
0
0
0
1
0
0
0
1
Enter cols of B:3
Enter elements:1
0
0
0
1
0
0
0
1
Resultant:
1	0	0	
0	1	0	
0	0	1	
dbit@it6-42:~/Desktop$ 
*/
