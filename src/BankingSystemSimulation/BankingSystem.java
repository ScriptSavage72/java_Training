package BankingSystemSimulation;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the XYZ Banking System!");
        double balance = 0;
        int input = 0;
        do {
            System.out.println("Please choose an option: ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            switch(input = scan.nextInt()){
                case 1:
                    System.out.println("your current balance is: " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scan.nextDouble();
                    balance += deposit;
                    System.out.println(deposit + " has been deposited into your account.");
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    double withdraw = scan.nextDouble();
                    if(withdraw > balance){
                        System.out.println("You cannot withdraw more than your account balance of "+ balance);
                    }else{
                        balance -= withdraw;
                        System.out.println(withdraw + " has been withdrawn from your account.");
                    }
                    break;

            }
        }while(input != 4);
        System.out.println("Thank you for baking with XYZ banking!");
    }
}
