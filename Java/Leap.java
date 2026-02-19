import java.util.*;

public class Leap{
    public  static void main( String arug [] ){

        Scanner a = new Scanner(System.in);
        System.out.println(" Enter the  year to check if it is leap year or not " );

        int year = a.nextInt();

        if (year %4 ==0 && year%100!=0 ) {
            System.out.println(" The year " + year + " is a leap year " );
        }
        else if (year/400==0   ) {
                System.out.println(" The year " + year + " is a leap year " );
        }
        else{
            System.out.println(" The year " + year + " is not a leap year " );
        }


    }
}
