package numeros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numeros {
	public static void main(String[] args) {
		
		double num1;
		double num2;
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println("Primeiro número: ");
			num1 = entrada.nextDouble();
			
			System.out.println("Segundo número: ");
			num2 = entrada.nextDouble();
			
			if (num2 == 0) {
                throw new ArithmeticException("ERRO! divisão por zero");
            }
			
			double resultado = num1/num2;
			System.out.println("Resultado: " + resultado);

		}
		catch (InputMismatchException e) {
			System.out.println("ERRO! entrada inválida.");
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		entrada.close();
		
	}
}
