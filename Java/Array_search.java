import java.util.*;

public class Array_search {
    public static void main( String[] arg ){

        int arr[] = {54,36,3,245,9,754,24,6,35,7};

        System.out.println(" Array  : ");
            for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i] + " ");
            }

        Scanner sc = new Scanner(System.in);

        System.out.println("\n Enter the  key to be searched in the array ");
        int key = sc.nextInt();

       
        for(int i=0;i<arr.length;i++){
                
            if ( arr[i] == key ) {
                System.out.println(" The key " + key + " is present in the index  " + i );
                return;
            }
           
            
        }

            System.out.println(" The key  is not present in the array  "  );



    } 

}
