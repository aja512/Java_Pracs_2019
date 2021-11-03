
import java.util.Scanner;

public class MyClass{
/*
This is my first java program
first java program MyClass
*/
public static void main(String[] args){
System.out.println("Hello World");
Scanner obj1= new Scanner(System.in);
System.out.println("Enter your name: ");
	String name=obj1.next();
System.out.println("Enter your c.g.p.a.: ");
	float marks=obj1.nextFloat();
System.out.println("Enter your roll no: ");
	int r_no=obj1.nextInt();
System.out.print("Your name is:\n"+name);
System.out.print("Your marks are:\n"+marks);
System.out.print("Your Roll no is:\n"+r_no);
obj1.close();
}

}
/*
O/P:
dbit@it6-44:~/Desktop/Java Lab$ javac MyClass.java
dbit@it6-44:~/Desktop/Java Lab$ java MyClass
Hello World
Enter your name: 
Amanda Judy Andrade
Your name is:Amandadbit@it6-44:~/Desktop/Java Lab$ 

dbit@it6-44:~/Desktop/Java Lab$ javac MyClass.java
dbit@it6-44:~/Desktop/Java Lab$ java MyClass
Hello World
Enter your name: 
Amanda
Enter your c.g.p.a.: 
8
Enter your roll no: 
2
Your name is:AmandaYour marks are:8Your Roll no is:2dbit@it6-44:~/Desktop/Java Lab$ 

dbit@it6-44:~/Desktop/Java Lab$ javac MyClass.java
dbit@it6-44:~/Desktop/Java Lab$ java MyClass
Hello World
Enter your name: 
Amanda
Enter your c.g.p.a.: 
8.52
Enter your roll no: 
2
Your name is:
AmandaYour marks are:
8.52Your Roll no is:
2dbit@it6-44:~/Desktop/Java Lab$ 

dbit@it6-44:~/Desktop/Java Lab AJA$ javac MyClass.java
dbit@it6-44:~/Desktop/Java Lab AJA$ java MyClass
Hello World
Enter your name: 
abcd
Enter your c.g.p.a.: 
2.3
Enter your roll no: 
2
Your name is:abcd
Your marks are:2.3
Your Roll no is:2
dbit@it6-44:~/Desktop/Java Lab AJA$ 

*/
