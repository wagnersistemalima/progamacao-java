package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1010, "Wagner Lima", 0.0);
		
		BusinessAccount bacc = new BusinessAccount(1110, "Sistema Lima", 0.0, 500.00);
		
		// Upcasting
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1111, "Sistema Silva", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1210, "Maria", 0.0, 0.01);
		
		// Dowcasting   // nem sempre vai dar certo, e o compilador na� avisa. so mostra na execu��o a exce��o
		
		BusinessAccount acc4 = (BusinessAccount)acc2;  // tem que fazer o cast()
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount) acc3;      // erro acc3 foi instanciada savingsAccount
		
		
			// como evitar este tipo de erro. instanceOf
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc6 = (BusinessAccount) acc3;
			acc6.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc6 = (SavingsAccount) acc3;
			acc6.updateBalance();
			System.out.println("Update!");
		}
		
		System.out.println();
		System.out.println("-------------------");
		
		Account acc7 = new Account(1515, "Jo�o", 1000.00);
		acc7.withDraw(200.00);
		System.out.println(acc7.getBalance());
		System.out.println("-----------------");
		
		// Upcasting
		
		Account acc8 = new SavingsAccount(5454, "Maria", 1000.0, 0.01);
		acc8.withDraw(200.00);
		System.out.println(acc8.getBalance());
		
		System.out.println("-----------------");
		
		Account acc9 = new BusinessAccount(6454, "Carlos", 1000.0, 500.0);
		acc9.withDraw(200.0);
		System.out.println(acc9.getBalance());
		
	}

}
