import java.util.*;

public class Fibonacci {
      public  static void main( String arg[] ){
        
        Scanner sc = new Scanner( System.in );
        
        System.out.println( " Enter the number  for Fibonacci Series  " );

        int key = sc.nextInt();
        int a = 0 ;
        int b = 1;
        int lastTerm = -1;
        
    for( int i =0 ; i< key ;i++  ){
      System.out.print( a + " "  );
      lastTerm = a;
      int num = a + b;
      a = b;
      b = num;
    }

    if (key > 0) {
      System.out.println("\nThe last Fibonacci term is " + lastTerm);
    } else {
      System.out.println("No terms to display for input: " + key);
    }

    sc.close();
      }
}