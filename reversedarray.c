#include<stdio.h>

int main ()
{
	int a[100],n,i;
	void reverse(int a[],int n);
	
	printf("Enter no of elements:\n");
	scanf("%d",&n);
	printf("Enter elements:\n");	
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	reverse(a,n);	
	return 0;
}
void reverse(int a[],int n)
{
	int i,rev[100];
	for(i=0;i<n;i++)
	{
		rev[n-i-1]=a[i];
	}
	printf("Reversed array:\n");	
	for(i=0;i<n;i++)
	{
		printf("%d  ",rev[i]);
	}
	
}
/*O/P:
Enter no of elements:
3
Enter elements:
1
2
3
Reversed array:
3  2  1
*/

