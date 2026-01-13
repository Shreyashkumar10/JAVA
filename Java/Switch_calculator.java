import java.util.Scanner;

public class Switch_calculator{
    public static  void main( String arg[]   ){
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Welcome to the calculator ");
        System.out.println( " Enter the 2 numbers to be operated " ); 
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println( " select the operation to be performed  ");
        System.out.println(  " 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Modulus ");
        int key = sc.nextInt(); 
        
        switch (key) {
            case 1:
                        System.out.println(" The sum is  " + (a + b) );

                break;

            case 2 : 
                        System.out.println(" The Difference is " + (a - b) );
            break;

            case 3: 
                        System.out.println(" The product is " + (a * b) );
            break;
            
            case 4:
                        if (b == 0) {
                            System.out.println(" Division by zero is not allowed.");
                        } else {
                            System.out.println( " The quotient is " + (a / b) );
                        }
            break;

            case 5 :
                        if (b == 0) {
                            System.out.println(" Modulus by zero is not allowed.");
                        } else {
                            System.out.println( " The modulus is " + (a % b) );
                        }
            break;

            default:
                System.out.println(" Invalid selection.");
                break;
        }
       sc.close();
    }
}