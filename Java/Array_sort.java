

public class Array_sort{
    public static void main( String [] arg ){

int arr[] = {54,36,3,245,9,754,24,6,35,7};

System.out.println(" Array before sorting : ");
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i] + " ");
    }

int n = arr.length;
//int arr1[]= arr;
 

for ( int j=0 ;j <n-1;j++){
    for(int i =0 ; i<n- j -1;i++){
     if(arr[i+1] <arr[i] ){
         int temp = arr[i+1];
         arr[i+1] = arr[i];
         arr[i] = temp;
     }
    }
}

    System.out.println("\n Array after sorting  ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
        }

}
}