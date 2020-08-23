package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		
		System.out.print("Enter the number of tax payers: ");
		int number = sc.nextInt();
		
		for (int i=1; i<=number; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char response = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (response == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
			
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployee = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployee));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double sume = 0.0;
		for (TaxPayer tmp: list) {
			System.out.println(tmp.getName() + ": $ " + String.format("%.2f", tmp.tax()));
			sume += tmp.tax();
					
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sume);
		
		sc.close();
	}

}
