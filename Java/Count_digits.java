
import java.util.*;

public class Count_digits{

    public static void main( String  arg[]){

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the number to count the digits");
        long a = sc.nextLong();

        int b = 0 ;
        while ( a !=0  ) { 
            b ++ ;
            a = a/10;
        }   
        System.out.println( " The number digits in  the number  is  " + b);
        sc.close();
    }
}

