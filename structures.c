#include<stdio.h>
struct stu
{
	int rno;
	char name[50];
	float s1,s2,s3,s4,s5;
	float total =0;
	float percent=0;
};
int main()
{
	struct stu s[100],temp;
	int n,i,j;
	
	printf("Enter no of students marks you want to enter:\n");
	scanf("%d",&n);
	printf("Enter student details:\n");
	for(i=0;i<n;i++)
	{
		printf("Enter students name roll no and marks of 5 subjects:\n");
		gets(s[i].name);
		scanf("%d%f%f%f%f%f",&s[i].rno,&s[i].s1,&s[i].s2,&s[i].s3,&s[i].s4,&s[i].s5);
		s[i].total=s[i].s1+s[i].s2+s[i].s3+s[i].s4+s[i].s5;
		s[i].percent=(s[i].total)/5;
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<(n-1);j++)
		{
			if(s[j].total<s[j+1].total)
			{
				temp=s[j];
				s[j]=s[j+1];
				s[j+1]=temp;
			}
		}

	}
	printf("Name\tRoll no\tEng\tHistory\tMaths\tScience\tHindi\tTotal\tPercentage\n---------------------------------------------------------------------\n");
	for(i=0;i<n;i++)	
	{
		printf("%s\t%d\t%.2f\t%.2f\t%.2f\t%.2f%\t%.2f\t%.2f\t%.2f\n",s[i].name,s[i].rno,s[i].s1,s[i].s2,s[i].s3,s[i].s4,s[i].s5,s[i].total,s[i].percent);
	}
	return 0;
}
