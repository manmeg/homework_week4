package java_homework_week4_manish;

import java.util.Scanner;

/**
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

public class MinAndMaxInputChallenge_2 {

    public static void main(String[] args) {
        Mani();
    }

        public static void Mani(){
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        while (true) {
            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            } else {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Max = " + max + " and = " + min);
        scanner.close();
    }
}