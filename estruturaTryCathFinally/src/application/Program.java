package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {		// File --> abrir um arquivo texto no local indicado

		File file = new File("C:\\Users\\wagne\\Documents\\Linguagem java\\ws-eclipse2\\in.txt");
		Scanner sc = null;                              // iniciar o scanner nulu
		
		try {														
			sc = new Scanner(file);										// abre o arquivo txt e mostra na tela
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		
		catch (IOException e) {											// pega a exe��o caso o arquivo n�o exista
			System.out.println("Error opening file: " + e.getMessage());
		} 
		
		finally {							// independente ou nao de ter dado certo fechar o scanner
			
			if (sc != null) {					
				sc.close();
			}
			System.out.println("Finally block executed!");
		}

	}

}
