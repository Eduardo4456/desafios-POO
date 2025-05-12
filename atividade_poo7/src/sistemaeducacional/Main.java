package sistemaeducacional;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		try {
			Triangulo triangulo = new Triangulo(4, 5, 8);
			triangulo.setL1(10);
		}
		catch (DimensoesInvalidasException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("\nTriangulo: ");
			
			System.out.println("Primero lado: ");
			double lado1 = entrada.nextDouble();
			
			System.out.println("Segundo lado: ");
			double lado2 = entrada.nextDouble();
			
			System.out.println("Terceiro lado: ");
			double lado3 = entrada.nextDouble();
			
			Triangulo triangulo2 = new Triangulo(lado1, lado2, lado3);
			
			System.out.println("Triângulo criado: "
					+ "[" + triangulo2.getL1() + "]" 
					+ ", [" + triangulo2.getL2() + "]"
					+ ", [" + triangulo2.getL3() + "]");
		}
		catch (DimensoesInvalidasException e) {
			System.out.println(e.getMessage());
		}
	}
}
