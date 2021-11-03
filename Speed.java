import java.util.Scanner;
import java.lang.Math.*;

public class Speed 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		double a,u,t,d;
		System.out.println("Enter initial speed,acceleration & time of vehicle:");
		u=sc.nextDouble();
		a=sc.nextDouble();
		t=sc.nextDouble();
		d=u*t+0.5*a*Math.pow(t,2);
		System.out.println("Total Distance:"+d);
		sc.close();
	}
}
