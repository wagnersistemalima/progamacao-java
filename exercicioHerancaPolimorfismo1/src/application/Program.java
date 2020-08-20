package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> lista = new ArrayList<Product>();
		
		System.out.print("Enter the number of products: ");
		int quantity = sc.nextInt();
		
		for (int i=1; i<=quantity; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char resposta = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (resposta == 'i') {
				System.out.print("Customs fee: ");
				double customsFree = sc.nextDouble();
				lista.add(new ImportedProduct(name, price, customsFree));
			}
			
			else if (resposta == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				lista.add(new UsedProduct(name, price, manufactureDate));
			}
			
			else {
				lista.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product emp: lista) {
			System.out.println(emp.priceTag());
		}
		
		
		sc.close();
	}

}
