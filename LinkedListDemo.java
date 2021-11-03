package dbit;
import java.util.*;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
class Test 
{ 
    public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
}
class Phonebook
{
	String Name,email_ID;
	double contact_no;
	
}

public class LinkedListDemo extends Phonebook
{
	Test t=new Test();
	static LinkedList ll = new LinkedList();
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[])
	{
		System.out.println("Enter the no. of contacts you want to store:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter contact name:");
			String name=sc.next();
			ll.add(name);
			System.out.println("Enter contact no.:");
			double ph=sc.nextDouble();
			ll.add(ph);
			System.out.println("Enter contact email-id:");
			String e=sc.next();
			ll.add(e);
			if(Test.isValid(e))
			System.out.println("Valid email ID");
			else
			System.out.println("Not a Valid email ID");
		}
		System.out.println(""+ll);
	}
}