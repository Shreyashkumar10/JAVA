import java.util.*;

public class Array_user {
    public static void main( String[] arg ){
        
        Scanner sc =  new Scanner(System.in);

        System.out.println( " \n Enter the number  of the array");
        int n = sc.nextInt();
       int[] arr = new  int[n];
        System.out.println( " \n Enter the  elements  of the array");
        for(int i =0 ;i<n ;i++ ){
            
             arr[i] = sc.nextInt();

        }


    System.out.println( " The  elements  of the array");    
        for ( int i =0 ;i< arr.length ;i++) {
            
            System.out.println( arr[i]  );        
        }

    }
}
