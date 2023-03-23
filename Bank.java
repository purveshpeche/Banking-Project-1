package com.bank_application;

import java.util.Scanner;

public class Bank {


	    public static void main(String[] args) {
	        // create scanner object to get user input
	        Scanner scanner = new Scanner(System.in);

	        // define correct user name and account number
	        String correctUsername = "purvesh";
	        int correctAccountNumber = 123456;

	        // get user name and account number from user input
	        System.out.print("Enter your user name: ");
	        String username = scanner.nextLine();
	        System.out.print("Enter your account number: ");
	        int accountNumber = scanner.nextInt();
	        scanner.nextLine(); // consume the remaining newline character

	        // check if user name and account number are correct
	        if (username.equals(correctUsername) && accountNumber == correctAccountNumber) {
	            System.out.println("Welcome to your bank account!");

	            // loop until user chooses to exit
	            boolean exit = false;
	            double balance = 1000; // initial balance is $1000
	            while (!exit) {
	                // display menu of bank operations
	                System.out.println("Choose an option:");
	                System.out.println("1. Check balance");
	                System.out.println("2. Deposit");
	                System.out.println("3. Withdraw");
	                System.out.println("4. Exit");

	                // get user's choice from input
	                int choice = scanner.nextInt();
	                scanner.nextLine(); // consume the remaining newline character

	                // perform the chosen operation
	                switch (choice) {
	                    case 1:
	                        System.out.println("Your balance is: $" + balance);
	                        break;
	                    case 2:
	                        System.out.print("Enter the amount to deposit: $");
	                        double depositAmount = scanner.nextDouble();
	                        scanner.nextLine(); // consume the remaining newline character
	                        balance += depositAmount;
	                        System.out.println("Deposit successful. Your balance is now: $" + balance);
	                        break;
	                    case 3:
	                        System.out.print("Enter the amount to withdraw: $");
	                        double withdrawAmount = scanner.nextDouble();
	                        scanner.nextLine(); // consume the remaining newline character
	                        if (withdrawAmount > balance) {
	                            System.out.println("Insufficient balance. Withdrawal cancelled.");
	                        } else {
	                            balance -= withdrawAmount;
	                            System.out.println("Withdrawal successful. Your balance is now: $" + balance);
	                        }
	                        break;
	                    case 4:
	                        exit = true;
	                        System.out.println("Goodbye!");
	                        break;
	                    default:
	                        System.out.println("Invalid choice. Please choose again.");
	                        break;
	                }
	            }
	        } else {
	            System.out.println("Invalid user name or account number. Access denied.");
	        }
		    scanner.close();
	    }
		

	}
