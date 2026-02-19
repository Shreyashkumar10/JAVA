import java.util.*;

public class Multiplication_table {

    public  static void  main( String arg[]){
        
        Scanner sc = new Scanner( System.in);

        System.out.println( " Multiplcation Table ") ;
            System.out.println(" Enter the number  ");

            int n = sc.nextInt();


            for ( int i =1 ;  i <11 ;i++){
            
                    System.out.println( " " + n  + " * " + i + " = " + ( n*i) );
            }
            sc.close();
    }
}