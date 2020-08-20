package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> lista = new ArrayList<Shape>();
		
		System.out.print("Enter the number of shapes: ");
		int number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char resposta = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			System.out.print("Width: ");
			if (resposta == 'r') {
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				lista.add(new Rectangle(color, width, height));
			}
			else if (resposta == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				lista.add(new Circle(color, radius));
			}
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		
		for (Shape sh: lista) {
			System.out.printf("%.2f%n", sh.area());
		}
		
		
		sc.close();
	}

}
