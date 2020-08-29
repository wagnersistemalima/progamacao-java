package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainExceptions;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		account.withdraw(amount);
		
		System.out.println();
		System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
		
		}
		catch (DomainExceptions e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Error input");
		}
		
		sc.close();
	}

}
