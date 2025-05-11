/******************************************************************
 * Compound Interest Calculator                                   *
 * This program calculates the amount of money in a savings       *
 * account after a specified number of years, using the formula   *
 * for compound interest. It displays the final amount in the     *
 * account based on user inputs.                                  *
 ******************************************************************/

import java.util.Scanner;

public class CompoundInterestCalculator {

    /**************************************************************
     * Main Method                                                *
     * Prompts the user for the principal, interest rate, number  *
     * of times interest is compounded, and the number of years, *
     * then calculates the total amount in the account.           *
     **************************************************************/
    public static void main(String[] args) {

        //*********************************************************
        // Variable Declarations                                  *
        // To store user input and calculated values              *
        //*********************************************************
        double principal;                     // Principal amount
        double annualInterestRate;            // Annual interest rate
        int timesCompounded;                  // Number of times compounded per year
        int years;                            // Number of years money is left to earn interest
        double amountInAccount;               // Final amount in the account

        //*********************************************************
        // Input Section                                          *
        // Prompting the user for all necessary information       *
        //*********************************************************
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter the principal amount: $");
        principal = keyboardInput.nextDouble();

        System.out.print("Enter the annual interest rate (as %): ");
        annualInterestRate = keyboardInput.nextDouble();

        System.out.print("Enter the number of times the interest is compounded per year: ");
        timesCompounded = keyboardInput.nextInt();

        System.out.print("Enter the number of years the money will be left to earn interest: ");
        years = keyboardInput.nextInt();


        //*********************************************************
        // Calculation Section                                    *
        // Apply the compound interest formula                    *
        // A = P(1 + r/n)^(nt)                                   *
        //*********************************************************
        annualInterestRate /= 100; // Convert percentage to decimal
        amountInAccount = principal * Math.pow((1 + annualInterestRate / timesCompounded), (timesCompounded * years));

        //*********************************************************
        // Output Section                                         *
        // Display the calculated final amount in the account     *
        //*********************************************************
        System.out.println();
        System.out.printf("%-40s $%.2f\n", "Amount of money in the account:", amountInAccount);

        //*********************************************************
        // Developer Credit                                       *
        //*********************************************************
        System.out.println();
        System.out.println("Developed by: Nikita Baiborodov");

        //*********************************************************
        // Resource Cleanup                                       *
        // Close the scanner to prevent resource leaks            *
        //*********************************************************
        keyboardInput.close();
        System.exit(0);
    }
}

