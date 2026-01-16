import java.util.*;
 
public class Largest_3_number {
    public static void main( String arug[]){

        System.out.println( " Enter the  3 numbers   ");
        
        Scanner sc = new  Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


    if( a > b && a > c ){
        System.out.println(" The Largest number among the three  numbers is " + a);  
    }        
    else    if( b > a && b > c ){
        System.out.println(" The Largest number among the three  numbers is " + b);

    }   
    else        
    {
        System.out.println(" The Largest number among the three  numbers is " + a);  
    }        

    }     


}
    

