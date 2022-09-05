/*Write a program to sum of user input until users input ‘q’ from keyboard*/

import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        int sum = 0;
        char ch;
        System.out.println("Input a number");
        Scanner input = new Scanner(System.in);
        do {

            sum += input.nextInt();
            System.out.println(sum);
            System.out.println("Do you want to continue?");
            ch = input.next().charAt(0);
        }
        while (ch != 'q');
    }
}





