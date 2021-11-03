import java.util.*;
public class VariousNumbers {

    public static void main(String[] args) {
        System.out.println("Armstrong Numbers 1 to 10000 >>");
        for (int i = 1; i <= 10000; i++) {
            if (Armstrong(i) == true) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nPalindrome Numbers 100 to 300 >>");
        for (int i = 100; i <= 300; i++) {
            if (Palindrome(i) == true) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nPrime Numbers up to 100 >>");
        for (int i = 1; i <= 100; i++) {
            if (Prime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean Armstrong(int num) {
        int num1 = num;
        /* Converting Integer to String. It'll help to find number of
        digits in the Integer by using length() */
        String str = Integer.toString(num);
        int rem;
        int result = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            result = result + ((int) Math.pow(rem, str.length()));
        }
        if (result == num1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Palindrome(int num) {
        int num1 = num;
        int rem;
        int result = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            result = (result + rem) * 10;
        }
        result /= 10;
        if (result == num1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Prime(int num) {
        if (num < 2) {
            return false;
        }
        int div = num / 2;
        for (int i = 2; i <= div; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    static int factorial(int n)
    {
        if (n == 0)
          return 1;
         
        return n*factorial(n-1);
    }
     
    // Driver method
    public static void main(String[] args) 
    {
        int num = 5;
        System.out.println("Factorial of "+ num + " is " + factorial(5));
    }
    long reversDigits(long num)
    {
        long rev_num = 0;
        while (num > 0)
        {
            rev_num = rev_num*10 + num%10;
            num = num/10;
        }
        return rev_num;
    }
 
    /* Function to check whether he number is
           palindrome or not */
    boolean isPalindrome(long num)
    {
        return (reversDigits(num) == num);
    }
 
    /* Reverse and Add Function */
    void ReverseandAdd(long num)
    {
        long rev_num = 0;
        while (num <= 4294967295l)
        {
            // Reversing the digits of the number
            rev_num = reversDigits(num);
 
            // Adding the reversed number with the original
            num = num + rev_num;
 
            // Checking whether the number is palindrome or not
            if(isPalindrome(num))
            {
                System.out.println(num);
                break;
            }
            else if (num > 4294967295l)
            {
                System.out.println("No palindrome exist");
            }
        }
    }
     
    // Main method
    public static void main(String[] args) 
    {
        ReverseAdd ob = new ReverseAdd();
        ob.ReverseandAdd(195l);
        ob.ReverseandAdd(265l);
         
    }
}
