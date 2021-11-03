import java.util.Scanner;
interface GPA
{
	final static float p=9.2f;
	public float compute(float s);
	
}
class Asc implements GPA
{
	public float compute(float s)
	{
		return((s/6)*p);
	}
}
public class CGPA 
{
	static float sum=0,pe=0;
	static Asc as=new Asc();
	GPA g;
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args)
    {
		int []a=new int [6];
		System.out.println("Enter mks of 6 subjects:");
		for(int i=0;i<6;i++)
		{
			a[i]=sc.nextInt();
		    sum=sum+a[i];
		}
		pe=(sum/600)*100;
		System.out.println("Total Marks of Student:"+sum);
		System.out.println("CGPA:"+as.compute(pe));
    }
}
/*
Enter mks of 6 subjects:
89
88
96
96
92
71
Total Marks of Student:532.0
CGPA:135.95555
*/