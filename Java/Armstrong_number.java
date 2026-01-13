import java.util.*;

public class  Armstrong_number{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

       System.out.println(" Enter the number to check  Armstrong number");
       int a = input.nextInt();
       int num = a;
        int dig = 0;

       while (  a !=0 ){
          //  a = a%10;
            dig++;
            a = a/10;
                //System.out.println(" \n   a = " + a)  ;
       }

         System.out.println("\n  The digits " + dig)  ;
       int temp = num;
         int sum=0;
         while ( temp!= 0) { 
                int last = temp %10;
                sum = sum + (int)Math.pow( last ,dig );
                 System.out.println(" \n The Sum " + sum )  ;    
                temp = temp/10;
                    
                }
                System.out.println(" \n The Sum " + sum )  ;

                if (sum == num) {
                        System.out.println(" The number is armstrong ");
                }
            else
            {
                  System.out.println(" The number is NOT armstrong ");
            }



    }
}