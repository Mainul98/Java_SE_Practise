/*Write a program sum of even numbers*/

import java.util.Scanner;

public class Sum100Number {
    private static Scanner sc;
    public static void main(String[] args)
    {
        int number, i, evenSum = 0;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter any Number : ");
        number = sc.nextInt();

        for(i = 2; i <= number; i = i + 2)
        {
            evenSum = evenSum + i;
        }
        System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
    }
}