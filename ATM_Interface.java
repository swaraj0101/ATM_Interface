
//import required classes and packages   
import java.util.*;

//create ATM_Interface class to implement the ATM functionality  
public class ATM_Interface {
    // main method starts
    public static void main(String args[]) {
        // declare and initialize balance, withdraw, and deposit
        int balance = 100000, withdraw, deposit, transfer;
        int Pin, i;

        // create scanner class object to get choice of user
        Scanner sc = new Scanner(System.in);

        //Enter user Pin Number
        System.out.println("Enter Your Pin");
        
        for (i = 0; i <= 5; i++) {
            System.out.print("Pin:");
            Pin = sc.nextInt();

            if (Pin <= 999999 && Pin >= 100000) {
                System.out.println("Your Pin is Correct");

                System.out.println("WELCOME TO YOUR ATM");
                while (true) {
                    
                    System.out.println("Choose 1 for Withdraw");
                    System.out.println("Choose 2 for Deposit");
                    System.out.println("Choose 3 for Check Balance");
                    System.out.println("Choose 4 for Transfer");
                    System.out.println("Choose 5 for QUIT");
                    System.out.print("Choose the operation you want to perform:");

                    // get choice from user
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter money to be withdrawn:");

                            // get the withdrawl money from user
                            withdraw = sc.nextInt();

                            // check whether the balance is greater than or equal to the withdrawal amount
                            if (balance >= withdraw) {
                                // remove the withdrawl amount from the total balance
                                balance = balance - withdraw;
                                System.out.println("Please collect your money");
                            } else {
                                // show custom error message
                                System.out.println("Insufficient Balance");
                            }
                            System.out.println("");
                            break;

                        case 2:

                            System.out.print("Enter money to be deposited:");

                            // get deposite amount from te user
                            deposit = sc.nextInt();

                            // add the deposit amount to the total balanace
                            balance = balance + deposit;
                            System.out.println("Your Money has been successfully depsited");
                            System.out.println("");
                            break;

                        case 3:
                            // displaying the total balance of the user
                            System.out.println("Balance : " + balance);
                            System.out.println("");
                            break;

                            case 4:
                            System.out.print("Enter your Transfer Ammount:");

                            // get the withdrawl money from user
                            transfer = sc.nextInt();

                            // check whether the balance is greater than or equal to the withdrawal amount
                            if (balance >= transfer) {
                                // remove the withdrawl amount from the total balance
                                balance = balance - transfer;
                                System.out.println("Money Transfer sucessfull");
                            } else {
                                // show custom error message
                                System.out.println("Insufficient Balance");
                            }
                            System.out.println("");
                            break;

                        case 5:
                            // exit from the menu
                            System.out.println("\nTHANK YOU\n");
                            System.exit(0);
                    }
                }
            } else {
                System.out.println("Your Pin is INCORRECT !! ");
                System.out.println("Please Enter  Six Digit Pin...");
            }

        }

        System.out.println(" Now you are EXIT . \n Check After Some Time");

    }

}
