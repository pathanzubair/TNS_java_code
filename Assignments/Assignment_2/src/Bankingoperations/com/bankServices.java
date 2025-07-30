package Bankingoperations.com;

import java.util.Scanner;

public class bankServices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double balance = 10000;

        while (true) {
            System.out.println("\n******************** SERVICES ********************");
            System.out.println("1. Balance Inquiry");
            System.out.println("2. Cash Withdrawal");
            System.out.println("3. Cash Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("************************************");
                    System.out.println("Bank balance = ₹" + balance);
                    System.out.println("************************************");
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. Remaining balance = ₹" + balance);
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposit successful. Updated balance = ₹" + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using our banking services!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("!!! Invalid choice. Please try again !!!");
            }
        }
    }
}