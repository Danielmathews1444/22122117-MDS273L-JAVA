import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class lab4 {
    // Define a Scanner object for input
    static Scanner obj = new Scanner(System.in);

    // Declare global variables
    static int AccNumber;
    static String AccHolderName;
    static float AccBalance;

    // Function to get customer information
    static void cust() {
        // Prompt the user to enter their account number and read in the input
        System.out.print("Enter your account number : ");
        AccNumber = Integer.parseInt(obj.nextLine());

        // Prompt the user to enter their name and read in the input
        System.out.print("\nEnter your name : ");
        AccHolderName = obj.nextLine();

        // Prompt the user to enter their account balance and read in the input
        System.out.print("\nEnter your account balance : ");
        AccBalance = Float.parseFloat(obj.nextLine());
    }

    // Function to get the current timestamp
    static String timeStamp() {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Define the format for the timestamp
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

        // Format the date and time using the defined format
        String timestamp = now.format(formatter);
        return timestamp;
    }

    // Function to process a deposit transaction
    static String deposit() {
        // Prompt the user to enter the amount to be deposited and read in the input
        System.out.print("Enter the amount to be deposited : ");
        float amt =  Float.parseFloat(obj.nextLine());

        // Add the deposited amount to the account balance
        AccBalance += amt;

        // Return a success message
        return amt + " || Successful";
    }

    // Function to process a withdrawal transaction
    static String witdraw() {
        // Prompt the user to enter the amount to be withdrawn and read in the input
        System.out.print("Enter the amount to be withdrawn : ");
        float am =  Float.parseFloat(obj.nextLine());

        // Check if the withdrawal amount is greater than the account balance
        if (am > AccBalance) {
            // If the withdrawal amount is greater than the account balance, return a failure message
            System.out.println("INSUFFICIENT BALANCE");
            return am + " || Declined";
        } else {
            // If the withdrawal amount is less than or equal to the account balance, deduct the amount from the account balance and return a success message
            float bal= AccBalance;
            AccBalance -= am;
            return am + " || Successful";
        }
    }

    // Function to display the transaction history
    static void transaction(String[][] tran, int ctrl) {
        // Print the transaction history table header
        System.out.println(" *********************************TRANSACTION HISTORY********************************");
        System.out.println(" ||       TIME STAMP        || BALANCE ||   TYPE   || AMOUNT ||  STATUS   || BALANCE ||");

        // If there are no transactions, print a message
        if (ctrl == 0) {
            System.out.print("No transactions yet");
        }

        // Print each transaction in the transaction history table
        for (int i = 0; i < ctrl; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" || " + tran[i][j]);
            }
            System.out.print(" || ");
            System.out.println();
        }

        // Print the transaction history table footer
        System.out.println(" ******************************************************************************");
    }

    static void summary() {
        System.out.println("Account number: " + AccNumber);
        System.out.println("Account holder name: " + AccHolderName);
        System.out.println("Account balance: " + AccBalance);
    }

    // Define the main function
public static void main(String[] args){
    // call the cust() method to get customer information
    cust();
    // create a 2D array to store transaction history
    String[][] tran = new String[1024][5];
    // initialize a counter variable for transaction history array
    int ctrl = 0;
    // initialize a control variable for the do-while loop
    int loopCtrl = 0;
    do{
        // display menu options
        System.out.println("Welcome to the Cooperative Bank");
        System.out.println("please enter your choice");
        System.out.println(" 1--> Deposit\n 2--> Withdrawal\n 3-->Transaction history\n 4--> Account Summary");
        // create an array to store transaction information
        String[] arr= new String[5];
        // get user choice
        int choice = Integer.parseInt(obj.nextLine());
        // switch statement for menu options
        switch(choice){
            case 1:
                // if user chooses deposit, record the transaction in the transaction history array
                tran[ctrl][0] = timeStamp();
                tran[ctrl][1] = AccBalance+"";
                tran[ctrl][2] = "DEPOSIT   ";
                tran[ctrl][3] = deposit();
                tran[ctrl][4] = AccBalance+"";
                // increment the counter for the transaction history array
                ctrl++;
                break;
            case 2:
                // if user chooses withdrawal, record the transaction in the transaction history array
                tran[ctrl][0] = timeStamp();
                tran[ctrl][1] = AccBalance+"";
                tran[ctrl][2] = "WITHDRAWAL";
                tran[ctrl][3] = witdraw();
                tran[ctrl][4] = AccBalance+"";
                // increment the counter for the transaction history array
                ctrl++;
                break;

            case 3:
                // if user chooses transaction history, call the transaction() method to display the transaction history
                transaction(tran,ctrl);
                break;
            case 4:
                // if user chooses account summary, call the summary() method to display account summary
                System.out.println("*****ACCOUNT SUMMARY*****");
                summary();
                break;                      
        }
    // ask user if they want to continue or exit
    System.out.println("Enter 0 to continue\n enter any nuber to exit");
    loopCtrl = Integer.parseInt(obj.nextLine());   
    }while(loopCtrl==0);
} 
}

