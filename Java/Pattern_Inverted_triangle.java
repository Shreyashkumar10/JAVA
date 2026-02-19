import java.util.Scanner;

public class Pattern_Inverted_triangle {

 public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the number  ");
        int num = sc.nextInt();

        for ( int i =num ;i> 0  ;i--) {
              for(int j = 0 ; j < i ;j++  ){
                   System.out.print(" * ");
                    //System.out.print("  " +i +"  " +j);
            }
             System.out.println(" \n");
        }

    }    
    

}
