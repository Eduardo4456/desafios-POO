package idade;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		ArrayList<Integer> idades = new ArrayList<>();
		int idade;
		int posicao;
		int valor;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Idade [" + i + "]: ");
			try {
				idade = entrada.nextInt();
				idades.add(idade);
			}
			catch (InputMismatchException e) {
				System.out.println("ERRO entrada inválida!");
			}
		}
		
		System.out.println("\nRemova uma posição entre 9 e 0: ");
		try {
			posicao = entrada.nextInt();
			valor = idades.remove(posicao);
			System.out.println("Valor " + valor + " posição [" + posicao + "]");
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("ERRO posi��o invalida!");
		}
		catch (InputMismatchException e) {
			System.out.println("ERRO entrada invalida!");
		}
		
		System.out.println("\nLista: " + idades);
	}
}
