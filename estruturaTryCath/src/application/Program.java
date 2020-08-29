package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			
			String[] vect = sc.nextLine().split(" ");                          // .split(" ") pega varios dados separado por espa�o	
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {							// tratamento exe��o
			System.out.println("Invalid position!");
			e.printStackTrace();									// mostra o caminho da exe��o e.printStackTrace
		}
		catch (InputMismatchException e) {
			System.out.println("Input erro!");
			e.printStackTrace();
		}
		
		System.out.println("End of program");
		
		sc.close();
	}

}
