#include<stdio.h>
#include<string.h>
int main ()
{
	int a,cpy,dig=0, rev=0;
	printf("Enter first no:");
	scanf("%d",&a);
	cpy=a;
	while(a!=0)
	{
		dig=a%10;
		rev=rev*10+dig;
		a/=10;
	}
	if(cpy==rev)
	printf("palindrome");
	else
	printf("Not a palindrome");
	return 0;
}
/*O/P:
Enter first no:121
palindrome
Enter first no:315
Not a palindrome
*/
