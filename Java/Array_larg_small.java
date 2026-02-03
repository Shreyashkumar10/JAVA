//import java.util.*;

public  class  Array_larg_small{
    public static void main(  String[] arg ){

        int arr[]= {134,432,2,34,56,241,556,21,54,4};

        int l = arr[0];
        int s = arr[0];
        for(int i = 0 ; i< arr.length ;i++){
            if ( arr[i] >  l   ){
                l = arr[i];
            }
            if (arr[i]< s){
                s = arr[i];
            }
        } 

        System.out.println("The largest element in the array is  " + l );

        System.out.println("The smallest element in the array is  " + s );        

    }
}