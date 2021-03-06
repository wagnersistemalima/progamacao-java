package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Account> lista = new ArrayList<Account>();
		
		lista.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		lista.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		lista.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
		lista.add(new BusinessAccount(1005, "Ana", 500.0, 500.0));
		
		double soma = 0.0;
		for (Account ac: lista) {
			soma += ac.getBalance();
		}
		
		System.out.printf("Total balance %.2f%n", soma);
		
		for (Account acc: lista) {
			acc.deposit(10.0);
		}
		
		for (Account acc: lista) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
		sc.close();
		

	}

}
