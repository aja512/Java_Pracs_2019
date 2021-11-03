import java.util.Scanner;

public class countvow
{

	public static void main(String[] args)
	{
		String text;
		int vow=0;
		int conso=0;
		
		Scanner obj1= new Scanner(System.in);
		System.out.println("Enter a string to count: ");
		text=obj1.nextLine();
		int l=text.length();
		for(int i=0;i<l;i++)
		{
			char ch=text.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vow++;
			}
			else
			if(Character.isLetter(ch))
			{
				conso++;
			}
			
		}
		System.out.println("String = "+text);
		System.out.println("No. of vowels = "+vow);
		System.out.println("No. of conso = "+conso);
		obj1.close();
	}

}
/*O/P:-
dbit@it6-44:~/Desktop/Java_Lab_AJA$ javac countvow.java
dbit@it6-44:~/Desktop/Java_Lab_AJA$ java countvow
Enter a string to count: 
amanda andrade
String = amanda andrade
No. of vowels = 6
No. of conso = 7
dbit@it6-44:~/Desktop/Java_Lab_AJA$ 


*/		
