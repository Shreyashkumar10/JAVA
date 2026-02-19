import java.util.*;

public class Palindrome_number{
    public static void main( String arg[] ){

        Scanner input=  new Scanner(System.in);

        System.out.println( "Enter a number to check whether a number is palindrome ");
        int a = input.nextInt();
        int temp = a;
        int rev =0;
        
        while ( a!=0) { 
            rev = rev *10 + a%10;
            a /= 10;
        }
        
        if (rev == temp) {
         System.out.println("The number is plaindrome");
            
        }
        else{
             System.out.println("The number is not plaindrome");
        }
    }
}



