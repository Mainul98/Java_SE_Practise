/*Write a program by using switch case for coffee and tea shop*/

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Tea & Coffee vending machine\n" +
                "Input 1:Tea\n"+
                "Input 2: Coffee");
        System.out.println("Your input: ");
        int num = input.nextInt();

        switch (num){
            case 1:
                System.out.println("Preparing your Tea...\n"+
                        "Here is your Tea.\n"+
                        "Have a nice drink!");
                break;
            case 2:
                System.out.println("Preparing your Coffee...\n"+
                        "Here is your Coffee.\n"+
                        "Have a nice drink!");
            default:
                System.out.println("Your input is wrong");
        }
    }
}
