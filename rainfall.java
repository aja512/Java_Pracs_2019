import java.util.Scanner;
public class rainfall
{
	public static void main(String args[])
	{
		int i,n;
		double sum1=0,s2=0,s3=0;
		Scanner obj1=new Scanner(System.in);
		Scanner obj2=new Scanner(System.in);
		Scanner obj3=new Scanner(System.in);
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter no. of talukas:");
		n=obj.nextInt();
		System.out.println("Enter rainfall,temperature,humidity for  talukas:"+n);
	
		for(i=0;i<n;i++)
		{
			Double[] rain=obj1.nextDouble();
			Double[] temp=obj2.nextDouble();
			Double[] humi=obj3.nextDouble();
			sum1+=rain[i];
			s2+=temp[i];
			s3+=temp[i];
		}
		double a1=sum1/n;
		double a2=s2/n;
		double a3=s3/n;
		System.out.println("Avg Rainfall:"+a1);
		System.out.println("Avg Temperature:"+a2);
		System.out.println("Avg Humidity:"+a3);
		double largerain=(r1>r2)?r1:r2;
		double largestrai=(largerain>r3)?largerain:r3;
		double largestrain=(largestrai>r4)?largestrai:r4;
		double lr=(largestrain>r5)?largestrain:r5;
		System.out.println("Largest Rainfall"+lr);
		double srain=(r1<r2)?r1:r2;
		double strai=(srain<r3)?srain:r3;
		double smrain=(strai<r4)?strai:r4;
		double smr=(smrain<r5)?smrain:r5;
		System.out.println("Smallest Rainfall"+smr);
		/*
		*/
		double larget=(t1>t2)?t1:t2;
		double t=(larget>t3)?larget:t3;
		double lat=(t>t4)?t:t4;
		double lt=(lat>t5)?lat:t5;
		System.out.println("Largest Temperature"+lt);
		double smallt=(t1<t2)?t1:t2;
		double s1t=(smallt<t3)?smallt:t3;
		double s2t=(s1t<t4)?s1t:t4;
		double st=(s2t<t5)?s2t:t5;
		System.out.println("Smallest Temperature"+st);
		/*
		*/
		double largeh=(h1>h2)?h1:h2;
		double ht=(largeh>t3)?largeh:t3;
		double hlat=(ht>t4)?ht:t4;
		double lht=(hlat>t5)?hlat:t5;
		System.out.println("Largest Humidity"+lht);
		double smallh=(h1<h2)?h1:t2;
		double s1h=(smallh<h3)?smallh:h3;
		double s2h=(s1h<h4)?s1h:h4;
		double sh=(s2h<h5)?s2h:h5;
		System.out.println("Largest Humidity"+sh);
	}
}
