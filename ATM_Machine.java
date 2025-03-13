import java.util.Scanner;

import javafx.scene.control.Menu;

// class ATM {

// }

public class ATM_Machine {

    float balance;
    int Pin = 786;

    public void checkPin() {

        System.out.println("please enter the ATM PIN.");
        Scanner sc = new Scanner(System.in);
        int EnterPin = sc.nextInt();

        if (EnterPin == Pin) {
            menu();
        } else {
            System.out.println("please enter the correct PIN.");
        }

    }

    public void menu() {
        System.out.println("Please select your choice below");
        System.out.println("1. Balance Enquiry");
        System.out.println("2. Cash Deposite");
        System.out.println("3. Cash Withdraw ");
        System.out.println("4 . Exit ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        // if (choice == 1) {
        // Balance_Enquiry();
        // }

        switch (choice) {
            case 1:
                Balance_Enquiry();
                break;

            case 2:
                Cash_Deposite();
                break;

            case 3:
                Cash_withdraw();
                break;

            case 4:
                System.out.println("you has been exit successfully...");
                return;
            // break;

            default:
                System.out.println("Invalid Choice");
                break;
        }

    }

    public void Balance_Enquiry() {
        System.out.println("Your Current Balance is : " + balance);
        menu();
    }

    public void Cash_Deposite() {
        System.out.println("please enter the Deposite Amount...");
        Scanner sc = new Scanner(System.in);
        float Deposite_money = sc.nextFloat();
        balance = Deposite_money;
        menu();
    }

    public void Cash_withdraw() {
        System.out.println("Please the enter your withdraw amount..");
        Scanner sc = new Scanner(System.in);
        float withdraw_amt = sc.nextFloat();
        if (withdraw_amt > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - withdraw_amt;
            System.out.println("Amount withdraw successfully");
        }
        menu();
    }

    public static void main(String[] args) {
        ATM_Machine run = new ATM_Machine();
        run.checkPin();
    }
}