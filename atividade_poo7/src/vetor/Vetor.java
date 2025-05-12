package vetor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
		
		int inteiro;
		int cont = 0;
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[10];
		
		try {
			while (true) {
				System.out.println("Numero: ");
				inteiro = entrada.nextInt();
				
				vetor[cont] = inteiro;
				cont++;
				
				if(inteiro == 0) {
					break;
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ERRO o limite foi atingido.");
		}
		catch (InputMismatchException e) {
			System.out.println("ERRO erro no tipo do valor");
		}
		
		System.out.println("\nInteiro: ");
		for (int i = 0; i < cont && i < vetor.length; i++) {
            System.out.println("Posição [" + i + "]: " + vetor[i]);
        }
		
	}
}
