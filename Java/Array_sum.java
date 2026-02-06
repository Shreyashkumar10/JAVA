
public class Array_sum {

    public static void main( String[] arg){

        int arr[] = {141,324,345,674,23,225,674,74};

        int  sum = 0;
        for ( int i =0 ;i< arr.length ;i++) {
            
             sum = sum + arr[i];
        
            }
            
        System.out.println("The sum of the elements of the array is " + sum);
    }
}
