/*Write a program to check balance Deposit and withdraw money from ATM booth*/

import java.util.Scanner;
public class Atm_transaction {
    public static void main(String args[] )
    //Assuming user has a fixed balance
    {
        int balance = 5000, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = s.nextInt();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    //displaying available balance after withdrawing
                    {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully depsited");
                    System.out.println("");
                    break;

                case 3:
                    //displaying available balance
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
