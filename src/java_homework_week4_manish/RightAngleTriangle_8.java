package java_homework_week4_manish;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class RightAngleTriangle_8
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        java();
    }
        public static void java(){

        System.out.print("Enter Right Angled Triangle Pattern Rows = ");
        int rows = sc.nextInt();

        System.out.println("Printing Right Angled Triangle Pattern of @");
        int i = 1, j ;

        while( i <= rows )
        {
            j = 1 ;
            while(j <= i )
            {
                System.out.print("@");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
