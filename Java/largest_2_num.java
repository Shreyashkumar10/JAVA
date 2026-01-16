import java.util.*;

public class largest_2_num {
 
    public  static void main( String arug[] ){
        Scanner sc=  new Scanner(System.in);
        
        System.out.println( " Enter the two number  ");
        double a= sc.nextDouble();
        double b = sc.nextDouble();
        if ( a == b){
            System.out.println(" Both number are equal  ");
        }
        else if (a>b){
            System.out.println("The number  " + a + " is greater than " + b );
        }
        else{
         System.out.println("The number  " + b + " is greater than " + a );
        }

    }
}
