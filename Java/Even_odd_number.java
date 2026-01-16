import java.util.Scanner;

public class Even_odd_number {
 
    public  static  void main( String arg[] ){

System.out.println(" Enter the number to check whether i ts even or odd ");

    try (Scanner sc = new Scanner(System.in)) {
        int a =  sc.nextInt();

        if (  a % 2 ==0 ) {
             System.out.println(" The given number is  even  " );
        }
        else{
          System.out.println(" The given number is  odd  " );   
        }
    }
    }

}
